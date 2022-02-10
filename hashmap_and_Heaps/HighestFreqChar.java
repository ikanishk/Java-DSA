package hashmap_and_Heaps;

import java.util.*;

public class HighestFreqChar {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		HashMap<Character,Integer>hfc=new HashMap<>();
		String str=scn.next();
		int s=str.length();
		for(int i=0;i<s;i++) {
		char ch=str.charAt(i);
		if(hfc.containsKey(ch)) {
			hfc.put(ch,hfc.get(ch)+1);
		}
		else {
			hfc.put(ch,1);
		}
		}
		String ans="";
		while(hfc.size()>0) {
		String res=mfcf(hfc);
		ans+=res;
		}
	}
	
	public static String mfcf(HashMap<Character,Integer>hfc) {
		Set<Character>keys=hfc.keySet(); 
		String ans="";
		int mfc=0;
		for(Character key:keys) {
			if(hfc.get(key)>hfc.get(mfc)) {
			mfc=key;
			for(int i=0;i<hfc.get(mfc);i++) {
			ans+=mfc;
			}
			}
			
		}
		return ans;
	}

}
