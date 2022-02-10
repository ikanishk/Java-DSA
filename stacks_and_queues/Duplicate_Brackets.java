//Time Complexity -> O(2*n)=O(n) as we are pushing and popping each element only once.
//Although one might think that the complexity is O(n*n) as there are nested loops but no.
//Space Complexity -> We are using the stack data structure, which can take space equal to the number of characters in the expression string,
//i.e. equal to the size of the string, in the worst case, hence O(n) auxiliary space is required.

package stacks_and_queues;
import java.io.*;
import java.util.*;
public class Duplicate_Brackets {
	  	public static void main(String[] args) throws Exception {
	  	Scanner sc=new Scanner(System.in);
	  	String s=sc.nextLine();//read difference between next() and nextLine()
	    Stack<Character>st=new Stack<Character>();
	   	for(int i=0;i<s.length();i++) {
	   	char ch=s.charAt(i);
	   	if(ch==')') {
	   		if(st.peek()=='(') {
	   		System.out.println(true);
	   		return;
	   		}	
	   	
	   	
	   	else {
	   		while(st.peek()!='(') {
	   			st.pop();
	   		}
	   		st.pop();
	   		
	   	}
	   	}
	   	else {
	   		st.push(ch);
	   	}
	   	}
	   	
	   	System.out.println(false);
	   	
	    }

}
