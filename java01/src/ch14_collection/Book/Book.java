package ch14_collection.Book;

import java.util.Scanner;

public class Book {

	private String bookName;
	private String press;
	private int price;
	private int amount;
	private int money;
	
	// 생성자
	public Book() {
		// System.out.println("매게변수가 없는 생성자 호출");
	}

	public Book(String bookName, String press, int price, int amount) {
		this.bookName = bookName;
		this.press = press;
		this.price = price;
		this.amount = amount;
	}
	
	// 인풋 메서드
	public void input() {
		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("도서명");
			bookName = scan.nextLine();
			System.out.println("출판사");
			press = scan.nextLine();
			System.out.println("단가");
			price = scan.nextInt();
			System.out.println("수량");
			amount = scan.nextInt();
			
		} catch (Exception e) {
			System.out.println("데이터 입력 오류가 발생했습니다.");
		}
		// 스캐너 특성상 인풋하면 객체 만들고 또 만들고 하는데,
		// 클로스 한다음에 하나 입력하고 닫고 하나 입력하고 닫고 하면 문제가 발생한다.
		// scan.close();
	}
	
	// 판매금액 계산 (판매수량 * 단가)
	public void calc() {
		money = amount * price;
	}

	
	
	// 게터 세터 추가
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
