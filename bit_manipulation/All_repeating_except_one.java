package bit_manipulation;
import java.util.*;

public class All_repeating_except_one {

	  public static void main(String[] args){
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int[] arr = new int[n];
	    for(int i = 0 ; i < n; i++){
	      arr[i] = scn.nextInt();
	    }
	            int num = 0;
	        for (int i = 0; i < arr.length; i++) {
	            num ^= arr[i];
	        }
	        System.out.println(num);
	    
	  }
}
