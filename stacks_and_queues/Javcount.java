package stacks_and_queues;

import java.util.*;

public class Javcount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		String str=in.next();
		ArrayList<Integer>count=new ArrayList<>();
		for(int i=0;i<n;i++) {
		int count1=0;
		String str1=in.nextLine();
		String[]str2=str1.split(" ");
		for(int j=0;j<str2.length;j++) {
		if(str.equals(str2[j])) {
			count1++;
		}
		}
		count.add(count1);
		}
		for(int i=0;i<n;i++) {
		int max=Collections.max(count);
		System.out.println(max);
		count.remove(count.indexOf(max));
		}
	}
	}