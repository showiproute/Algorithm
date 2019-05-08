package HuaweiCoding;

import java.util.Scanner;

public class String_21 {

	public static int longestPalindrome(String s) {
		if(s.length()<=1) {
			return 1;
		}
		
		for(int i=s.length();i>0;i--) {
			for(int j=0;j<=s.length()-i;j++) {
				String sub = s.substring(j, i+j);
				int count=0;
				for(int k=0;k<sub.length()/2;k++) {
					if(sub.charAt(k)==sub.charAt(sub.length()-k-1)) {
						count++;
					}
				}
				if(count==sub.length()/2) {
					return sub.length();
				}
				
			}
		}
		
		return 0;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String inputLine = sc.nextLine();
			System.out.println(longestPalindrome(inputLine));
		}
	}
	
}
