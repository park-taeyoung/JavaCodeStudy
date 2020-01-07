package ch14_collection.Student;

import java.util.ArrayList;

public class ListStudent {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.setName("박군");
		s1.setNum("2012001");
		s1.setYear(1);
		s1.setMajor("체육");
		s1.setProfessor("최교수");
		
		Student s2 = new Student();
		s2.setName("서군");
		s2.setNum("2011001");
		s2.setYear(2);
		s2.setMajor("미술");
		s2.setProfessor("홍교수");
		
		Student s3 = new Student("2010001","김군", "국사", 3 , "박교수");
//		s3.setName("김군");
//		s3.setNum("2010001");
//		s3.setYear(3);
//		s3.setMajor("국사");
//		s3.setProfessor("박교수");
//		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
//		for(int i=0; i<list.size(); i++) {
//			Student s = list.get(i);
//			System.out.println(s.getNum()+"\t"+s.getName()+"\t"
//					+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
//		}

		// 확장 for문
		for(Student s : list) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"
			+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
		
		
		
	}
}
