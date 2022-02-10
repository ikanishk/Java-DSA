package dp_level2;

import java.util.Scanner;

public class Largest_submat_with_all_1 {

	public static int solution(int[][] matrix) {
	    int[][]dp=new int[matrix.length][matrix[0].length];
	    for(int i=dp.length-1;i>=0;i--){
	    for(int j=dp[0].length-1;j>=0;j--){
	    
	    if(i==dp.length-1 && j==dp[0].length-1 ){
	     dp[i][j]=matrix[i][j];   
	    }
	    if(i==dp.length-1){
	    dp[i][j]=matrix[i][j];
	    }
	        
	    else if(j==dp[0].length-1){
	    dp[i][j]=matrix[i][j];  
	    }
	    
	    else{
	    if(matrix[i][j]==0){
	    dp[i][j]=0;    
	    }
	    else{
	    dp[i][j]=(int)Math.min(dp[i+1][j],Math.min(dp[i][j+1],dp[i+1][j+1]))+1;
	    }
	        
	    }
	    }
	    }
	        
	        
	        
	    int max=0;    
	        for(int i=dp.length-1;i>=0;i--){
	    for(int j=dp[0].length-1;j>=0;j--){
	    if(dp[i][j]>max){
	    max=dp[i][j];
	    }
	    }
	        }
	    return max;
	        
	    }
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m =scn.nextInt();
		int[][] arr = new int[n][m];
		for(int i = 0 ; i < n; i++){
			for(int j = 0 ; j < m; j++){
				arr[i][j] = scn.nextInt();
			}
		}
		System.out.println(solution(arr));
	}

}
