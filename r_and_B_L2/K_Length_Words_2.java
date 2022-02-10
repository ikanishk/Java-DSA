package r_and_B_L2;
import java.util.*;
import java.io.*;
public class K_Length_Words_2 {

	  public static void main(String[] args) throws Exception {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    String str = br.readLine();
		    int k = Integer.parseInt(br.readLine());

		    HashSet<Character> unique = new HashSet<>();
		    String ustr = "";
		    for (char ch : str.toCharArray()) {
		      if (unique.contains(ch) == false) {
		        unique.add(ch);
		        ustr += ch;
		      }
		      
		    }
		    boolean[]spots=new boolean[ustr.length()];
		    solution(ustr,0,k,"",spots);
		    
		  }
	  public static void solution(String ustr,int cs,int ts,String asf,boolean[]spots) {
		  	if(cs==ts) {
			 System.out.println(asf);
			 return;
		 	}
		  for(int i=0;i<ustr.length();i++) {
			  char ch=ustr.charAt(i);
			  if(spots[i]==false) {
				  spots[i]=true;
				  solution(ustr,cs+1,ts,asf+ch,spots);
				  spots[i]=false;
			  }
		  }
	  }
  



}
