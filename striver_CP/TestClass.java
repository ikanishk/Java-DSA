package striver_CP;

//import for Scanner and other utility classes
import java.util.*;


//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.util.*;
//Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
 public static void main(String args[] ) throws Exception {
     Scanner scn = new Scanner(System.in);
     int n=scn.nextInt();
     Queue<Integer>co=new ArrayDeque<>();//calling order
     Queue<Integer>io=new ArrayDeque<>();//ideal order
     
     for(int i=0;i<n;i++){
     co.add(scn.nextInt());
     }

     for(int i=0;i<n;i++){
     io.add(scn.nextInt());
     }
     
     int time=0;
     while(co.size()>0) {
    	 if(((ArrayDeque<Integer>)co).getFirst()==((ArrayDeque<Integer>) io).getFirst()) {
    		 co.remove();
    		 time++;
    	 }
    	 
    	 else {
    		 int val=co.remove();
    		 co.add(val);
    		 time++;
    	 }
     }
     System.out.println(time);

 }
}

