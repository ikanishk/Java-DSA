package stacks_and_queues;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Smallest_nunber_pattern {
	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String str = br.readLine();

	    Stack<Integer>st=new Stack<>();
	    int i=0;
	    int n=1;
	    int[]arr=new int[str.length()];
	    int aridx=0;
	    while(str.length()>0){
	    if(str.charAt(i)=='d'){
	        st.push(n);
	        n++;
	    }
	    if(str.charAt(i)=='i'){
	        st.push(n);
	        n++;
	        while(st.size()>0){
	            arr[aridx]=st.pop();
	            aridx++;
	        }
	    }
	    i++;
	    }
	    st.push(n);
	    n++;
	    while(st.size()>0){
	            arr[aridx]=st.pop();
	            aridx++;
	        }
	   for(int a=0;a<n;a++){
	       System.out.print(arr[a]);
	   }
	 }

}
