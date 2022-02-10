package r_and_B_L2;

//Time Complexity:
//O(k^n)
//
//Space Complexity:
//O(k)

import java.util.*;
import java.io.*;

public class Words_K_Selection1 {
	  public static void main(String[] args) throws Exception {
		    Scanner scn = new Scanner(System.in);
		    String str = scn.nextLine();
		    int k = scn.nextInt();

		    HashSet<Character> unique = new HashSet<>();
		    String ustr = "";
		    for (char ch : str.toCharArray()) {
		      if (unique.contains(ch) == false) {
		        unique.add(ch);
		        ustr += ch;
		      }
		    }

		    combination(0, ustr, 0, k, "");
		  }


		  public static void combination(int i, String ustr, int ssf, int ts, String asf ) {
			 
			 if(i==ustr.length()) { //base case.
				 if(ssf==ts)
			System.out.println(asf);
			return;
			 }
			 char ch=ustr.charAt(i);
			 combination(i+1,ustr,ssf+1,ts,asf+ch);//character added to answer string
			 combination(i+1,ustr,ssf,ts,asf+"");//character not added to answer string
			
		  }

}
