package hashmap_and_Heaps;
import java.io.*;
import java.util.*;
public class PriorityQueue_Using_Heap {
	  public static class PriorityQueue {
		    ArrayList<Integer> data;

		    public PriorityQueue() {
		      data = new ArrayList<>();
		    }

		    public void add(int val) {
		      // write your code here
		    }

		    public int remove() {
		      // write your code here
		    }

		    public int peek() {
		     if(data.size()==0) {
		    	 System.out.println("Underflow");
		    	 return -1;
		     }
		     return data.get(0); //the first element of the arraylist is the root.
		     
		    }

		    public int size() {
		    return data.size()-1;
		    }
		  }

		  public static void main(String[] args) throws Exception {
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    PriorityQueue qu = new PriorityQueue();

		    String str = br.readLine();
		    while (str.equals("quit") == false) {
		      if (str.startsWith("add")) {
		        int val = Integer.parseInt(str.split(" ")[1]);
		        qu.add(val);
		      } else if (str.startsWith("remove")) {
		        int val = qu.remove();
		        if (val != -1) {
		          System.out.println(val);
		        }
		      } else if (str.startsWith("peek")) {
		        int val = qu.peek();
		        if (val != -1) {
		          System.out.println(val);
		        }
		      } else if (str.startsWith("size")) {
		        System.out.println(qu.size());
		      }
		      str = br.readLine();
		    }
		  }
}
