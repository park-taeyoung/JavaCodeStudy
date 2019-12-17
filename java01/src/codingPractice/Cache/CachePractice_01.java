package codingPractice.Cache;

import java.util.LinkedList;

// Ŭ���� ���� ����
class tyUtil2 {
	// �������� ���� ����
	static final int CACHE_HIT_TIME = 1;
	static final int CACHE_MISS_TIME = 5;
	// ���� ���� ���� ��

	// ��� �ڵ� ����
	public int cacheTime(int cacheSize, String[] cities) {
		int answer = 0;

		LinkedList<String> cache = new LinkedList<String>();
		for (String city : cities) {
			city = city.toUpperCase();
			if (cacheSize == 0) {
				answer += CACHE_MISS_TIME;
				continue;
			}
			if (cache.contains(city)) {
				cache.remove(city);
				cache.add(city);
				answer += CACHE_HIT_TIME;
				continue;
			} else {
				if (cacheSize <= cache.size()) {
					cache.removeFirst();
				}
				cache.add(city);
				answer += CACHE_MISS_TIME;
				continue;
			}
		}
		System.out.println(cache);
		System.out.println(answer);
		return answer;
	};
	// ��� �ڵ� ��
}
// Ŭ���� ���� ��

// ���� �Լ� ����
public class CachePractice_01 {
	public static void main(String[] args) {
		String[] cities = { "Jeju", "Pangyo", "Seoul", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Jeju", "Pangyo",
				"Seoul", "NewYork", "LA" };
		tyUtil2 func = new tyUtil2();
		func.cacheTime(3, cities);
	}
}
// ���� �Լ� ��