package ch14_collection.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import ch14_collection.Student.Student;

public class MapList {
	// �ʿ� ����Ʈ �߰� ����
	public static void main(String[] args) {
		
		// �ؽø� ���� Map<key �ڷ���, value �ڷ���>
		Map<String, Object> map = new HashMap<>();
		
		// ArrayList ����
		List<Student> list = new ArrayList<Student>();
		
		// ArrayList�� student ��ü �߰�
		list.add(new Student("2017001", "kim", "����", 2, "park"));
		list.add(new Student("2016001", "park", "����", 3, "lee"));
		list.add(new Student("2015001", "hong", "����", 4, "choi"));
		
		// �ؽøʿ� ArrayList �߰�
		map.put("list", list);
		
		System.out.println(map);
		// �ڷ� ��ȸ map.get(key) 
		@SuppressWarnings("unchecked")
		List<Student> list2 = (ArrayList<Student>)map.get("list");
		for(Student s : list2) {
			System.out.println(s);
		}
		
	}
}