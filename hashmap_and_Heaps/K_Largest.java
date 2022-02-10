package hashmap_and_Heaps;

import java.io.IOException;
import java.util.*;

public class K_Largest {

	 public static void main (String[] args) throws IOException
	  {
	 	 Scanner scn= new Scanner(System.in);
	    	 int n = scn.nextInt();
	 	 int[] num = new int[n];
	 	 for (int i = 0; i < n; i++) {
	 	 	 	 num[i] = scn.nextInt();
	 	 	 }
	 	 int k = scn.nextInt();
	 	 solve(n,num,k);
	  }

	  public static void solve(int n,int[] arr,int k){
	    PriorityQueue<Integer>p=new PriorityQueue<>(Collections.reverseOrder());
	    ArrayList<Integer>ans=new ArrayList<>();
	    for(int i=0;i<n;i++) {
	    	p.add(arr[i]);
	    }
	    for(int i=0;i<k;i++) {
	    ans.add(p.peek());
	    p.remove();
	    }
	    for(int i=0;i<ans.size();i++) {
	    System.out.print(ans.get(i)+" ");
	    }
    }

}
