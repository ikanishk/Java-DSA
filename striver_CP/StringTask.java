package striver_CP;

import java.util.*;

public class StringTask {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		String str=scn.nextLine();
		StringBuilder sb=new StringBuilder(str);
		for(int i=str.length()-1;i>=0;i--) {
			char ch=str.charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				sb.deleteCharAt(i);
			}

		}
		StringBuilder sb1=new StringBuilder();
		char[]starr=new char[sb.length()*2];
		sb1.append('.');
		for(int i=0;i<sb.length();i++) {
		if(i==0) {
		sb1.append(Character.toLowerCase(sb.charAt(i)));
		}
		else {
		sb1.append('.');
		sb1.append(Character.toLowerCase(sb.charAt(i)));
		}
		}

		System.out.println(sb1);
	}

}
