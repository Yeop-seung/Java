package com.ssafy.ws.step3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BuildingTest {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("data/빌딩건설.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		for (int t = 1; t <= T; t++) {
			int ans = 0;
			int N = Integer.parseInt(br.readLine());
			char[][] map = new char[N][];

			for (int i = 0; i < N; i++) {
//				System.out.println(br.readLine());
//				System.out.println(br.readLine().replace(" ", ""));
//				System.out.println(br.readLine().replace(" ", "").toCharArray());

				map[i] = br.readLine().replace(" ", "").toCharArray();
			}
//			int[] dr = { 0, -1, 0, 1, 1, 1, -1, -1 };
//			int[] dc = { -1, 0, 1, 0, 1, -1, 1, -1 };

			int[][] drc = { { 0, -1 }, { -1, 0 }, { 0, 1 }, { 1, 0 }, { 1, 1 }, { 1, -1 }, { -1, 1 }, { -1, -1 } };
			for (int i = 0; i < N; i++) {
				outer: for (int j = 0; j < N; j++) {
					if (map[i][j] == 'G')
						continue;

					// 빌딩인 경우 8방 체크가 필요
					for (int d = 0; d < 8; d++) {
//						int nr = r + dr[d], nc = c + dc[d];
						int nr = i + drc[d][0], nc = j + drc[d][1];

						// 바운더리 체크
						if (nr < 0 || nr >= N || nc < 0 || nc >= N)
							continue;

						if (map[nr][nc] == 'G') {
							ans = Math.max(ans, 2);
							continue outer;
						}
					}

					// 현재 좌표기준 팔방에 'G'가 없음..
					// 가로, 세로 위치에 있는 빌딩의 갯수를 구하자
					int cnt = -1;
					for (int k = 0; k < N; k++) {
						if (map[k][j] == 'B')
							++cnt;
						if (map[i][k] == 'B')
							++cnt;
					}
					ans = Math.max(ans, cnt);
				}
			}

			System.out.println("#" + t + " " + ans);
		}
	}
}
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = null;
//		StringBuilder sb = new StringBuilder();
//
//		int t = Integer.parseInt(br.readLine());
//
//		int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
//		int[] dy = { -1, 0, 1, -1, 1, 1, 0, 1 };
//
//		for (int i = 1; i <= t; i++) {
//			sb.append("#").append(i).append(" ");
//
//			int n = Integer.parseInt(br.readLine());
//			String[][] arr = new String[n][n];
//
//			for (int j = 0; j < n; j++) {
//				st = new StringTokenizer(br.readLine());
//				for (int j2 = 0; j2 < n; j2++) {
//					arr[j][j2] = st.nextToken();
//				}
//			}
//			int answer = 0;
//
//			for (int j = 0; j < n; j++) {
//				for (int j2 = 0; j2 < n; j2++) {
//					int temp = 0;
//					boolean check = false;
//					if (arr[j][j2].equals("G"))
//						continue;
//
//					for (int k = 0; k < 8; k++) {
//						if ((j + dx[k] >= 0 && j + dx[k] < n) && (j2 + dy[k] >= 0 && j2 + dy[k] < n)) {
//							if (arr[j + dx[k]][j2 + dy[k]].equals("G")) {
//								check = true;
//								break;
//							}
//						}
//					}
//					if (check) {
//						continue;
//					} else {
//						for (int k = 0; k < arr.length; k++) {
//							if (arr[j][k].equals("B"))
//								temp++;
//							if (arr[k][j2].equals("B"))
//								temp++;
//						}
//						temp--;
//
//						if (answer < temp)
//							answer = temp;
//					}
//
//				}
//			}
//
//			sb.append(answer).append("\n");
//		}
//		sb.setLength(sb.length() - 1);
//		System.out.println(sb);
//	}
