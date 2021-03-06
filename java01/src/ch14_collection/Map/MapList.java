package ch14_collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch14_collection.Student.Student;

public class MapList {
	// 맵에 리스트 추가 예제
	public static void main(String[] args) {
		
		// 해시맵 생성 Map<key 자료형, value 자료형>
		Map<String, Object> map = new HashMap<>();
		
		// ArrayList 생성
		List<Student> list = new ArrayList<Student>();
		
		// ArrayList에 student 객체 추가
		list.add(new Student("2017001", "kim", "국사", 2, "park"));
		list.add(new Student("2016001", "park", "수학", 3, "lee"));
		list.add(new Student("2015001", "hong", "영어", 4, "choi"));
		
		// 해시맵에 ArrayList 추가
		map.put("list", list);
		
		System.out.println(map);
		// 자료 조회 map.get(key) 
		@SuppressWarnings("unchecked")
		List<Student> list2 = (ArrayList<Student>)map.get("list");
		for(Student s : list2) {
			System.out.println(s);
		}
		
	}
}
