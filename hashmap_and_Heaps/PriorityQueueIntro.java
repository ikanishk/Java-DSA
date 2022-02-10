package hashmap_and_Heaps;

import java.util.*;

public class PriorityQueueIntro {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.add(2);
		pq.add(27);
		pq.add(4);
		pq.add(25);
		pq.add(1);
		pq.add(37);
		while(pq.size()>0) {
			System.out.println(pq.peek());
			pq.remove(pq.peek());
		}
		System.out.println("==============================================================");
		
		
		PriorityQueue<Integer> pq2=new PriorityQueue<>(Collections.reverseOrder());
		pq2.add(2);
		pq2.add(27);
		pq2.add(4);
		pq2.add(25);
		pq2.add(1);
		pq2.add(37);
		while(pq2.size()>0) {
			System.out.println(pq2.peek());
			pq2.remove(pq2.peek());
		}
	}
}
