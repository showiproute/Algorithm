package Offer;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class LinkedListXieCheng {

	public static boolean loop(String[] arrays) {
		if(arrays==null)
			return false;
		
		HashMap<String, Integer> hashMap=new HashMap<>();
		for (String c : arrays) {
			if(hashMap.containsKey(c)) {
				hashMap.put(c, hashMap.get(c)+1);
			}else {
				hashMap.put(c, 1);
			}
		}
		
		for (Entry<String, Integer> keyvalue:hashMap.entrySet()) {
			if(keyvalue.getValue()>1) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] split = scanner.nextLine().split(",");
        System.out.println(loop(split));
	}
	
}
