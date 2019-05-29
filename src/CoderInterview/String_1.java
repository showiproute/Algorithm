package CoderInterview;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class String_1 {

	public static boolean isSame(String inputLine) {
		
		HashMap<Character, Integer> hashMap=new HashMap<>();
		for(int i=0;i<inputLine.length();i++) {
			char item = inputLine.charAt(i);
			if(hashMap.containsKey(item)) {
				hashMap.put(item, hashMap.get(item)+1);
			}else {
				hashMap.put(item, 1);
			}
		}
		
		for(Entry<Character,Integer> keyValue:hashMap.entrySet()) {
			if(keyValue.getValue()!=1) {
				return false;
			}
		}

		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String inputLine = sc.nextLine();
			System.out.println(isSame(inputLine));
		}
		
	}
	
}
