package al;

public class Select02 {

	public static void main(String[] args) {
		int data[] = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9}; // �����迭
		
//		int data[] = { 72, 45, 23, 39, 81, 56, 12, 4, 95, 87 }; // �����迭
		int temp;
		System.out.print("������ ����Ÿ : ");
		printArray(data);
		for (int i = 0; i < data.length - 1; i++) { // ������ġ�� 0~n-2 ����
			for (int j = i + 1; j < data.length; j++) {// �������� ��ġ�� ������ġ+1 ~ n-1����
				if (data[i] > data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
		System.out.print("���� ���� �� ����Ÿ : ");
		printArray(data);
	}

	static void printArray(int data[]) {
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
	}
}
