package r_and_B_L2;
import java.io.*;
import java.util.*;
public class Combinations_1 {

	  public static void combinations(int cb, int tb, int ssf, int ts, String asf){
		if(cb>tb){
		if( ssf==ts){
		System.out.print(asf);
		System.out.println();
		}

		return;
		}
		combinations(cb+1,tb,ssf+1,ts,asf+"i");
	    combinations(cb+1,tb,ssf,ts,asf+"-");

		

	  }

	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int nboxes = Integer.parseInt(br.readLine());
	    int ritems = Integer.parseInt(br.readLine());
	    combinations(1, nboxes, 0, ritems, "");
	  }
}
