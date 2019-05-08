package HuaweiCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class String_20 {

	public static void strReverse(String inputLine) {
		char[] charArray = inputLine.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			if(!(isChar(charArray[i]))) {
				charArray[i]=' ';
			}
		}
		String str = String.valueOf(charArray).trim();
		String[] fields = str.split("\\s+");

		StringBuilder sb=new StringBuilder();
		for(int i=fields.length-1;i>=0;i--) {
			sb.append(fields[i]).append(" ");
		}
		
		System.out.println(sb.toString().trim());
	}
	
	public static boolean isChar(char c) {
		if((c>='a' && c<='z') ||(c>='A' && c<='Z')) {
			return true;
		}
		return false;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String inputLine = sc.nextLine();
			strReverse(inputLine);
		}
		
	}

	
}
