package com.ssafy.ws.step2;

import java.util.Scanner;

public class Season1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.printf("월 입력>>");
			int n = sc.nextInt();

			if (n == 12 || n <= 2) {
				System.out.println(n + "월은 겨울입니다.");
			} else if (3 <= n && n <= 5) {
				System.out.println(n + "월은 봄입니다.");
			} else if (6 <= n && n <= 8) {
				System.out.println(n + "월은 여름입니다.");
			} else if (9 <= n && n <= 11) {
				System.out.println(n + "월은 가을입니다.");
			} else {

			}
		}
	}
}
