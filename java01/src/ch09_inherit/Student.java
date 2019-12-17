package ch09_inherit;

public class Student {
	protected String name;
	protected String num;
	protected String major;
	protected int year;

	// 기본생성자
	public Student() {
	}

	// 매개변수 생성자
	public Student(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}

	// 입력
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}

	// 출력
	public void print() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year);
	}
}
