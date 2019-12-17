package ch10_static_final_polymorphism;

public class PrinterUse {
	public static void main(String[] args) {
//		DotPrinter p1 = new DotPrinter();
//		p1.print();
//		InkjetPrinter p2 = new InkjetPrinter();
//		p2.print();
//		LaserPrinter p3 = new LaserPrinter();
//		p3.print();
		Printer p = new DotPrinter();
		p.print();
		p = new InkjetPrinter();
		p.print();
		p = new LaserPrinter();
		p.print();
	}
}
