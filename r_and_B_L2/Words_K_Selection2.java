package r_and_B_L2;

import java.util.HashSet;
import java.util.Scanner;

public class Words_K_Selection2 {
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
		    System.out.println(unique);
		    generateselection(ustr, 1, k,-1, "");
		  }
	  
	 public static void generateselection(String ustr,int cs,int ts,int lc, String asf){
		 if(cs>ts) {
			 System.out.println(asf);
			 return;
		 }
		 
		 for(int i=lc+1;i<ustr.length();i++) {
			  char ch=ustr.charAt(i);
			  generateselection(ustr,cs+1,ts,i,asf+ch);
		  }
	  }
}
