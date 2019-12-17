package codingPractice.KeyLock;

class Solution03 {
	public boolean solution(int[][] key, int[][] lock) {
		boolean answer = false;

		for (int i = 0; i < 4; i++) {
			key = rotate(key);
			if (open(key, lock))
				return true;
		}
		return answer;
	}

	public boolean open(int[][] key, int[][] lock) {
		int[][] tempLock = new int[lock.length + key.length * 2][lock.length + key.length * 2];

		for (int i = key.length; i < key.length + lock.length; i++) {
			for (int j = key.length; j < key.length + lock.length; j++) {
				tempLock[i][j] = lock[i - key.length][j - key.length];
			}
		}

		for (int i = 0; i < tempLock.length - key.length; i++) {
			for (int j = 0; j < tempLock.length - key.length; j++) {
				if (correct(i, j, key, tempLock)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean correct(int a, int b, int[][] key, int[][] lock) {

		int[][] temp = new int[lock.length][lock.length];
		for (int i = 0; i < temp.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				temp[i][j] = lock[i][j];
			}
		}

		for (int i = 0; i < key.length; i++) {
			for (int j = 0; j < key.length; j++) {
				if (key[i][j] == 1) {
					temp[i + a][j + b]++;
				}
			}
		}

		for (int i = key.length; i < temp.length - key.length; i++) {
			for (int j = key.length; j < temp.length - key.length; j++) {

				if (temp[i][j] != 1) {
					return false;
				}

			}

		}

		return true;
	}

	public int[][] rotate(int[][] key) {
		int len = key.length;
		int[][] ret = new int[len][len];

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				ret[i][j] = key[key.length - 1 - j][i];
			}
		}

		return ret;
	}

}

public class KeyLock03 {
	public static void main(String[] args) {
		int[][] key = { { 0, 0, 0 }, { 1, 0, 0 }, { 0, 1, 1 } };
		int[][] lock = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		Solution03 func = new Solution03();
		boolean answer = func.solution(key, lock);
		System.out.println(answer);
	}
}
