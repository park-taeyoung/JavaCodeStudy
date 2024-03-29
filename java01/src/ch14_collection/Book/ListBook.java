package ch14_collection.Book;

import java.util.ArrayList;

public class ListBook {
	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<Book>();
		Book b1 = new Book();
		b1.input();
		b1.calc();
		
		Book b2 = new Book();
		b2.input();
		b2.calc();
		
		Book b3 = new Book();
		b3.input();
		b3.calc();
		
		// 리스트에 book 객체 추가
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		// 출력
		System.out.println("도서명\t출판사\t단가\t수량\t금액");
		for(int i=0; i<list.size(); i++) {
			Book b = list.get(i);
			System.out.println(b.getBookName()+"\t"+b.getPress()+"\t"+
					b.getPrice()+"\t"+b.getAmount()+"\t"+b.getMoney());
		}
	}
}
