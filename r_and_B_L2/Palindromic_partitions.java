package r_and_B_L2;

import java.util.Scanner;

public class Palindromic_partitions {

	public static void solution(String str, String asf) {
    if(str.length()==0){
    System.out.println(asf);
    return;
    }
    
    for(int i=0;i<str.length();i++){
    String s=str.substring(0,i+1);
    String ros=str.substring(i+1);
    if(ispalindrome(s)){
    solution(ros,asf+"("+s+") ");
    }
    }
	}
	
	public static boolean ispalindrome(String s){
		int right=0;
		int left=(s.length()-1);
		while(right<left) {
		if(s.charAt(left)!=s.charAt(right)) {
			return false;
		}
		right++;
		left--;
		}
	 return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		solution(str, "");
	}

}
