package ch13_useful;
// extends Ŭ���� ���, implements �������̽� ���
public class Clone implements Cloneable{
	int num = 10;
	void print() {
		System.out.println(num);
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	public static void main(String[] args) {
		Clone t1 = new Clone();
		Clone t2 = null;
		try {
			t2 = (Clone)t1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}
}

