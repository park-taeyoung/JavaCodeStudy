package ch13_useful;

public class Member {
	private String name;
	private int age;
	private double height;
	public Member(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
//	@Override
//	public String toString() {
//		return "�̸�: " + name + ", ����: " + age + ", Ű: " + height;
//		// return super.toString();
//	}
	
	public static void main(String[] args) {
		Member m = new Member("��ö��", 20, 180.5);
		System.out.println(m);
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
}


