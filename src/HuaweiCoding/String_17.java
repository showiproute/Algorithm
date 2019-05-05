package HuaweiCoding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class String_17 {
	public static void deleteStr(char[] inputCharArray) {
		HashMap<Character, Integer> hashMap=new HashMap<>();
		for(int i=0;i<inputCharArray.length;i++) {
			if(hashMap.containsKey(inputCharArray[i])) {
				hashMap.put(inputCharArray[i], hashMap.get(inputCharArray[i])+1);
			}else {
				hashMap.put(inputCharArray[i], 1);
			}
		}
		int minValue=Integer.MAX_VALUE;
		for (Entry<Character, Integer> keyValue : hashMap.entrySet()) {
			if(keyValue.getValue()<minValue) {
				minValue=keyValue.getValue();
			}
		}
		
		ArrayList<Character> arrayList=new ArrayList<>();
		
		for(Entry<Character, Integer> keyValue:hashMap.entrySet()) {
			if(keyValue.getValue()==minValue) {
				arrayList.add(keyValue.getKey());
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<inputCharArray.length;i++) {
			if(!arrayList.contains(inputCharArray[i])) {
				sb.append(inputCharArray[i]);
			}
		}
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			char[] inputCharArray = sc.nextLine().toCharArray();
			deleteStr(inputCharArray);
		}
		
	}
	
}
