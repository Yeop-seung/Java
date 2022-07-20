package day0720;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Gerridae {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;

		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			sb.append("#").append(t).append(" ");
			st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int GerridaeCnt = Integer.parseInt(st.nextToken());

			boolean[][] arr = new boolean[N][N];

			for (int i = 0; i < GerridaeCnt; i++) {
				st = new StringTokenizer(br.readLine());

				int r = Integer.parseInt(st.nextToken());
				int c = Integer.parseInt(st.nextToken());
				int direction = Integer.parseInt(st.nextToken());

				int cnt = 0;

				switch (direction) {
				case 1:
					r -= 6;
					if (r < 0)
						break;
					else {
						if (arr[r][c] == false) {
							arr[r][c] = true;
							cnt++;
						}
					}
					break;
				case 2:
					r += 6;
					if (r > N - 1)
						break;
					if (arr[r][c] == false) {
						arr[r][c] = true;
						cnt++;
					}
					break;
				case 3:
					c -= 6;
					if (c < 0)
						break;
					if (arr[r][c] == false) {
						arr[r][c] = true;
						cnt++;
					}
					break;
				case 4:
					c += 6;
					if (c > N - 1)
						break;
					if (arr[r][c] == false) {
						arr[r][c] = true;
						cnt++;
					}
					break;

				default:
					break;
				}
				sb.append(cnt).append("\n");
			}

		}
		br.close();
		sb.setLength(sb.length() - 1);
		System.out.println(sb);
	}
}
