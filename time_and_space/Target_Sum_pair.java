package time_and_space;

import java.util.Arrays;
import java.util.Scanner;

public class Target_Sum_pair {

	public static void main(String[] args) {
	    Scanner scn=new Scanner(System.in);
	    int n1=scn.nextInt();
	    int[]a=new int[n1];
	    
	    for(int i=0;i<n1;i++) {
	    	a[i]=scn.nextInt();
	    }
	    int tar=scn.nextInt();
	 
	    Arrays.sort(a);//n logn
	    

	    int i=0;
	    int j=a.length-1;
	    
	    while(i<j) {
	    	if((a[i]+a[j])>tar) {
	    	j--;
	    	}
	    	
	    	else if((a[i]+a[j])<tar) {
	    	i++;
	    	}
	    	
	    	else{
	    	System.out.println(a[i]+" "+a[j]);
	    	i++;
	    	j--;
	    	}
	    }

	}

}
