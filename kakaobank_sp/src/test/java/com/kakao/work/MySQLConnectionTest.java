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

// java = class 파일
public class MySQLConnectionTest {

	// 지역번수 선언
	@Inject
	private DataSource ds;

	// method 생성 testConnection
	// throws Exception 예외처리 : 예외가 발생하면 testConnection 을 호출한 곳으로 보냄
	// throw Exception 예외처리 : 예외가 발생하더라도 이 method 안에서 처리
	@Test
	public void testConnection() throws Exception {
		// List 배열 변수 선언 <InfoVo>라는 키라는 키 값 형태로 쓴다.
		List<InfoVo> infoList = null;

		// 객체 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		// StringBuffer 문자열 붙이는 기능
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

		// 예외가 발생하면 처리 하겠다.
		try {

			/************* 쿼리 결과값 list로 변환 **********/
			conn = ds.getConnection();
			pstmt = (PreparedStatement) conn.prepareStatement(sbQuery.toString());

			rs = pstmt.executeQuery();
			
			// 여기다가 쿼리값을 list 형태로 담는다.
			infoList = new ArrayList<InfoVo>();
			
			// 쿼리 결과값을 반복한다는 뜻.
			// getString 하면 쿼리 결과값을 가져옴
			while (rs.next()) {
				// 리스트에 map을 넣어야 함.
				// InfoVo를 이 위치에 넣지 않으면 값이 계속 첫번째만 들어가고 누적 적재 되지 않음.
				InfoVo chat = new InfoVo();
				chat.setUsrNo(rs.getString("USR_NO"));
				chat.setLogTktm(rs.getString("LOG_TKTM"));
				chat.setLogId(rs.getString("LOG_ID"));
				chat.setMenuNm(rs.getString("MENU_NM"));
				chat.setDiffTime(Integer.valueOf(rs.getString("DIFF_TIME")));
				// 리스트에 한줄로 쭉 넣어주는거
				infoList.add(chat);
			}

			/************* 결과값 데이터 가공 **********/
			// 가공 데이터 넣는거
			// menuList 변수 생성
			// List 최상위, ArrayList는 List를 상속받는 변수.
			// 따로 리스트를 만들려고 새로 만들어야 함.
			List<InfoVo> menuList = new ArrayList<InfoVo>();
			
			// 변수 선언
			String menu = "";
			int time = 0;

			// 쿼리 결과값으로 for문
			// 0부터인 이유는 index가 0부터 시작을 함. get(0) 결과값 나온 것과 같음
			for (int i = 0; i < infoList.size(); i++) {
				// login-메뉴1-메뉴2-메뉴3-logout 형태로 붙여 나간다.
				menu += infoList.get(i).getMenuNm() + "-";
				// 시간은 더한다.
				time += infoList.get(i).getDiffTime();

				// 피벗
				// logout 나오면 마무리
				if ("logout".equals(infoList.get(i).getMenuNm())) {
					InfoVo rtnMap = new InfoVo();
					rtnMap.setUsrNo(infoList.get(i).getUsrNo());
					rtnMap.setMenuNm(menu.substring(0, menu.length() - 1)); // 마지막 '-' 제거
					rtnMap.setDiffTime(time);
					
					// usrNo랑 menuNm이랑 합쳐서 key 생성
					rtnMap.setKey(infoList.get(i).getUsrNo() + "||" + menu.substring(0, menu.length() - 1));
					rtnMap.setCnt(1); // 초기값 셋팅을 안해주면 밑에서 null 포인트 익셉션 나올 수 있음
					menuList.add(rtnMap);

					menu = ""; // list에 담았기 때문에 초기화해줌
					time = 0;
				}
			}

			/****** 출력할 데이터로 가공 *******/
			// Map이 최상위고 HashMap은 Map을 상속받는 것
			// 가공한 key에 컬럼과 컬럼값을 받을 resultMap 변수 생성
			Map<String, InfoVo> resultMap = new HashMap<String, InfoVo>();
			
			// 이 for문은 sql에서 group by 에 해당
			for (int i = 0; i < menuList.size(); i++) {
				// 가공한 key 변수에 넣은다음에 
				String key = menuList.get(i).getKey();
				// resultMap에 확인을 한다.
				// containsKey가 값이 존재 하는지 찾는 함수다.boolean type
				if (resultMap.containsKey(key)) {
					// 찾아보고 중복이 있다면 count를 +1 하는 것이다.
					// resultMap.get(key)가 쌓여 있으면 걔가 어디 있는지 찾는거다. 그 위치로 간다고 생각하면 됨. 그 다음에 set(update)을 해준다. 원래 있던거에 +1
					resultMap.get(key).setCnt(resultMap.get(key).getCnt() + 1);
					// DIffTime은 더해주는것.
					resultMap.get(key).setDiffTime(resultMap.get(key).getDiffTime() + menuList.get(i).getDiffTime());
				} else {
					// 없으면 그자체 그대로 넣어준다.
					resultMap.put(key, menuList.get(i));
				}
			}

			// csv 파일을 만들기 위한 변수 생성
			List<InfoVo> cvsList = new ArrayList<InfoVo>();
			// Iterator는 resultMap에 key만 다 가져와서 keys에 넣는다는 것.
			Iterator<String> keys = resultMap.keySet().iterator();

			// Next는 While문과 함께 가는 문법이다.
			while (keys.hasNext()) {
				String key = keys.next();
				// key에 맞는 value를 넣어준다.
				cvsList.add(resultMap.get(key));
			}

			// resList = resultList
			// 완전 최종
			List<InfoVo> resList = new ArrayList<InfoVo>();
			// 특정 사용자 001, 002, 003 에 대한 부분인데
			// 완전 하드코딩은 아니고 i < 4 에서 '4' 부분만 고치면 몇번 돌지만 정해주면, 어디든 활용 할 수 있다.
			for (int i = 1; i < 4; i++) {
				InfoVo cvsMap = new InfoVo();
				// "%03d" => 3자리 '000' 포멧
				String usrNo = String.format("%03d", i);
				
				// 아래 getTopMenu 함수 생성
				cvsMap = getTopMenu(cvsList, String.format("%03d", i));
				
				// usrNo 보여 줘야 하니 넣어주고
				cvsMap.setUsrNo(usrNo);
				
				// resList 값을 넣어 줌
				resList.add(cvsMap);
			}
			try {
				/**
				 * csv 파일을 쓰기위한 설정 설명 D:\\test.csv : csv 파일저장할 위치+파일명 EUC-KR : 한글깨짐설정을 방지하기위한
				 * 인코딩설정(UTF-8로 지정해줄경우 한글깨짐) ',' : 배열을 나눌 문자열 '"' : 값을 감싸주기위한 문자
				 **/
				// lib 에 있는 CSVWriter 사용
				CSVWriter cw = new CSVWriter(new OutputStreamWriter(new FileOutputStream("D:\\test.csv"), "EUC-KR"),',', '"');
				try {
					// header 값 설정
					cw.writeNext(new String[] { "유저", "TOP1", "개수" });
					
					// resList 읽어서 값 입력
					for (InfoVo m : resList) {
						// 배열을 이용하여 row를 CSVWriter 객체에 write
						cw.writeNext(new String[] { String.valueOf("'" + m.getUsrNo()), String.valueOf(m.getTop1menu()),
								String.valueOf(m.getTop1()), String.valueOf(m.getTop2menu()),
								String.valueOf(m.getTop2()), String.valueOf(m.getTop3menu()),
								String.valueOf(m.getTop3()) });
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					// 무조건 CSVWriter 객체 close
					cw.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			// 오류가 나면 해당 상태를 Console에 찍는것.
			e.printStackTrace();

		// finally 는 무조건 실행하는것
		} finally {
			try {
				if (rs != null)
					// 앞에서 열었던 것 닫음. 안닫으면 에러 메시지 뜸
					rs.close();
				if (pstmt != null)
					// 앞에서 열었던 것 닫음. 안닫으면 에러 메시지 뜸
					pstmt.close();
				if (conn != null)
					// 앞에서 열었던 것 닫음. 안닫으면 에러 메시지 뜸
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// 각 사용자별 top1 ~ top3 까지 구하는 함수
	public InfoVo getTopMenu(List<InfoVo> valList, String usrNo) {
		InfoVo rtnMap = new InfoVo();
		int top1 = 0;
		int top2 = 0;
		int top3 = 0;
		String top1Menu = "";
		String top2Menu = "";
		String top3Menu = "";
		
		// 001이 오면 001만 돌게끔. 즉, 받은 유저만 돌도록
		for (int i = 0; i < valList.size(); i++) {
			if (usrNo.equals(valList.get(i).getUsrNo())) {
				// 처음값을 top1에 넣어주고 top2는 top3에 밑으로 밀어내는 것
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
		
		// rtnMap = returnMap 함순데 리턴하지 않으면 결과값을 모르니 리턴을 해줘야 한다.
		rtnMap.setTop1(top1);
		rtnMap.setTop2(top2);
		rtnMap.setTop3(top3);
		rtnMap.setTop1menu(top1Menu);
		rtnMap.setTop2menu(top2Menu);
		rtnMap.setTop3menu(top3Menu);
		
		// rtnMap 도 여러개 값을 가져 온 값
		// 한줄로 쭉 넣어진 값.
		return rtnMap;
	}
}