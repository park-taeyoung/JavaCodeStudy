package ch09_inherit;

public class Scholar extends Student {
	private String category;
	private int money;

	public void input(String name, String num, String major, int year, String category, int money) {
		super.input(name, num, major, year);
		this.category = category;
		this.money = money;
	}
	
	public void print() {
		System.out.println("�̸�\t�й�\t����\t�г�\t����\t���бݾ�");
		System.out.println(name+"\t"+num+"\t"+major+"\t"+year+"\t"+category+"\t"+money);
	}
}
