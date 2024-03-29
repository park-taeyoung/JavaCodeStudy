package ch14_collection.Basic;

public class Type2 {

	Object value;
	public Object getValue() {
		return value; // 어떤 자료형이 리턴될지 모름
	}
	public void setValue(Object value) { // 어떤 자료형이 입력될지 모름 (매번 형변환) 
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");
		Object obj = t.getValue(); // 형변환
		System.out.println(t.getValue());
		t.setValue(100);
		obj = t.getValue(); // 형변환
		System.out.println(obj);
	}
}
