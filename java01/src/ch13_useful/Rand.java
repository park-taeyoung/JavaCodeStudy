package ch13_useful;

import java.util.Random;

public class Rand {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextInt()); // 정수 범위 내에서 선택
		System.out.println(r.nextInt(100)); // 0~99
		System.out.println(r.nextInt(101)+100); // 100~200
		
		System.out.println(Math.random()); // 0.0~1.0 사이의 난수
		System.out.println(Math.random()*100); // 10~100 사이의 난수
		System.out.println((int)(Math.random()*100)); // 0~100정수
		
		String[] prize = {"1등", "2등", "3등", "다음기회에.."};
		System.out.println(prize[r.nextInt(4)]);
	}
}
