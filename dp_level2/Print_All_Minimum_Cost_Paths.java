package dp_level2;

import java.io.*;
import java.util.*;

public class Print_All_Minimum_Cost_Paths {
	   private static class Pair {
		      String psf;
		      int i;
		      int j;

		      public Pair(String psf, int i, int j) {
		         this.psf = psf;
		         this.i = i;
		         this.j = j;
		      }
		   }

		   public static void main(String[] args) throws Exception {
		      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      int n = Integer.parseInt(br.readLine());
		      int m = Integer.parseInt(br.readLine());
		      int[][] arr = new int[n][m];

		      for (int i = 0; i < n; i++) {
		         String str = br.readLine();
		         for (int j = 0; j < m; j++) {
		            arr[i][j] = Integer.parseInt(str.split(" ")[j]);
		         }
		      }
		      
		      int[][]dp=new int[n][m];
		      for(int i=n-1;i>=0;i--) {
		    	  for(int j=m-1;j>=0;j--) {
		    	  	
		    		if(i==n-1 && j==m-1) {
				    dp[i][j]=arr[i][j];
				    }
		    		
		    		else if(j==m-1) {
		    	  	dp[i][j]=dp[i+1][j]+arr[i][j];
		    	  	}
		    	  	
		    	  	else if(i==n-1 ) {
			    	 dp[i][j]=dp[i][j+1]+arr[i][j];
			    	 }
		    	  	
		    	  	else {
		    	  	dp[i][j]=Math.min(dp[i+1][j], dp[i][j+1])+arr[i][j];
		    	  	}
		    	  	
		    	  }
		      }
		      
		      for (int i = 0; i < n; i++) {
			         for (int j = 0; j < m; j++) {
			        	 
			        	 System.out.print(dp[i][j]+"  "); 	 
			         }
			         System.out.println();
		      }
//		      HVVHHVHVHV
		     
		      
		   }
}
