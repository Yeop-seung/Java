package day0719.lotto;

public class MC {
	final int BALL_CNT = 45;

	public void process() {
		System.out.println("싸피 제 1회 로또 추첨을 시작합니다.");
		LottoMachine lm = new LottoMachine(BALL_CNT);
		System.out.println("볼을 섞어 주세요~");
		lm.mixBall();
		System.out.println("자 당첨 번호를 보여주세요~");
		System.out.println("==========================");
		lm.getBall();
		System.out.println("==========================");
	}
}
