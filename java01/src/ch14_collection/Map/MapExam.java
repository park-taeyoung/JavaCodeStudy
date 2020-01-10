package ch14_collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class MapExam {
	public static void main(String[] args) {
		String[] nation = {"�ѱ�", "�Ϻ�", "�߱�", "�̱�", "�±�", "����"};
		String[] city = {"����", "����", "�ϰ�", "������", "����", "����"};
		
		// �º� �θ� �캯 �ڽ� �̷� ���� : ������
		// Map<String, String> map = new HashMap<>();
		
		// �ؽ��� ����<Ű ���� �ڷ���, �������� �ڷ���>
		HashMap<String, String> map = new HashMap<String, String>();
		
		// �� - index ��� key(������)�� ������
		for (int i=0; i<city.length; i++) {
			// �ʰ�ü.put( key, value ) (������, ��)
			map.put(nation[i], city[i]);
		}
		
		// �ʿ� ����� �ڷ� ��ȸ map.get(key)
//		System.out.println(map.get("�ѱ�"));
//		System.out.println(map);
		
		// �Է��� ������� ������� �ʴ´�.
		// Iterator�� HashMap�� for�� ó�� ����ϱ� ���ؼ� ���� ���̰�
		// map.keySet()�� �Ѱ��� �аڴٴ� ��
		Iterator<String> iterator = map.keySet().iterator();
		// '.hasNext()�� ������Ұ� �ִٸ�' �̶�� ���̴�. 
		while (iterator.hasNext()) {
			// '.next()' ������Ҹ� �����ٴ� ���̴�.
			String key = (String) iterator.next();
			System.out.print("key=" + key);
			System.out.println(", value=" + map.get(key));
		}
		
		// ��ü�� ��ȸ(�迭 Ȱ��)
		for (int i =0; i<city.length; i++) {
			System.out.println(map.get(nation[i])); // ��get(������)
		}
		
		// ���ϰ� ��ȸ
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �̸��� �Է��ϼ���: ");
		String str = sc.nextLine();
		sc.close();
		System.out.println(str + "�� ���� : " + map.get(str));
		
	}
}