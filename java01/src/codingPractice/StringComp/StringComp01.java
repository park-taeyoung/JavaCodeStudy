package codingPractice.StringComp;

import java.util.HashMap;
import java.util.Iterator;

class Solution01 {
    public int solution(String s) {
      int min = s.length();
		HashMap<String, Integer> map = new HashMap<>(); 
		StringBuilder sb = null;
		for(int i = 1; i <= (s.length() /2) ; i++) {
			//�������� ũ��
			sb = new StringBuilder(""); //����Ǿ� �����Ǵ� ���ڿ�
			int j;
			for(j = 0; j < s.length() ; j+=i) {
				//�������� ũ�� ��ŭ ����
                if(j+i > s.length()) //������ ��� ���
					break;
				String sub = s.substring(j,j+i);
				Iterator key = map.keySet().iterator();
				if(key.hasNext()) {
					String tmp = key.next().toString();
					if(tmp.equals(sub))
					{ //���� �� ���
						int value = map.get(tmp);
						value += 1;
						map.put(tmp, value);
					}
					else
					{
						//�������� ���� ���
						int value = map.get(tmp);
						if(value == 1)
							sb.append(tmp);
						else
							sb.append(value).append(tmp);
						map.remove(tmp); //�ش� Ű �� ����
						map.put(sub, 1); //���� �� �߰�
					}
				}
				else
					map.put(sub, 1);
				
			}
			Iterator key = map.keySet().iterator();
			if(key.hasNext()) {
				String tmp = (String)key.next();
				int value = map.get(tmp);
				if(value == 1)
					sb.append(tmp);
				else
					sb.append(value).append(tmp);
			}
			String rest = s.substring(j,s.length());
			sb.append(rest);
			min = Math.min(min, sb.length()); //�ּڰ� ��
			map.clear(); 
		}
		System.out.println(min);
		return min;
    }
}

public class StringComp01 {
	public static void main(String[] args) {
		String s = "ababcdcdababcdcd";
		Solution01 func = new Solution01();
		func.solution(s);

	}
}