package ch09_inherit;

public class Sale extends Product {
	private int price;
	private int amount;
	private int money;
	
	public void input(int code, String name, String company, String date, int prive, int amount) {
		setCode(code);
		setName(name);
		setCompany(company);
		setDate(date);
		this.price=prive;
		this.amount=amount;
	}
	public void calc() {
		money = price * amount;
	}
	public void print() {
		System.out.println("�ڵ�\tǰ��\t������\t��������\t�ܰ�\t����\t�ݾ�");
		System.out.println(getCode()+"\t"+getName()+"\t"+getCompany()+"\t"+getDate()+"\t"+price+"\t"+amount+"\t"+money);
		
	}
	
}
