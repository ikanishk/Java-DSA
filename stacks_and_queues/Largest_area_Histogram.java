import java.io.*;
import java.util.*;

public class Largest_area_Histogram{
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] arr = new int[n];
    for(int i = 0; i < n; i++){
       arr[i] = Integer.parseInt(br.readLine());
    }

    
    int[]rb=new int[arr.length];//RB->Right Boundary(next smaller element to the right.)
    Stack<Integer>st=new Stack<>();
    st.push(arr.length-1);
    rb[arr.length]=arr.length;//Since, there cannot be a next sm element for the last so for every                                       element 
                            //whose NSE to the right does not exist, we take it's NSE as 0.
    for(int i=arr.length-2;i>=0;i--){
    while(st.size()>0&&arr[i]<arr[st.peek()]){
    st.pop();
    }
    if(st.size()==0){
    rb[i]=arr.length;
    }
    else{
    rb[i]=st.peek();
    }
    st.push(i);
    }
    
    
    
    int[]lb=new int[arr.length];
    Stack<Integer>st1=new Stack<>();
    st1.push(0);
    lb[0]=0;//Since, there cannot be a next sm element for the first so for every                                       element 
            //whose NSE to the left does not exist, we take it's NSE as -1.
    for(int i=0;i<arr.length;i++){
    while(st.size()>0&&arr[i]<arr[st.peek()]){
    st.pop();
    }
    if(st.size()==0){
    lb[i]=-1;
    }
    else{
    lb[i]=st.peek();
    }
    st.push(i);

    }
    int maxarea=0;
    for(int i=0;i<arr.length;i++){ //This loop gets us the max area histogram that can be formed by                                         arr[i].
    int width=rb[i]-lb[i]-1;  
    int area=arr[i]*width;
    if(area>maxarea){
    maxarea=area;
    }
    }
    
    System.out.println(maxarea);
    
    
 }
}