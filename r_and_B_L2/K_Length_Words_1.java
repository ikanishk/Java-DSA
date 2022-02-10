package r_and_B_L2;
import java.util.*;
import java.io.*;

//tHIS APPROACH INVOLVES MARKING THE CHARACTERS ON LEVELS AND SELCTING WHEATHER OR NOT TO PLACE A CHARCTER IN ALL THE POSSBILE AVAILABLE LOCATIONS
public class K_Length_Words_1 {
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
		    Character[]spots=new Character[k];
		    solution(0,ustr,0,k,spots);
		    
		  }
	  public static void solution(int cc,String ustr,int cs,int ts,Character[]spots) {
		  if(cc==ustr.length())	{
		  if(cs==ts){
		  for(int i=0;i<spots.length;i++) {
		      if(spots[i]!=null)
			  System.out.print(spots[i]);
		  }
		  System.out.println();
		  }
		  return;
		  }
		  
		  char ch=ustr.charAt(cc);
		  for(int i=0;i<spots.length;i++) { //YES CALL(ALL THE EMPTY(NULL) POSITIONS WHERE WE CAN PLACE THE ELEMENTS)
		
			  if(spots[i]==null) {
				  spots[i]=ch;
				  solution(cc+1,ustr,cs+1,ts,spots);
				  spots[i]=null;
			  }
		  }
		  solution(cc+1,ustr,cs,ts,spots);//NO CALL(WHEN CHARACTER IS NOT ADDED)

	  }
}
