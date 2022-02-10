package r_and_B_L2;

import java.util.*;
import java.io.*;

public class K_Length_Words_4 {
	  //In this approach, we keep the available spots on different recursion levels and run backtracking accordingly.
	  public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();
	    int k = Integer.parseInt(br.readLine());
	    
	    String ustr="";
	    //creating a hashmap which stores the frequency of all the characters.
	    HashMap<Character,Integer>unique=new HashMap<>();
	    for(int i=0;i<str.length();i++) {
	    if(unique.containsKey(str.charAt(i))) {
	    	unique.put(str.charAt(i),unique.get(str.charAt(i))+1);
	    }
	    else {
	    	unique.put(str.charAt(i), 1);
	    	ustr+=str.charAt(i);
	    }

	  
	    fun(ustr,unique,1,k,"");
	    }
	  
	  }

	  public static void fun(String ustr, HashMap<Character,Integer>unique,int cs,int ts,String asf) {
		  
		  if(cs==ts+1) {
			System.out.println(asf);
			return;
		  }
		  for(int i=0;i<ustr.length();i++) {
			  char ch=ustr.charAt(i);
			  if(unique.get(ch)>0) {
				  unique.put(ch, unique.get(ch)-1);
				  fun(ustr,unique,cs+1,ts,asf+ch);
				  unique.put(ch, unique.get(ch)+1);
			  }
		  }
	  }
}
