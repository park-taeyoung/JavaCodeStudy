package ch13_useful;

import java.util.Random;

public class Rand {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt()); // ���� ���� ������ ����
		System.out.println(r.nextInt(100)); // 0~99
		System.out.println(r.nextInt(101)+100); // 100~200
		
		System.out.println(Math.random()); // 0.0~1.0 ������ ����
		System.out.println(Math.random()*100); // 10~100 ������ ����
		System.out.println((int)(Math.random()*100)); // 0~100����
		
		String[] prize = {"1��", "2��", "3��", "������ȸ��.."};
		System.out.println(prize[r.nextInt(4)]);
	}
}