package ch14_collection.Basic;

public class Type2 {

	Object value;
	public Object getValue() {
		return value; // � �ڷ����� ���ϵ��� ��
	}
	public void setValue(Object value) { // � �ڷ����� �Էµ��� �� (�Ź� ����ȯ) 
		this.value = value;
	}
	
	public static void main(String[] args) {
		Type2 t = new Type2();
		t.setValue("kim");
		Object obj = t.getValue(); // ����ȯ
		System.out.println(t.getValue());
		t.setValue(100);
		obj = t.getValue(); // ����ȯ
		System.out.println(obj);
	}
}