package HuaweiCoding;

import java.util.Scanner;

public class String_21_o2 {
	
	public static int maxLen=0;
	public static String sub="";
	public static int getLongestStr(String inputLine) {
		if(inputLine.length()==0) {
			return 0;
		}
		if(inputLine.length()==1) {
			return 1;
		}
		
		for(int i=0;i<inputLine.length()-1;i++) {
			findLongestPalindrome(inputLine, i, i);
			findLongestPalindrome(inputLine, i, i+1);
		}
		
		return maxLen;
	}
	
	public static void findLongestPalindrome(String s,int low,int high) {
		while(low>=0 && high<=s.length()-1) {
			if(s.charAt(low)==s.charAt(high)) {
				if((high-low+1)>maxLen) {
					maxLen=high-low+1;
					sub=s.substring(low, high+1);
				}
				low--;
				high++;
			}else {
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String inputLine = sc.nextLine();
			System.out.println(getLongestStr(inputLine));
			sub="";
			maxLen=0;
		}
		
	}
	
}
