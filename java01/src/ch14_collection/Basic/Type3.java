package ch14_collection.Basic;

public class Type3<T> { // �ڷ��� ����, �̷� Ŭ������ ���ø��̶�� ��.

		T value;
		
		public T getValue() {
			return value;
		}
		public void setValue(T value) {
			this.value = value;
		}
		
		public static void main(String[] args) {
			// Type3<String> t = new Type3<String>(); // �������� �� �ڷ����� ������Ŵ
			Type3 t = new Type3();
			t.setValue("100");;
			System.out.println(t.getValue());
			t.setValue(500); //���� : ������ �ڷ����� �Է��� ������
			System.out.println(t.getValue());
		}
}

