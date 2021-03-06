package ch14_collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapExam {
	public static void main(String[] args) {
		String[] nation = {"한국", "일본", "중국", "미국", "태국", "영국"};
		String[] city = {"서울", "동경", "북경", "워싱턴", "방콕", "런던"};
		
		// 좌변 부모 우변 자식 이런 형태 : 다형성
		// Map<String, String> map = new HashMap<>();
		
		// 해쉬맵 선언<키 값의 자료형, 벨류값의 자료형>
		HashMap<String, String> map = new HashMap<String, String>();
		
		// 맵 - index 대신 key(변수명)가 제공됨
		for (int i=0; i<city.length; i++) {
			// 맵객체.put( key, value ) (변수명, 값)
			map.put(nation[i], city[i]);
		}
		
		// 맵에 저장된 자료 조회 map.get(key)
//		System.out.println(map.get("한국"));
//		System.out.println(map);
		
		// 입력한 순서대로 저장되지 않는다.
		// Iterator는 HashMap을 for문 처럼 사용하기 위해서 쓰는 것이고
		// map.keySet()을 한개씩 읽겠다는 것
		Iterator<String> iterator = map.keySet().iterator();
		// '.hasNext()는 다음요소가 있다면' 이라는 뜻이다. 
		while (iterator.hasNext()) {
			// '.next()' 다음요소를 꺼낸다는 뜻이다.
			String key = (String) iterator.next();
			System.out.print("key=" + key);
			System.out.println(", value=" + map.get(key));
		}
		
		// 전체값 조회(배열 활용)
		for (int i =0; i<city.length; i++) {
			System.out.println(map.get(nation[i])); // 맵get(변수명)
		}
		
		// 단일값 조회
		Scanner sc = new Scanner(System.in);
		System.out.print("나라 이름을 입력하세요: ");
		String str = sc.nextLine();
		sc.close();
		System.out.println(str + "의 수도 : " + map.get(str));
		
	}
}
