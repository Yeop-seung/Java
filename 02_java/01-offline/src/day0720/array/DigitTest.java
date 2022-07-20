package day0720.array;

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
				if (0 < arr[j] && arr[j] <= temp) {
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
