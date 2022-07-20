package com.ssafy.ws.step3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuildingTest {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		int answer = 0;
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				answer += i;
			}
		}
		sb.append("1부터 ").append(n).append("까지의 수 중 짝수의 합 = ").append(answer);
		System.out.println(sb);
	}
}