package HuaweiCoding;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class String_14 {

	public static String deleteString(String inputLine) {
		LinkedHashMap<Character,Integer> linkedHashMap=new LinkedHashMap<>();;
		for(int i=0;i<inputLine.length();i++) {
			char item = inputLine.charAt(i);
			if(linkedHashMap.containsKey(item)) {
				linkedHashMap.put(item, linkedHashMap.get(item)+1);
			}else {
				linkedHashMap.put(item, 1);
			}
		}
		
		int counts=Integer.MAX_VALUE;
		for (Entry<Character,Integer> keyValue : linkedHashMap.entrySet()) {
			if(keyValue.getValue()<=counts) {
				counts=keyValue.getValue();
			}
		}
		
		StringBuilder sb=new StringBuilder();
		for(Entry<Character, Integer> keyValue : linkedHashMap.entrySet()) {
			if(keyValue.getValue()==counts) {
				sb.append(keyValue.getKey());
			}
		}
		String resultStr=sb.toString();
		StringBuilder deleteStr=new StringBuilder();
		for(int i=0;i<inputLine.length();i++) {
			char itemValue = inputLine.charAt(i);
			if(!(resultStr.contains(itemValue+""))) {
				deleteStr.append(itemValue);
			}
		}
		
		return deleteStr.toString();
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String nextLine = sc.nextLine();
			String deleteString = deleteString(nextLine);
			System.out.println(deleteString);
		}
		
	}
	
}
