package ch10_static_final_polymorphism;

public class StaticExam {
	public static void main(String[] args) {
		int a=40, b=30, result;
		result = Math.max(a,  b);
		System.out.println(result);
		
		result = Math.min(a, b);
		System.out.println(result);
		
		double r=15.3;
		System.out.println("원의 둘레: "+2*Math.PI*r);
		System.out.println("원의 넓이: "+Math.PI*r*r);
	}
}


