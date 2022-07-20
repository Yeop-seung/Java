package day0719_constructor;

import java.util.Arrays;
import java.util.Random;

public class LottoTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto = new int[6];

		int numLenght = 10;
		int[] ball = new int[numLenght + 1];
		for (int i = 1; i < ball.length; i++) {
			ball[i] = i;
		}
		
		final int MAX_NUMBER = 45;
		int[] numbers = new int[MAX_NUMBER];
		for (int i = 0; i < MAX_NUMBER; i++) {
			numbers[i] = i + 1;
		}
		Random r = new Random();
		for (int i = 0; i < lotto.length; i++) {
			int index = r.nextInt(MAX_NUMBER - i);
			lotto[i] = numbers[index];
			numbers[index] = numbers[MAX_NUMBER - i - 1];
		}
		
		
//		lotto[0] = r.nextInt(45) + 1;
//		outer: for (int i = 1; i < lotto.length; i++) {
//			int num = r.nextInt(45) + 1;
//			for (int j = 0; j < i; j++) {
//				if (num == lotto[j]) {
//					--i;
//					continue outer;
//				}
//			}
//			lotto[i] = num;

//			lotto[i] = r.nextInt(45) + 1; // 1 - 45
//
//			while (true) {
//				int num = r.nextInt(45) + 1;
//				boolean check = false;
//				for (int j = 0; j < i; j++) {
//					if (num == lotto[j]) {
//						check = true;
//						break;
//					}
//				}
//				if (check) {
//					continue;
//				} else {
//					lotto[i] = num;
//					break;
//				}
//			}
//		}

		System.out.println(Arrays.toString(lotto));
	}

}
