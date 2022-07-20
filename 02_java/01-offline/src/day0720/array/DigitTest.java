package day0720.array;
/*
 * 십의자리수 빈도 구하기
100 미만의 양의 정수들이 주어진다.  입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고 
그 때까지 입력된 정수의 십의 숫자가 각각 몇 개인지 작은 수부터 출력하는 프로그램을 작성하시오
(0인 숫자는 출력하지 않는다.)

10 55 2 63 85 61 85 0
0 : 1개
1 : 1개
5 : 1개
6 : 2개
8 : 2개

8 9 11 11 11 22 44 44 44 44 55 55 88 88 99 99 99 99 99 0
2 : 1개
0 : 2개
5 : 2개
8 : 2개
1 : 3개
4 : 4개
9 : 5개
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DigitTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int[] arr = new int[10];

		while (true) {
			int num = Integer.parseInt(st.nextToken());
			if (num == 0)
				break;
			for (int i = 0; i < arr.length; i++) {
				if (num / 10 == i) {
					arr[i] += 1;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int temp = Integer.MAX_VALUE;
			int index = 0;
			for (int j = 0; j < arr.length - i; j++) {
				if (0 < arr[j] && arr[j] < temp) {
					index = j;
					temp = arr[j];
				}
			}
			if (temp < Integer.MAX_VALUE) {
				System.out.println(index + " : " + temp + "개");
				arr[index] = 0;
			}
		}
	}
}
