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
		System.out.println("코드\t품명\t제조사\t제조일자\t단가\t수량\t금액");
		System.out.println(getCode()+"\t"+getName()+"\t"+getCompany()+"\t"+getDate()+"\t"+price+"\t"+amount+"\t"+money);
		
	}
	
}
