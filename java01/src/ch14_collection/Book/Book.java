package ch14_collection.Book;

import java.util.Scanner;

public class Book {

	private String bookName;
	private String press;
	private int price;
	private int amount;
	private int money;
	
	// ������
	public Book() {
		// System.out.println("�ŰԺ����� ���� ������ ȣ��");
	}

	public Book(String bookName, String press, int price, int amount) {
		this.bookName = bookName;
		this.press = press;
		this.price = price;
		this.amount = amount;
	}
	
	// ��ǲ �޼���
	public void input() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("������");
			bookName = scan.nextLine();
			System.out.println("���ǻ�");
			press = scan.nextLine();
			System.out.println("�ܰ�");
			price = scan.nextInt();
			System.out.println("����");
			amount = scan.nextInt();
			
		} catch (Exception e) {
			System.out.println("������ �Է� ������ �߻��߽��ϴ�.");
		}
		// ��ĳ�� Ư���� ��ǲ�ϸ� ��ü ����� �� ����� �ϴµ�,
		// Ŭ�ν� �Ѵ����� �ϳ� �Է��ϰ� �ݰ� �ϳ� �Է��ϰ� �ݰ� �ϸ� ������ �߻��Ѵ�.
		// scan.close();
	}
	
	// �Ǹűݾ� ��� (�Ǹż��� * �ܰ�)
	public void calc() {
		money = amount * price;
	}

	
	
	// ���� ���� �߰�
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
}
