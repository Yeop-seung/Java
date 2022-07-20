package day0719_constructor;

import java.util.ArrayList;
import java.util.List;

public class MovieTest {
	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer();
//		sb.append("a");
//		sb.append("b");

//		List<StringBuffer> list = new ArrayList<>();
//		list.add(new StringBuffer().append("a").append("b"));

		Movie m = new Movie();
		m.setTitle("탑건 메버릭");
		m.setGenre("액션");

		List<Movie> list = new ArrayList<>();
		list.add(new Movie().setTitle("탑건 메버릭").setGenre("액션"));
	}
}
