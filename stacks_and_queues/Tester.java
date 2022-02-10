package stacks_and_queues;


import java.io.*;
import java.util.*;
import java.time.*;

public class Tester {
	
	public static void main(String[] args) {
	int n=6;
	int s=3;
	int month=6;
	int[]a= {2,1,9,3,1,4};
	
	int c=n/s;
	
	ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
	
	for(int i=0;i<a.length;i=i+s) {
		ArrayList<Integer>aa=new ArrayList<>();
		for(int j=i;j<i+s;j++) {
		aa.add(a[j]);	
		}
		ans.add(aa);
	}
	
	for(int i=0;i<c;i++) {
	Collections.sort(ans.get(i));
	}
	System.out.println(c);
	ArrayList<ArrayList<Integer>>ans1=new ArrayList<>();

	int min=0;
	
	for(int i=1;i<s;i++) {
		for(int j=0;j<s;j++) {
		if(ans.get(j).get(i)<ans.get(j+1).get(i+1)) {
			
		}
		}
	}
	}
}







//19:10