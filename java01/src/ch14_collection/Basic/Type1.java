package ch14_collection.Basic;

public class Type1 {
	
	private int value;
	
	public int getValue() {
		return value; // 어떤 자료형이 리턴될지 모름
	}
	public void setValue(int value) { // 어떤 자료형이 입력될지 모름
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type1 t = new Type1();
		t.setValue(100);
		System.out.println(t.getValue());
//		t.setValue("100");
//		System.out.println(t.getValue());
	}
}
