package day0720.array;

import java.util.Arrays;

public class Test01 {

	public static void main(String[] args) {
		int N = 4;
		int[][] arr = //
				{ { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };//
//				{ { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		System.out.println("1. 행 우선 순회");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("2. 행 우선 순회(역)");

		for (int i = 0; i < N; i++) {
			for (int j = N - 1; j >= 0; j--) {
				System.out.printf("%3d", arr[i][j]);
			}
			System.out.println();
		}

		System.out.println("3. 열 우선 순회");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%3d", arr[j][i]);
			}
			System.out.println();
		}

		System.out.println("4. 지그제그 순회");

		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < N; j++) {
					System.out.printf("%3d", arr[i][j]);
				}
			} else {
				for (int j = N - 1; j >= 0; j--) {
					System.out.printf("%3d", arr[i][j]);
				}
			}
			System.out.println();
		}

		System.out.println("5. 지그제그 순회");

		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < N; j++) {
					System.out.printf("%3d", arr[i][j]);
				}
			} else {
				for (int j = 0; j < N; j++) {
					System.out.printf("%3d", arr[i][N - 1 - j]);
				}
			}
			System.out.println();
		}

		System.out.println("6. 지그제그 순회");

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.printf("%3d", arr[i][j + ((N - 1 - 2 * j) * (i % 2))]);
			}
			System.out.println();
		}

		System.out.println("7. 전치행렬");

		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for (int[] a : arr) {
			System.out.println(Arrays.toString(a));
		}
	}
}