package ch13_useful;

public class ArrSort {
	public static void main(String[] args) {
		int[] num = {50, 40, 70, 90, 120, -20};
		System.out.println("�����ϱ� ��");
		for(int i = 0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		int temp = 0;
		for(int i = 0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("\n ������ ��");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i] + "\t");
		}
	}
}