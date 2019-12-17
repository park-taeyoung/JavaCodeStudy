package com.kakao.work;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kakao.dto.InfoVo;

import au.com.bytecode.opencsv.CSVWriter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })

// java = class ����
public class MySQLConnectionTest {

	// �������� ����
	@Inject
	private DataSource ds;

	// method ���� testConnection
	// throws Exception ����ó�� : ���ܰ� �߻��ϸ� testConnection �� ȣ���� ������ ����
	// throw Exception ����ó�� : ���ܰ� �߻��ϴ��� �� method �ȿ��� ó��
	@Test
	public void testConnection() throws Exception {
		// List �迭 ���� ���� <InfoVo>��� Ű��� Ű �� ���·� ����.
		List<InfoVo> infoList = null;

		// ��ü ����
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// StringBuffer ���ڿ� ���̴� ���
		StringBuffer sbQuery = new StringBuffer();
		sbQuery.append("SELECT A.USR_NO");
		sbQuery.append("    , A.LOG_TKTM");
		sbQuery.append("    , A.LOG_ID");
		sbQuery.append("    , A.MENU_NM");
		sbQuery.append("    , CASE WHEN A.MENU_NM = \"logout\" THEN 0 ELSE A.RETAIN_TIME END AS DIFF_TIME");
		sbQuery.append("  FROM (SELECT T1.USR_NO");
		sbQuery.append("            , T1.LOG_TKTM");
		sbQuery.append("            , T1.LOG_ID");
		sbQuery.append("            , T1.MENU_NM");
		sbQuery.append("            , TIMESTAMPDIFF(SECOND, DATE_FORMAT(T1.LOG_TKTM, '%Y-%m-%d %H:%i:%S'), DATE_FORMAT(T3.LOG_TKTM, '%Y-%m-%d %H:%i:%S')) AS RETAIN_TIME");
		sbQuery.append("         FROM (SELECT *, ROW_NUMBER() OVER (ORDER BY LOG_TKTM) AS ROW_NUM FROM KAKAOBANK.MENU_LOG) AS T1");
		sbQuery.append("               LEFT JOIN (SELECT *, ROW_NUMBER() OVER (ORDER BY LOG_TKTM) AS ROW_NUM FROM KAKAOBANK.MENU_LOG) AS T3 ON T1.ROW_NUM = T3.ROW_NUM-1");
		sbQuery.append("          WHERE T1.USR_NO IN ('001', '002' , '003')");
		sbQuery.append("        ) AS A ");
		sbQuery.append(" ORDER BY A.USR_NO, A.LOG_ID");

		// ���ܰ� �߻��ϸ� ó�� �ϰڴ�.
		try {

			/************* ���� ����� list�� ��ȯ **********/
			conn = ds.getConnection();
			pstmt = (PreparedStatement) conn.prepareStatement(sbQuery.toString());

			rs = pstmt.executeQuery();
			
			// ����ٰ� �������� list ���·� ��´�.
			infoList = new ArrayList<InfoVo>();
			
			// ���� ������� �ݺ��Ѵٴ� ��.
			// getString �ϸ� ���� ������� ������
			while (rs.next()) {
				// ����Ʈ�� map�� �־�� ��.
				// InfoVo�� �� ��ġ�� ���� ������ ���� ��� ù��°�� ���� ���� ���� ���� ����.
				InfoVo chat = new InfoVo();
				chat.setUsrNo(rs.getString("USR_NO"));
				chat.setLogTktm(rs.getString("LOG_TKTM"));
				chat.setLogId(rs.getString("LOG_ID"));
				chat.setMenuNm(rs.getString("MENU_NM"));
				chat.setDiffTime(Integer.valueOf(rs.getString("DIFF_TIME")));
				// ����Ʈ�� ���ٷ� �� �־��ִ°�
				infoList.add(chat);
			}

			/************* ����� ������ ���� **********/
			// ���� ������ �ִ°�
			// menuList ���� ����
			// List �ֻ���, ArrayList�� List�� ��ӹ޴� ����.
			// ���� ����Ʈ�� ������� ���� ������ ��.
			List<InfoVo> menuList = new ArrayList<InfoVo>();
			
			// ���� ����
			String menu = "";
			int time = 0;

			// ���� ��������� for��
			// 0������ ������ index�� 0���� ������ ��. get(0) ����� ���� �Ͱ� ����
			for (int i = 0; i < infoList.size(); i++) {
				// login-�޴�1-�޴�2-�޴�3-logout ���·� �ٿ� ������.
				menu += infoList.get(i).getMenuNm() + "-";
				// �ð��� ���Ѵ�.
				time += infoList.get(i).getDiffTime();

				// �ǹ�
				// logout ������ ������
				if ("logout".equals(infoList.get(i).getMenuNm())) {
					InfoVo rtnMap = new InfoVo();
					rtnMap.setUsrNo(infoList.get(i).getUsrNo());
					rtnMap.setMenuNm(menu.substring(0, menu.length() - 1)); // ������ '-' ����
					rtnMap.setDiffTime(time);
					
					// usrNo�� menuNm�̶� ���ļ� key ����
					rtnMap.setKey(infoList.get(i).getUsrNo() + "||" + menu.substring(0, menu.length() - 1));
					rtnMap.setCnt(1); // �ʱⰪ ������ �����ָ� �ؿ��� null ����Ʈ �ͼ��� ���� �� ����
					menuList.add(rtnMap);

					menu = ""; // list�� ��ұ� ������ �ʱ�ȭ����
					time = 0;
				}
			}

			/****** ����� �����ͷ� ���� *******/
			// Map�� �ֻ����� HashMap�� Map�� ��ӹ޴� ��
			// ������ key�� �÷��� �÷����� ���� resultMap ���� ����
			Map<String, InfoVo> resultMap = new HashMap<String, InfoVo>();
			
			// �� for���� sql���� group by �� �ش�
			for (int i = 0; i < menuList.size(); i++) {
				// ������ key ������ ���������� 
				String key = menuList.get(i).getKey();
				// resultMap�� Ȯ���� �Ѵ�.
				// containsKey�� ���� ���� �ϴ��� ã�� �Լ���.boolean type
				if (resultMap.containsKey(key)) {
					// ã�ƺ��� �ߺ��� �ִٸ� count�� +1 �ϴ� ���̴�.
					// resultMap.get(key)�� �׿� ������ �°� ��� �ִ��� ã�°Ŵ�. �� ��ġ�� ���ٰ� �����ϸ� ��. �� ������ set(update)�� ���ش�. ���� �ִ��ſ� +1
					resultMap.get(key).setCnt(resultMap.get(key).getCnt() + 1);
					// DIffTime�� �����ִ°�.
					resultMap.get(key).setDiffTime(resultMap.get(key).getDiffTime() + menuList.get(i).getDiffTime());
				} else {
					// ������ ����ü �״�� �־��ش�.
					resultMap.put(key, menuList.get(i));
				}
			}

			// csv ������ ����� ���� ���� ����
			List<InfoVo> cvsList = new ArrayList<InfoVo>();
			// Iterator�� resultMap�� key�� �� �����ͼ� keys�� �ִ´ٴ� ��.
			Iterator<String> keys = resultMap.keySet().iterator();

			// Next�� While���� �Բ� ���� �����̴�.
			while (keys.hasNext()) {
				String key = keys.next();
				// key�� �´� value�� �־��ش�.
				cvsList.add(resultMap.get(key));
			}

			// resList = resultList
			// ���� ����
			List<InfoVo> resList = new ArrayList<InfoVo>();
			// Ư�� ����� 001, 002, 003 �� ���� �κ��ε�
			// ���� �ϵ��ڵ��� �ƴϰ� i < 4 ���� '4' �κи� ��ġ�� ��� ������ �����ָ�, ���� Ȱ�� �� �� �ִ�.
			for (int i = 1; i < 4; i++) {
				InfoVo cvsMap = new InfoVo();
				// "%03d" => 3�ڸ� '000' ����
				String usrNo = String.format("%03d", i);
				
				// �Ʒ� getTopMenu �Լ� ����
				cvsMap = getTopMenu(cvsList, String.format("%03d", i));
				
				// usrNo ���� ��� �ϴ� �־��ְ�
				cvsMap.setUsrNo(usrNo);
				
				// resList ���� �־� ��
				resList.add(cvsMap);
			}
			try {
				/**
				 * csv ������ �������� ���� ���� D:\\test.csv : csv ���������� ��ġ+���ϸ� EUC-KR : �ѱ۱��������� �����ϱ�����
				 * ���ڵ�����(UTF-8�� �������ٰ�� �ѱ۱���) ',' : �迭�� ���� ���ڿ� '"' : ���� �����ֱ����� ����
				 **/
				// lib �� �ִ� CSVWriter ���
				CSVWriter cw = new CSVWriter(new OutputStreamWriter(new FileOutputStream("D:\\test.csv"), "EUC-KR"),',', '"');
				try {
					// header �� ����
					cw.writeNext(new String[] { "����", "TOP1", "����" });
					
					// resList �о �� �Է�
					for (InfoVo m : resList) {
						// �迭�� �̿��Ͽ� row�� CSVWriter ��ü�� write
						cw.writeNext(new String[] { String.valueOf("'" + m.getUsrNo()), String.valueOf(m.getTop1menu()),
								String.valueOf(m.getTop1()), String.valueOf(m.getTop2menu()),
								String.valueOf(m.getTop2()), String.valueOf(m.getTop3menu()),
								String.valueOf(m.getTop3()) });
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					// ������ CSVWriter ��ü close
					cw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			// ������ ���� �ش� ���¸� Console�� ��°�.
			e.printStackTrace();

		// finally �� ������ �����ϴ°�
		} finally {
			try {
				if (rs != null)
					// �տ��� ������ �� ����. �ȴ����� ���� �޽��� ��
					rs.close();
				if (pstmt != null)
					// �տ��� ������ �� ����. �ȴ����� ���� �޽��� ��
					pstmt.close();
				if (conn != null)
					// �տ��� ������ �� ����. �ȴ����� ���� �޽��� ��
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// �� ����ں� top1 ~ top3 ���� ���ϴ� �Լ�
	public InfoVo getTopMenu(List<InfoVo> valList, String usrNo) {
		InfoVo rtnMap = new InfoVo();
		int top1 = 0;
		int top2 = 0;
		int top3 = 0;
		String top1Menu = "";
		String top2Menu = "";
		String top3Menu = "";
		
		// 001�� ���� 001�� ���Բ�. ��, ���� ������ ������
		for (int i = 0; i < valList.size(); i++) {
			if (usrNo.equals(valList.get(i).getUsrNo())) {
				// ó������ top1�� �־��ְ� top2�� top3�� ������ �о�� ��
				if (valList.get(i).getCnt() > top1) {
					top3 = top2;
					top2 = top1;
					top1 = valList.get(i).getCnt();
					top3Menu = top2Menu;
					top2Menu = top1Menu;
					top1Menu = valList.get(i).getMenuNm();
				} else if (valList.get(i).getCnt() > top2) {
					top3 = top2;
					top2 = valList.get(i).getCnt();
					top3Menu = top2Menu;
					top2Menu = valList.get(i).getMenuNm();
				} else if (valList.get(i).getCnt() > top3) {
					top3 = valList.get(i).getCnt();
					top3Menu = valList.get(i).getMenuNm();
				}
			}
		}
		
		// rtnMap = returnMap �Լ��� �������� ������ ������� �𸣴� ������ ����� �Ѵ�.
		rtnMap.setTop1(top1);
		rtnMap.setTop2(top2);
		rtnMap.setTop3(top3);
		rtnMap.setTop1menu(top1Menu);
		rtnMap.setTop2menu(top2Menu);
		rtnMap.setTop3menu(top3Menu);
		
		// rtnMap �� ������ ���� ���� �� ��
		// ���ٷ� �� �־��� ��.
		return rtnMap;
	}
}