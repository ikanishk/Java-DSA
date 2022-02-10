package r_and_B_L2;
import java.io.*;
import java.util.*;
public class Word_break {


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		List<String> dict=new ArrayList<>();
		String[]ss= {"cats","dog","sand","and","cat"};
		for(int i = 0  ; i  < ss.length; i++){
			dict.add(ss[i]);
		}
		String s = "catsandog";
		System.out.println(dict);
		wordBreak(s,dict);
	}
	


    static List<String> asf=new ArrayList<>();
    
    public static boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict = new HashSet<>();
		for(int i = 0  ; i  < wordDict.size(); i++){
			dict.add(wordDict.get(i));
		}
		
		wordBreak1(s,"", dict);
		System.out.println(asf);
        if(asf.size()>0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void wordBreak1(String str, String ans, HashSet<String> dict){
	
	if(str.length()==0) {
		System.out.println(asf);
	asf.add(ans);
	return;
	}
	for(int i=0;i<str.length();i++){
	 String pre=str.substring(0,i+1);
	 String ros=str.substring(i+1);
	 if(dict.contains(pre)) {
		 wordBreak1(ros,ans+pre+" ",dict);
	 }
	}
	}
}
