package striver_CP;

import java.util.Scanner;
import java.lang.*;

public class Linear_Keyboard {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	int t=scn.nextInt();
	for(int i=0;i<t;i++) {
	String key=scn.nextLine();
	String s=scn.next();
	int[]arr=new int[26];
	for(int a=1;a<=26;a++) {
		arr[(int)key.charAt(a)-'a']=a;
	}
	
	int ans=0;
	for(int a=0;a<s.length();a++) {
		ans+= Math.abs(arr[s.charAt(a+1)-'a']-arr[s.charAt(a)-'a']);
	}
	System.out.println(ans);
//	System.out.println(key.indexOf("f"));
////	System.out.println(key.indexOf(s.charAt(j)));
//	
//	
//	
//	for(int j=0;j<s.length();j++) {
//		arr[j]=key.indexOf(s.charAt(j));
//		System.out.println(arr[j]);
//	}
//
//	int sum=0;
//	
//	for(int k=1;k<arr.length;k++) {
//		sum=sum+Math.abs((arr[k])-(arr[k-1]));
//	}
//	System.out.println(sum);
	}
	}

}

//Test Case
//1
//abcdefghijklmnopqrstuvwxyz
//hello