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
		
		// ����Ʈ�� book ��ü �߰�
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		// ���
		System.out.println("������\t���ǻ�\t�ܰ�\t����\t�ݾ�");
		for(int i=0; i<list.size(); i++) {
			Book b = list.get(i);
			System.out.println(b.getBookName()+"\t"+b.getPress()+"\t"+
					b.getPrice()+"\t"+b.getAmount()+"\t"+b.getMoney());
		}
	}
}