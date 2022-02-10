package r_and_B_L2;

import java.util.*;
import java.io.*;

public class Words_K_Selection4 {

	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    int k = Integer.parseInt(br.readLine());

	    HashMap<Character, Integer> unique = new HashMap<>();
	    String ustr = "";
	    for (char ch : str.toCharArray()) {
	      if (unique.containsKey(ch) == false) {
	        unique.put(ch, 1);
	        ustr += ch;
	      } else {
	        unique.put(ch, unique.get(ch) + 1);
	      }
	    }
	    solution(ustr,unique,0,k,"",0);
	    
	  }
	  public static void solution(String ustr,HashMap<Character,Integer>unique,int cs,int ts,String asf,int ls) {
		  for(int i=ls;i<ustr.length();i++) {
			
		  }
	  }
}
