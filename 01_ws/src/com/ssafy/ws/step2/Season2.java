package com.ssafy.ws.step2;

import java.util.Scanner;

public class Season2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		while (true) {
			System.out.printf("월 입력>>");
			int n = sc.nextInt();
			int num = 0;
			if (n == 12 || n <= 2) {
				num = 4;
			} else if (3 <= n && n <= 5) {
				num = 1;
			} else if (6 <= n && n <= 8) {
				num = 2;
			} else if (9 <= n && n <= 11) {
				num = 3;
			}
			switch (num) {
			case 1:
				System.out.println(n + "월은 봄입니다.");
				break;
			case 2:
				System.out.println(n + "월은 여름입니다.");
				break;
			case 3:
				System.out.println(n + "월은 가을입니다.");
				break;
			case 4:
				System.out.println(n + "월은 겨울입니다.");
				break;

			default:
				break;
			}

			++cnt;
			if (cnt == 3) {
				break;
			}
		}
	}

}
