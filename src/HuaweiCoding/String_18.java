package HuaweiCoding;

import java.util.Scanner;

public class String_18 {

	/*
	 * 统计出英文字母字符的个数
	 */
	public static int getEnglishCharCount(String str) {
		int counts=0;
		for(int i=0;i<str.length();i++) {
			char item = str.charAt(i);
			if((item>='a' && item<='z') || (item>='A' && item<='Z')) {
				counts++;
			}
		}
	
		return counts;
	}
	
	/*
	 * 统计出空格字符的个数
	 */
	public static int getBlankCharCount(String str) {
		int counts=0;
		for(int i=0;i<str.length();i++) {
			char item=str.charAt(i);
			if(" ".equals(item+"")) {
				counts++;
			}
		}
		
		return counts;
	}
	
	/*
	 * 统计出数字字符的个数
	 */
	
	public static int getNumberCharCount(String str) {
		int counts=0;
		for(int i=0;i<str.length();i++) {
			char item=str.charAt(i);
			if(item>='0' && item<='9') {
				counts++;
			}
		}
		return counts;
	}
	
	/*
	 * 统计出其他字符的个数
	 */
	public static int getOtherCharCount(String str) {
		int counts=0;
		for(int i=0;i<str.length();i++) {
			char item=str.charAt(i);
			if(!(item>='a' && item<='z')&& 
					!(item>='A' && item<='Z') &&
					!(item>='0' && item<='9') &&
					!(" ".equals(item+""))) {
				counts++;
			}
			
		}
		return counts;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String nextLine = sc.nextLine();
			System.out.println(getEnglishCharCount(nextLine));
			System.out.println(getBlankCharCount(nextLine));
			System.out.println(getNumberCharCount(nextLine));
			System.out.println(getOtherCharCount(nextLine));
		}	
	}
}
