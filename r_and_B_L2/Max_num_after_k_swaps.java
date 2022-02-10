package r_and_B_L2;

import java.io.*;
import java.util.*;

public class Max_num_after_k_swaps {


	static String max;
	public static void findMaximum(String str, int k) {
    if(k==0) {
    System.out.println(str);
    return;
    }
    for(int i=0;i<str.length();i++){
        for(int j=0;j<str.length();j++){
        String is="";
        is=is+str.charAt(i);
        String js="";
        js=js+str.charAt(j);
        if(Integer.parseInt(is)>Integer.parseInt(js)){
        str=swap(str,i,j);
        findMaximum(str,k-1);
        }
        }
    }
		
	}
	
	public static String swap(String str, int i,int j) {
		char ch[] = str.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return new String(ch);
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		int k = scn.nextInt();
		 max = str;
		findMaximum(str, k);
		System.out.println(max);
	}


}
