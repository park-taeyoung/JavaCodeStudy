package ch14_collection.Student;

import java.util.ArrayList;

public class ListStudent {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.setName("�ڱ�");
		s1.setNum("2012001");
		s1.setYear(1);
		s1.setMajor("ü��");
		s1.setProfessor("�ֱ���");
		
		Student s2 = new Student();
		s2.setName("����");
		s2.setNum("2011001");
		s2.setYear(2);
		s2.setMajor("�̼�");
		s2.setProfessor("ȫ����");
		
		Student s3 = new Student("2010001","�豺", "����", 3 , "�ڱ���");
//		s3.setName("�豺");
//		s3.setNum("2010001");
//		s3.setYear(3);
//		s3.setMajor("����");
//		s3.setProfessor("�ڱ���");
//		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println("�й�\t�̸�\t����\t�г�\t��������");
//		for(int i=0; i<list.size(); i++) {
//			Student s = list.get(i);
//			System.out.println(s.getNum()+"\t"+s.getName()+"\t"
//					+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
//		}

		// Ȯ�� for��
		for(Student s : list) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"
			+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
		
		
		
	}
}
