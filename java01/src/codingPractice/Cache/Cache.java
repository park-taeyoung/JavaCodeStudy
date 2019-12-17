package codingPractice.Cache;

import java.util.*;

public class Cache {
	public static void main(String[] args) {

		final int CACHE_HIT_TIME = 1;
		final int CACHE_MISS_TIME = 5;

		int cacheSize = 3;
		String[] cities = { "Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };

		int answer = 0;
		LinkedList<String> cache = new LinkedList<>(); // 들어오는 순서가 있다. 이거 안쓰면 removeFirst 기능을 쓸 수가 없다.
		// ArrayList<String> cache = new ArrayList<>();

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
				if (cache.size() >= cacheSize) {
					cache.removeFirst();
				}
				cache.add(city);

				answer += CACHE_MISS_TIME;

				continue;
			}
		}
		
		System.out.println(answer);

	}
}
