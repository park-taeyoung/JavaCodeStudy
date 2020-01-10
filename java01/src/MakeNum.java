import java.util.Random;

public class MakeNum {
	public static void main(String[] args) {
		Random r = new Random();
		int[] lotto = new int[6];
		int num;
		boolean flag = false; // �ߺ��� ���� ���θ� Ȯ���ϴ� ����

		for (int i = 0; i < lotto.length; i++) {
			num = Math.abs(r.nextInt(45)) + 1;
			lotto[i] = num;

			// ��ȣ�� �����ɶ����� �ߺ��� ���� �ִ��� �˻��Ͽ� flag���� ��۸�
			if (i > 0) {
				for (int j = (i - 1); j >= 0; j--) {
					if (lotto[j] == lotto[i]) { // �ߺ��� ���� �ִٸ�
						flag = true; // flag���� true�� ��۸�
						break;
					}
				}
			}

			// �ߺ��� ���� �ִ� ����� ó��
			if (flag == true) {
				i--; // i���� ���߾ for�� �ݺ� Ƚ���� �ѹ� ������Ŵ(��ȣ �ٽ� ����)
				flag = false; // flag���� �ٽ� flase�� ��۸�
				continue;
			}

		}

		// ������ ��ȣ ���
		for (int n : lotto) { // Ȯ�� for��
			System.out.print(n + "\t");
		}

	}
}