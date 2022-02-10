package stacks_and_queues;
import java.util.*;
import java.lang.*;
import java.io.*;
public class CC_THESAV {
	public static void main (String[] args) 
	{
    	Scanner scn=new Scanner(System.in);
    	int t=scn.nextInt();
    // 	char ch;
    	while(t>0){
    	String s=scn.next();
    	Stack<Character>st=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='0'){
                st.push(s.charAt(i));
            }
            
                else if(s.charAt(i)=='*'){
                    if(!st.isEmpty()) {
                        st.pop();
                    }
                    if(!st.isEmpty()) {
                        st.pop();
                    }

                }
            }

        
            if(st.isEmpty())
            {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
    	}
    	}
}
