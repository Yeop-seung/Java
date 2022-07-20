package day0719_constructor;

public class Dog {
	private String name;
	private int age;

	public Dog() {
		this("무명", 0); // 생성자 호출
//		this.name = "무명";
//		this.age = 0;
	}

	public Dog(/* Dog this, */String name) {
		this(name, 0);
		System.out.println("호출");
//		this.name = name;
//		this.age = 0;
	}

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void call() {
//		this("쫑", 11);
		this.name = "dfdf";
		
	}
}
