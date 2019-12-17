package codingPractice.Cache;
import java.util.*;

class tyUtil {
	static final int CACHE_HIT_TIME = 1;
	static final int CACHE_MISS_TIME = 5;
	public int cacheTime(int cacheSize, String[] cities) {
		// return �� �ʱ�ȭ
		int answer = 0;
		
		LinkedList<String> cache = new LinkedList<>(); // �迭 ������ ������ ������ ������ �߿��� List�� �迭�� LinkedList �� ����.

		for (String city : cities) { // �������� ������ 'city'�̸�, �迭�� cities ���� ���� �� ��ŭ �ݺ��� ���̴�.
			city = city.toUpperCase(); // cities ���� �Ѱ��� �ݺ��ɶ����� �� ����(city)�� �����ڸ� �빮�ڷ� ġȯ�ؼ� �ٽ� city �������� ������ �ִ´�.
			if (cacheSize == 0) { // �Է¹��� cacheSize�� 0 �� ���
				answer += CACHE_MISS_TIME; // if �� �������� ���� return �� ��� ���ϴ����� ��������� ��.
				continue; // �ش� if���� ��ġ�� �ٷ� ���� for �ݺ����� �����Ѵ�.
			}
			if (cache.contains(city)) { // cache �ȿ� city�� �ִٸ� 
				cache.remove(city); // �� city�� ��� �ִ� �����
				cache.add(city); // cache �� �������� �� city�� �ִ´�.
				answer += CACHE_HIT_TIME; // if �� �������� ���� return �� ��� ���ϴ����� ��������� ��.
				continue; // �ش� if���� ��ġ�� �ٷ� ���� for �ݺ����� �����Ѵ�.
			} else {
				if (cacheSize <= cache.size()) { // cache �ȿ� �ִ� city�� cacheSize���� Ŀ���� �Ǹ� 
					cache.removeFirst(); // cache �ȿ� �ִ� ù��° ���� ���� �Ѵ�.
				}
				cache.add(city); // cache���� ��� �������� 1���� �ִ´�.
				answer += CACHE_MISS_TIME; // if �� �������� ���� return �� ��� ���ϴ����� ��������� ��.
				continue; // �ش� if���� ��ġ�� �ٷ� ���� for �ݺ����� �����Ѵ�.
			}
		}
		System.out.println(answer); // ������� ������.
		return answer; // return �� ������� �־��ش�.
	};
}

public class Cache02 {
	public static void main(String[] args) {
		String[] cities = { "Jeju", "Pangyo", "Seoul", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Jeju", "Pangyo", "Seoul", "NewYork", "LA" };
		tyUtil func = new tyUtil(); //������, �޸𸮿� func�� �Ҵ��ϴ� �۾�
		func.cacheTime(3, cities); //����� �ҷ��ͼ� ���� �۾�
	}
}
