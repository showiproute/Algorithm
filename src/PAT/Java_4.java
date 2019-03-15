package PAT;

import java.util.Scanner;

public class Java_4 {

	private final static String[] DAYS= {"MON","TUE","WED","THU","FRI","SAT","SUN"};
	
	public static void main(String[] args) {
		char day;
		char hour;
		char minute;	
		boolean flag=true;
		Scanner scanner = new Scanner(System.in);
		String first= scanner.nextLine();
		String second= scanner.nextLine();
		String third = scanner.nextLine();
		String fourth = scanner.nextLine();
		
		int length1 = Math.min(first.length(), second.length());
		int length2 = Math.min(third.length(), fourth.length());
				
		for(int i=0;i<length1;i++) {
			char c = first.charAt(i);
			if(flag) {
				if(c>='A'&&c<='G'&&c==second.charAt(i)) {
					System.out.print(DAYS[c-'A']+" ");
					flag=false;
				}
			}else {
				if(c>='0'&&c<='9'&&c==second.charAt(i)) {
					System.out.print("0"+c+":");
				}else if(c>='A'&&c<='N'&&c==second.charAt(i)) {
					System.out.print((c-55)+":");
				}
			}
			
		}
		
		for(int i=0;i<length2;i++) {
			char c = third.charAt(i);
			if(c>='a'&&c<='z') {
				if(c==fourth.charAt(i)) {
					if(i>=10) {
						System.out.print(i);
					}else {
						System.out.print("0"+i);
					}
				}
			}
			if(c>='A'&&c<='Z') {
				if(c==fourth.charAt(i)) {
					if(i>=10) {
						System.out.print(i);
					}else {
						System.out.print("0"+i);
					}
				}
			}
			if(c>='0'&&c<='9') {
				if(c==fourth.charAt(i)) {
					if(i>=10) {
						System.out.print(i);
					}else {
						System.out.print("0"+i);
					}
				}
			}
		}
		
		
		
	}
	
}
