package day0719_constructor;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		{
			int i;
			int j = 1;
			if (j >= 1) {
				i = 10;
			} else {
				i = 20;
			}
			System.out.println(i);
		}
		Food f = null;
		if (new Random().nextInt(2) == 0) {
			f = new Bread();
		}
//		else {
//			f = new Drink();
//		}
		if (f != null)
			f.info();

//		Bread b1 = new Bread();
//		Bread b2 = new Bread(1);
//		Bread b3 = new Bread("1");

//		b.call();
//		b.print();

//		Food f = new Food();
//		f.Food();
//		f.Food();
//		f.Food();
//		f.Food();

	}
}
