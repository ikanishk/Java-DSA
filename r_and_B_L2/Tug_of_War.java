package r_and_B_L2;
import java.io.*;
import java.util.*;
public class Tug_of_War {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}
		solve(arr, 0, new ArrayList<>(), new ArrayList<>(), 0, 0);
		System.out.println(ans);
	}

	static int mindiff = Integer.MAX_VALUE;
	static String ans = "";

	public static void solve(int[] arr, int vidx, ArrayList<Integer> set1, ArrayList<Integer> set2, int soset1,int soset2) {
	    
	    if(vidx==arr.length){
	    int diff=Math.abs(soset1-soset2);
	    if(diff<mindiff){
	    mindiff=diff;
	    ans=set1+" "+set2;
	    }
	    return;
	    }
	    
	    //Approach: har element ke paas choice h ki wo konse subset me jana chahta h untile subset ka size <arr.length+1/2
	    if(set1.size()<(arr.length+1)/2){
		set1.add(arr[vidx]);
		solve(arr,vidx+1,set1,set2,soset1+arr[vidx],soset2);
        set1.remove(set1.size()-1);
	    }
        
        if(set2.size()<(arr.length+1)/2){
        set2.add(arr[vidx]);
        solve(arr,vidx+1,set1,set2,soset1,soset2+arr[vidx]);
        set2.remove(set2.size()-1);
        }
        
	}


}
