package ch09_inherit;

public class BookSaleUse {
	public static void main(String[] args) {
		BookSale b1 = new BookSale();
		b1.setBookName("Java");
		b1.setAuthor("��ö��");
		b1.setPress("���");
		b1.setYear(2018);
		b1.setPrice(30000);
		b1.setAmount(3);
		b1.setRank(1);
		b1.setMoney(); //���
		b1.print(); //���
	}
}
