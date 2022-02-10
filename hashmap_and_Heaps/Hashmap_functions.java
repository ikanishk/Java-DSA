package hashmap_and_Heaps;

import java.util.*;

public class Hashmap_functions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer>hp=new HashMap<>();
		
		//All the functions below run in O(1).
		hp.put("India", 135);
		hp.put("China", 200);
		hp.put("USA", 35);
		hp.put("UK", 10);
		
		System.out.println(hp);
		
		hp.put("India",140);
		System.out.println(hp);
		
		System.out.println(hp.get("India"));
		System.out.println(hp.get("Aus"));		
		
		System.out.println(hp.containsKey("India"));
		System.out.println(hp.containsKey("Aus"));
		
		Set<String>keys=hp.keySet();
		for(String key:keys) {
			System.out.println(key);
		}
		

	}

}
