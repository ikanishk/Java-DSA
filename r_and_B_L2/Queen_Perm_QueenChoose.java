package r_and_B_L2;

import java.io.*;
import java.util.*;
public class Queen_Perm_QueenChoose {
    public static void queensPermutations(int qpsf, int tq, int[][] chess){
    	if(qpsf==tq) {
            for(int i=0;i<chess.length;i++) {
            	for(int j=0;j<chess.length;j++) {
            	if(chess[i][j]==0) {
            		System.out.print("-\t");
            	}
            	else {
            		System.out.print("q"+chess[i][j]+'\t');
            	}
            	}
            	System.out.println();
            	}
            System.out.println();
            return;
            	}
    	
        for(int i=0;i<chess.length;i++) {
        	for(int j=0;j<chess.length;j++) {
        		if(chess[i][j]==0) {
        			chess[i][j]=qpsf+1;
        			queensPermutations(qpsf+1,tq,chess);
        			chess[i][j]=0;//we need to make the location again "available" for the queens of the next possbility.
        		}
        	}
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        
        queensPermutations(0, n, chess);
    }
}
