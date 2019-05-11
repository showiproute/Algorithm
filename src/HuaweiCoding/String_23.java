package HuaweiCoding;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map.Entry;

public class String_23 {

	public static String CovertToNewOne(String inputStr) {
		TreeMap<Character, Integer> treeMap=new TreeMap<>();
		for(int i=0;i<inputStr.length();i++) {
			if(treeMap.containsKey(inputStr.charAt(i))) {
				treeMap.put(inputStr.charAt(i), treeMap.get(inputStr.charAt(i))+1);
			}else {
				treeMap.put(inputStr.charAt(i), 1);
			}
		}
		StringBuilder sb=new StringBuilder();
		for (Entry<Character, Integer> keyValue : treeMap.entrySet()) {
			int counts=keyValue.getValue();
			for(int i=0;i<counts;i++) {
				sb.append(keyValue.getKey());
			}
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String inputStr = sc.nextLine();
			System.out.println(CovertToNewOne(inputStr));
		}
		
		
	}
	
}
