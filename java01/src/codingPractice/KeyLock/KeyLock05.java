package codingPractice.KeyLock;

class Solution05 {
	public boolean solution(int[][] key, int[][] lock) {
		int m = key.length;
		int n = lock.length;
		boolean answer = true;

		// 열쇠 90도 총 4회 회전
		int[][][] rotate = new int[4][m][m];
		for (int i = 1; i < 4; i++) {
			rotate[0] = key.clone();
			for (int j = 0; j < m; j++) {
				for (int k = 0; k < m; k++) {
					rotate[i][j][k] = rotate[i - 1][m - k - 1][j];
				}
			}
		}

		// 필드 초기화
		int[][] field = new int[n + 2 * m - 2][n + 2 * m - 2];
		for (int k = 0; k < n; k++) {
			for (int l = 0; l < n; l++) {
				field[k + m - 1][l + m - 1] = lock[k][l];
			}
		}

		int[][] fieldC = deepCopy(field);

		// 돌린 열쇠 꽂고 확인하기
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < n + m - 1; j++) {
				for (int k = 0; k < n + m - 1; k++) {
					for (int l = 0; l < m; l++) {
						for (int o = 0; o < m; o++) {
							fieldC[j + l][k + o] += rotate[i][l][o];
						}
					}
					// 확인
					loop: for (int c = 0; c < n; c++) {
						for (int l = 0; l < n; l++) {
							if (fieldC[c + m - 1][l + m - 1] != 1) {
								answer = false;
								break loop;
							}
						}
					}
					if (answer)
						return true;
					answer = true;
					fieldC = deepCopy(field);
				}
			}
		}
		return false;
	}

	private int[][] deepCopy(int[][] original2) {
		if (original2 == null)
			return null;
		int[][] result = new int[original2.length][original2[0].length];

		for (int i = 0; i < original2.length; i++) {
			System.arraycopy(original2[i], 0, result[i], 0, original2[0].length);
		}

		return result;
	}
}

public class KeyLock05 {
	public static void main(String[] args) {
		int[][] key = { { 0, 0, 0 }, { 1, 0, 0 }, { 0, 1, 1 } };
		int[][] lock = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		Solution05 func = new Solution05();
		boolean answer = func.solution(key, lock);
		System.out.println(answer);
	}
}
