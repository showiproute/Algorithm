package HuaweiCoding;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class String_11 {
	public static LinkedHashMap<String, Integer> linkedHashMap=new LinkedHashMap<>();;
	
	public static void fileSplit(String inputFile,int records) {
		String[] inputSplit = inputFile.split("\\\\");
		String fileName = inputSplit[inputSplit.length-1];
		StringBuilder sb=new StringBuilder();
		
		int length = fileName.length();
		if(length>16) {
			for(int i=length-16;i<length;i++) {
				sb.append(fileName.charAt(i));
			}
		}else {
			sb=new StringBuilder(fileName);
		}
		
		sb.append(" ").append(records);
		
		if(linkedHashMap.containsKey(sb.toString())) {
			linkedHashMap.put(sb.toString(), linkedHashMap.get(sb.toString())+1);
		}else {
			linkedHashMap.put(sb.toString(), 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		while(sc.hasNext()) {
			String fileFullName = sc.next();
			int records = sc.nextInt();
			fileSplit(fileFullName, records);
		}
	
		int counts=0;
		for (Entry<String, Integer> keyValues : linkedHashMap.entrySet()) {
			counts++;
			if(counts>linkedHashMap.size()-8) {
				System.out.println(keyValues.getKey()+" "+keyValues.getValue());
			}
		}
	}
	
}
