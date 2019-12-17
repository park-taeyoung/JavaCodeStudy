package ch07_object1;

public class PointUse {
	public static void main(String[] args) {
		Point p1 = new Point();

		p1.setName("±èÃ¶¼ö");
		p1.setKor(88);
		p1.setEng(99);
		p1.setMat(100);

		System.out.println("ÀÌ¸§ : " + p1.getName());
		System.out.println("±¹¾î : " + p1.getKor());
		System.out.println("¿µ¾î : " + p1.getEng());
		System.out.println("¼öÇÐ : " + p1.getMat());
		System.out.println("ÃÑÁ¡ : " + p1.getTot());
		System.out.println("Æò±Õ : " + p1.getAvg());
		System.out.println("µî±Þ : " + p1.getGrade());
	}
}
