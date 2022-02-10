package r_and_B_L2;
import java.util.*;
import java.io.*;

public class Permutations_Words2 {
	public static void generateWords(int cc, String str, Character[] spots, 
			HashMap<Character, Integer> lastOccurence) {
		
		
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		Character[] spots = new Character[str.length()];
		HashMap<Character, Integer> lastOccurence = new HashMap<>();
		for(char ch: str.toCharArray()){
			lastOccurence.put(ch, -1);
		}

		generateWords(0, str, spots, lastOccurence);
	}

}
