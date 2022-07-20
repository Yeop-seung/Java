package day0720;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SwitchTest {
	static String data = "10 3\r\n3 5 2";

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new StringReader(data));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		int[] swc = new int[n];
		st = new StringTokenizer(br.readLine());
		int[] changeNum = new int[m];

		for (int i = 0; i < m; i++) {
			changeNum[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < changeNum.length; i++) {
			for (int j = changeNum[i]; j < swc.length; j += changeNum[i]) {
				swc[j - 1] = 1 - swc[j - 1]; // 토글 방식 1,0 일땐 1에서 값을 빼면 변경된다.
			}
		}
		System.out.println(Arrays.toString(swc));
	}

//	{
//		Scanner sc = new Scanner(new File("data/ws02-3.txt"));
//
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//
//		int[] swc = new int[n];
//		int[] changeNum = new int[m];
//
//		for (int i = 0; i < m; i++) {
//			changeNum[i] = sc.nextInt();
//		}
//
//		for (int i = 0; i < changeNum.length; i++) {
//			for (int j = changeNum[i]; j < swc.length; j += changeNum[i]) {
//				swc[j - 1] = 1 - swc[j - 1]; // 토글 방식 1,0 일땐 1에서 값을 빼면 변경된다.
//			}
//		}
//		System.out.println(Arrays.toString(swc));
//	}
}
