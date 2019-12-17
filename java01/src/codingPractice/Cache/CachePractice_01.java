package codingPractice.Cache;

import java.util.LinkedList;

// 클래스 선언 시작
class tyUtil2 {
	// 전역변수 선언 시작
	static final int CACHE_HIT_TIME = 1;
	static final int CACHE_MISS_TIME = 5;
	// 전역 변수 선언 끝

	// 펑션 코딩 시작
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
	// 펑션 코딩 끝
}
// 클래스 선언 끝

// 메인 함수 시작
public class CachePractice_01 {
	public static void main(String[] args) {
		String[] cities = { "Jeju", "Pangyo", "Seoul", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Jeju", "Pangyo",
				"Seoul", "NewYork", "LA" };
		tyUtil2 func = new tyUtil2();
		func.cacheTime(3, cities);
	}
}
// 메인 함수 끝