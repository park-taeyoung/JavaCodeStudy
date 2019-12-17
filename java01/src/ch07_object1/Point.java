package ch07_object1;

public class Point {
	
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private String grade;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		tot = kor + eng + mat;
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		avg = tot / 3.0;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getGrade() {
		switch((int)(avg/10)) {
		case 10:
		case 9: grade = "수"; break;
		case 8: grade = "우"; break;
		case 7: grade = "미"; break;
		case 6: grade = "양"; break;
		default: grade = "가";
		}
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	
	
}
