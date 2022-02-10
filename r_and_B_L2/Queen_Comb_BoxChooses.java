package r_and_B_L2;
import java.io.*;
import java.util.*;
public class Queen_Comb_BoxChooses {

	public static void queensCombinations(int qpsf, int tq, int row, int col, String asf){
		if(col==tq) {	//when all colums of a row are iterated, we reset column to 0 and move to next row(row++)
			col=0;
			row++;
			asf=asf+"\n";
		}

		if(row==tq) {
			if(qpsf==tq){	//this second if condition id very important as it helps us filter out the desired NcR combs. from the total 2^n combs.
				System.out.println(asf);
			}

			return;
		}

		queensCombinations(qpsf+1,tq,row,col+1,asf+"q");
		queensCombinations(qpsf,tq,row,col+1,asf+"-");
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		queensCombinations(0, n, 0, 0, "");
	}
}
