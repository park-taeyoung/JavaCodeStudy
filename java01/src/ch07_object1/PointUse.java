package ch07_object1;

public class PointUse {
	public static void main(String[] args) {
		Point p1 = new Point();

		p1.setName("��ö��");
		p1.setKor(88);
		p1.setEng(99);
		p1.setMat(100);

		System.out.println("�̸� : " + p1.getName());
		System.out.println("���� : " + p1.getKor());
		System.out.println("���� : " + p1.getEng());
		System.out.println("���� : " + p1.getMat());
		System.out.println("���� : " + p1.getTot());
		System.out.println("��� : " + p1.getAvg());
		System.out.println("��� : " + p1.getGrade());
	}
}
