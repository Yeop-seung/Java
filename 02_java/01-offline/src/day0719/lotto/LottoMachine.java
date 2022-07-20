package day0719.lotto;

import java.util.Random;

public class LottoMachine {
	LottoBall[] ballArr = null;
	private int cnt;

	public LottoMachine(int cnt) {
		this.cnt = cnt;
		ballArr = new LottoBall[cnt];
		prepareBall();
	}

	private void prepareBall() {
		String[] colors = { "빨강", "파랑", "노랑", "녹색", "보라" };
		for (int i = 0; i < cnt; i++) {
			ballArr[i] = new LottoBall(i + 1, colors[i / 10]);
		}
	}

	public void mixBall() {
		Random r = new Random();
		for (int i = 0; i < 1000; i++) {
			int index = r.nextInt(cnt);
			LottoBall temp = ballArr[0];
			ballArr[0] = ballArr[index];
			ballArr[index] = temp;
		}
	}

	public void getBall() {
		try {
			for (int i = 0; i < 6; i++) {
				LottoBall ball = ballArr[i];
				Thread.sleep(1000);
				System.out.println(ball.getNum() + "(" + ball.getColor() + ")");
			}
		} catch (Exception e) {
			System.out.println("볼을 가져오는 중 문제 발생함...");
		}

	}
}
