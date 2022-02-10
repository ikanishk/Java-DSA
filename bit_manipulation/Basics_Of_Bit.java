package bit_manipulation;

import java.util.Scanner;

public class Basics_Of_Bit {


	  public static void main(String[] args){
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	    int i = scn.nextInt();
	    int j = scn.nextInt();
	    int k = scn.nextInt();
	    int m = scn.nextInt();
	    
	    // The (1<<i) and all the operations are enclosed in a () bracket because the presidency of the >> << operators is less than the equal sign.
	    int onmask=(1<<i);
	    int offmask=~(1<<j);
	    int tmask=(1<<k);
	    int cmask=(1<<m);
	    
	    System.out.println(n|onmask);
	    System.out.println(n&offmask);
	    System.out.println(n^tmask);
	    System.out.println((n&cmask)==0 ? false: true);
	  }


}
