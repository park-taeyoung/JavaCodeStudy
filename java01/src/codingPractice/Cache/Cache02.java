package codingPractice.Cache;
import java.util.*;

class tyUtil {
	static final int CACHE_HIT_TIME = 1;
	static final int CACHE_MISS_TIME = 5;
	public int cacheTime(int cacheSize, String[] cities) {
		// return 값 초기화
		int answer = 0;
		
		LinkedList<String> cache = new LinkedList<>(); // 배열 인자의 들어오고 나가는 순서가 중요한 List형 배열은 LinkedList 를 쓴다.

		for (String city : cities) { // 데이터형 변수는 'city'이며, 배열명 cities 안의 인자 수 만큼 반복할 것이다.
			city = city.toUpperCase(); // cities 인자 한개씩 반복될때마다 그 인자(city)의 영문자를 대문자로 치환해서 다시 city 데이터형 변수에 넣는다.
			if (cacheSize == 0) { // 입력받은 cacheSize가 0 일 경우
				answer += CACHE_MISS_TIME; // if 문 마지막엔 보통 return 이 어떻게 변하는지를 설정해줘야 함.
				continue; // 해당 if문을 마치면 바로 다음 for 반복문을 실행한다.
			}
			if (cache.contains(city)) { // cache 안에 city가 있다면 
				cache.remove(city); // 그 city는 어디에 있던 지우고
				cache.add(city); // cache 맨 마지막에 그 city를 넣는다.
				answer += CACHE_HIT_TIME; // if 문 마지막엔 보통 return 이 어떻게 변하는지를 설정해줘야 함.
				continue; // 해당 if문을 마치면 바로 다음 for 반복문을 실행한다.
			} else {
				if (cacheSize <= cache.size()) { // cache 안에 있는 city가 cacheSize보다 커지게 되면 
					cache.removeFirst(); // cache 안에 있는 첫번째 것을 제거 한다.
				}
				cache.add(city); // cache에는 계속 후입으로 1개씩 넣는다.
				answer += CACHE_MISS_TIME; // if 문 마지막엔 보통 return 이 어떻게 변하는지를 설정해줘야 함.
				continue; // 해당 if문을 마치면 바로 다음 for 반복문을 실행한다.
			}
		}
		System.out.println(answer); // 결과값을 보여줌.
		return answer; // return 에 결과값을 넣어준다.
	};
}

public class Cache02 {
	public static void main(String[] args) {
		String[] cities = { "Jeju", "Pangyo", "Seoul", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };
		tyUtil func = new tyUtil(); //생성자, 메모리에 func을 할당하는 작업
		func.cacheTime(3, cities); //펑션을 불러와서 쓰는 작업
	}
}
