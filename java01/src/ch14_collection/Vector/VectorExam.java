package ch14_collection.Vector;

import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<>();
		
		v.add("first");
		v.add(2);
		v.add(3.5);
		System.out.println("초기 데이터");
		for( int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("1번 인덱스 삭제 후의 데이터");
		v.remove(1);
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		System.out.println("1번 인덱스에 데이터를 insert");
		v.add(1,10.5);
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
	}
}
