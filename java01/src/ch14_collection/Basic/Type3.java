package ch14_collection.Basic;

public class Type3<T> { // 자료형 미정, 이런 클래스를 템플릿이라고 함.

		T value;
		
		public T getValue() {
			return value;
		}
		public void setValue(T value) {
			this.value = value;
		}
		
		public static void main(String[] args) {
			// Type3<String> t = new Type3<String>(); // 컴파일할 때 자료형을 고정시킴
			Type3 t = new Type3();
			t.setValue("100");;
			System.out.println(t.getValue());
			t.setValue(500); //에러 : 지정된 자료형만 입력이 가능함
			System.out.println(t.getValue());
		}
}

