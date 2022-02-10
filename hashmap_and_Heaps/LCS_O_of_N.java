package hashmap_and_Heaps;

import java.util.*; 

public class LCS_O_of_N {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		HashMap<Integer,Boolean>lcs=new HashMap<>();
		int n=scn.nextInt();
		int[]a1=new int[n];
		for(int i=0;i<n;i++) {
		a1[i]=scn.nextInt();
		}
		
		for(int i=0;i<n;i++) {
		lcs.put(a1[i],true);
		}
		
		for(int i=0;i<n;i++) {
		if(lcs.containsKey(a1[i]-1)) {
		lcs.put(a1[i],false);
		}
		}
		
		int msp=0;
		int ml=0;
		for(int key:lcs.keySet()) {
			if(lcs.get(key)==true) {
				int sp=key; //start point of sequence
				int l=1; //length of sequence
				while(lcs.containsKey(sp+l)) {
				l++;
				}
				if(l>ml) {
					msp=sp;
					ml=l;
				}
			}
		}
		
		for(int i=0;i<ml;i++) {
			System.out.println(msp+i);
			
		}
		System.out.println(ml);
		
		
	}
}
