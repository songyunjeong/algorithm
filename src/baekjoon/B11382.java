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
		sc.close(); // ��ĳ�� ��ȯ
		// System.out.println(A);
		// System.out.println(B);
		// System.out.println(C);
		// ����/�¶������� �ý����� ����� �� ���� ���� -> ���� �α׷� ��� ��µ� ������ ������ �ȴ�.
		System.out.println(A + B + C); // 7931
	}
}