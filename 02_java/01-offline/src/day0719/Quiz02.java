/*
 *  희소행렬 
 희소행렬이란 행렬 안의 많은 항들이 0으로 되어있는 행렬입니다.
 엄청난 크기의 희소행렬을 생각해본다면, 메모리 낭비가 심해지게 됩니다.
 0이 아닌 값들만 추려 그 정보들만 저장해줍니다.

행렬

0 0 0 9
0 1 0 0
0 0 0 0
0 0 7 0
0 0 0 0
3 0 0 0
0 0 0 0

배열로 표시

7 4 4	// 행 열 0아닌개수
0 3 9	//
1 1 1
3 2 7
5 0 3

 */

package day0719;

public class Quiz02 {
	public static void main(String[] args) {
		int[][] arr = { { 0, 0, 0, 9 }, { 0, 1, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 7, 0 }, { 0, 0, 0, 0 }, { 3, 0, 0, 0 },
				{ 0, 0, 0, 0 } };

		int rowLen = arr.length, colLen = arr[0].length;

		int[][] result = new int[rowLen * colLen + 1][];
		result[0] = new int[3];
		result[0][0] = rowLen;
		result[0][1] = colLen;

		int existCnt = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 0)
					continue;

				result[++existCnt] = new int[3];

				result[existCnt][0] = i;
				result[existCnt][1] = j;
				result[existCnt][2] = arr[i][j];
			}
		}
		result[0][2] = existCnt;
		for (int i = 0; i < existCnt + 1; i++) {
			System.out.printf("%-2d%-2d%-2d%n", result[i][0], result[i][1], result[i][2]);
		}
	}
}