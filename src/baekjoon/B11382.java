package baekjoon;

import java.util.Scanner;

// https://www.acmicpc.net/problem/11382
class B11382 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// A + B + C
		// 77 77 7777
		long A = sc.nextLong();
		long B = sc.nextLong();
		long C = sc.nextLong();
		sc.close(); // 스캐너 반환
		// System.out.println(A);
		// System.out.println(B);
		// System.out.println(C);
		// 백준/온라인저지 시스템은 출력을 한 번만 받음 -> 내가 로그로 찍는 출력도 제출한 답인줄 안다.
		System.out.println(A + B + C); // 7931
	}
}