package day0719_constructor;

class Node02 {
	int data = 0;
	Node02 next = null;
	Node02 previous = null;
}

public class Quiz02 {
	public static void main(String args[]) {
		Node02 head = new Node02();
		head.data = 0;
		head.previous = head;
		Node02 tail = head;

		tail.next = new Node02();
		tail.next.data = 10;
		tail.next.previous = tail;
		tail = tail.next;

		tail.next = new Node02();
		tail.next.data = 20;
		tail.next.previous = tail;
		tail = tail.next;

		tail.next = new Node02();
		tail.next.data = 30;
		tail.next.previous = tail;
		tail = tail.next;

		Node02 t = tail;
		while (t.data != 0) {
			System.out.println(t.data);
			t = t.previous;
		}
	}
}