package r_and_B_L2;

//Time Complexity:
//O(k^n)
//
//Space Complexity:
//O(k)

import java.util.*;
import java.io.*;

public class Words_K_Selection3 {
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

		   solution(ustr,0,unique,"",k);
		  }

		  public static void solution(String ustr, int ci, HashMap<Character,Integer>unique,String asf,int k){
		    //Since the word "distinct" is removed, so we have to try every element equal to the number of times it's frequency.
			 //Hence here we pass the frequency map along with the unique string.
			if(k<0){
		    return;
		    }
		    
		    if(ci==ustr.length()){
		    if(k==0){
		    System.out.println(asf);
		    }
		    return;
		    }
		    
		    char ch=ustr.charAt(ci);
		    int freq=unique.get(ch);

		    for(int i=freq;i>=0;i--){
		      String s="";
		      for(int j=0;j<i;j++){
		      s=s+ch;
		      }
		      solution(ustr,ci+1,unique,asf+s,k-i);
		    }
		  }
}
