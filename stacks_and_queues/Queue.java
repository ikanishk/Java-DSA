package stacks_and_queues;

import java.util.ArrayDeque;

public class Queue {

	public static void main(String[] args) {
	ArrayDeque<Integer>q=new ArrayDeque<>();
	q.add(20);
	q.add(30);
	q.add(60);
	while(q.size()>0) { //Try printing using while loop and in reverse(q.size() -> 0)
		System.out.println(q.peek());
		q.remove();
	}
	}

}
