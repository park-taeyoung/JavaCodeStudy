package ch14_collection.Member;

import java.util.ArrayList;

public class ListMember {
	public static void main(String[] args) {
		ArrayList<Member> list = new ArrayList<Member>();
		
		Member m1 = new Member();
		m1.setName("����");
		m1.setUsreid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-222-3333");
		m1.setEmail("kim@naver.com");
		
		Member m2 = new Member();
		m2.setName("ȫ�浿");
		m2.setUsreid("hond");
		m2.setPasswd("1234");
		m2.setTel("02-333-4444");
		m2.setEmail("hong@naver.com");
		
		Member m3 = new Member();
		m3.setName("�ּ�ȣ");
		m3.setUsreid("choi");
		m3.setPasswd("1234");
		m3.setTel("02-444-5555");
		m3.setEmail("choi@naver.com");
		
		Member m4 = new Member();
		m4.setName("������");
		m4.setUsreid("cho");
		m4.setPasswd("1234");
		m4.setTel("02-555-6666");
		m4.setEmail("cho@naver.com");
		
		Member m5 = new Member();
		m5.setName("�̻�");
		m5.setUsreid("lee");
		m5.setPasswd("1234");
		m5.setTel("02-666-7777");
		m5.setEmail("lee@naver.com");
		
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		System.out.println(list); // toString �������̵� �ؼ� ���
		System.out.println("�̸� \t���̵� \t��� \t��ȭ \t\t�̸���");
		for(int i=0; i<list.size(); i++) {
			Member m = list.get(i); // i��° ����
			System.out.println(m.getName()+"\t"+m.getUsreid()+"\t"+
					m.getPasswd()+"\t"+m.getTel()+"\t"+m.getEmail());
		}
	}
}