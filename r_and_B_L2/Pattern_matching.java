package r_and_B_L2;
import java.io.*;
import java.util.*;
public class Pattern_matching {


	public static void solution(String str, String pattern, HashMap<Character,String> map, String op){
	
	if(pattern.length()==0) {
		if(str.length()==0) {
			HashSet<Character>alreadyprinted=new HashSet<>();
			for(int i=0;i<op.length();i++) {
			    char ch=op.charAt(i);
				if(alreadyprinted.contains(ch)==false) {
					System.out.print(ch+" -> "+map.get(ch)+", ");
					alreadyprinted.add(ch);
				}
			}
			System.out.println(".");
		}
		return;
	}
	
	//Take out the first char of pattern which belongs to current layer.
	char patpre=pattern.charAt(0);
	String rop=pattern.substring(1);
	
	//if the chosen pattern character(patpre) is already mapped to a string, check if the starting characters of the string match the one mapped to the pattern character(patpre).
	if(map.containsKey(patpre)) {
	String matchpat=map.get(patpre);
	if(str.length()>=matchpat.length()) {
		String pre=str.substring(0,matchpat.length());
		String ros=str.substring(matchpat.length());
		if(matchpat.equals(pre)){
		solution(ros,rop,map,op);
		}
	}
	}
	
	
	//if the patpre is not already mapped to anything, we map it to all possible subsequences of the string (0-1,1-1,1-2,1-3,etc....).
	else {
		for(int i=0;i<str.length();i++){
			String pre=str.substring(0,i+1);
			String ros=str.substring(i+1);			
			map.put(patpre,pre);
			solution(ros,rop,map,op);
			map.remove(patpre);
		}
		}
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		String pattern = scn.next();
		HashMap<Character,String> map = new HashMap<>();
		solution(str,pattern,map,pattern);
	}

}
