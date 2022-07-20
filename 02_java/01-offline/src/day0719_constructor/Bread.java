/*
 * 	디폴트 생성자
 * 	-	클래스 정의시 명시적으로 생성자가 존재하지 않은 경우
 * 		컴파일러가 자동으로 제공하는 생성자
 * 		형태 : 클래스이름(){}
 * 
 * 생성자는 오버로딩이 지원된다.
 * 메서드는 오버로딩이 지원된다.
 */

package day0719_constructor;

public class Bread extends Food {
	public Bread() {
		System.out.println(1);
	}

	public Bread(int price) {

	}

	public Bread(String name) {

	}
/*
 * 오버로딩의 조건
 * - 메서드 이름이 같아야 한다.
 * - 매개변수의 개수 또는 타입이 달라야 한다.
 */
	public void call() {

	}

	public void info() {
		System.out.println("Bread의 정보를 출력합니다.");
	}
}
