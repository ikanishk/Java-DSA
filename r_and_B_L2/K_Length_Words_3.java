package r_and_B_L2;

import java.util.*;
import java.io.*;

public class K_Length_Words_3 {
	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    int k = Integer.parseInt(br.readLine());
	    
	    HashMap<Character,Integer>unique=new HashMap<>();
	    for(int i=0;i<str.length();i++) {
	    	unique.put(str.charAt(i), -1);
	    }
	  }
	  
	  public static void fun(String str, HashMap<Character,Integer>unique,int cs, Character[]spots) {
		  char ch=str.charAt(cs);
		  int lo=unique.get(ch);
		  for(int i=lo+1;i<str.length();i++) {
			  if(spots[i]==null) {
				  spots[i]=ch;
				  unique.put(ch,i);
				  fun(str,unique,cs++,spots);
				  spots[i]=null;
				  unique.put(ch,lo);
			  }
		  }
		  if(unique.get(ch)==-1) {
		 fun(str,unique,cs+1,spots);
		  }
	  }


}
