package ch10_static_final_polymorphism;

public class StaticVar2 {
	static int total;
	// private String model;
	String model;
	public StaticVar2(String model) {
		this.model=model;
		total++;
	}
}
