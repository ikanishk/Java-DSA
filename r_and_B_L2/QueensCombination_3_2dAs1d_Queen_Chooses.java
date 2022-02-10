package r_and_B_L2;

import java.io.*;
import java.util.*;

public class QueensCombination_3_2dAs1d_Queen_Chooses {
//what we do here is that we allot cells as integers from 0 -> chess.length-1 and traverse it like a 1-D array
    public static void queensCombinations(int qpsf, int tq, boolean[][] chess, int lcno) {
    	if(qpsf==tq) {
			for(int row=0;row<chess.length;row++) {
				for(int col=0;col<chess.length;col++) {
				if(chess[row][col]==false) {
					System.out.print("-\t");
				}
				if(chess[row][col]==true) {
					System.out.print("q\t");
				}
				}
				System.out.println();
				}
			System.out.println();
			return;
		}
    	
    	for(int i=lcno+1;i<chess.length*chess.length;i++) {
    		
    	   int row=i/chess.length;
    	   int col=i%chess.length;
    	   
    	   chess[row][col]=true;
    	   queensCombinations(qpsf+1,tq,chess,i);
    	   chess[row][col]=false;
       }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean[][] chess = new boolean[n][n];

        queensCombinations(0, n, chess, -1);
    }
}
