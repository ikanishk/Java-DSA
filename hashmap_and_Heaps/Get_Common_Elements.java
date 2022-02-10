package hashmap_and_Heaps;

import java.util.*;
//T.C : O(n)
public class Get_Common_Elements {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		HashMap<Integer,Integer>ce=new HashMap<>();
		int n1=scn.nextInt();
		int[]a1=new int[n1];
		for(int i=0;i<a1.length;i++) {
		a1[i]=scn.nextInt();	
		}
		
		int n2=scn.nextInt();
		int[]a2=new int[n2];
		for(int i=0;i<a2.length;i++) {
			a2[i]=scn.nextInt();	
		}
		
		for(int i=0;i<a1.length;i++) {
			if(ce.containsKey(a1[i])) {
			ce.put(a1[i], ce.get(a1[i])+1);
			}
			else {
			ce.put(a1[i],1);	
			}
		}
		
		for(int i=0;i<a2.length;i++) {
			if(ce.containsKey(a2[i])&& ce.get(a2[i])>0) {
			System.out.println(a2[i]);
			ce.put(a2[i], ce.get(a2[i])-1);
			}
		}
		

	}

}
