package HuaweiCoding;

import java.util.Scanner;

public class String_3 {

	
	public static String cutDown(String str) {
		StringBuilder sb=new StringBuilder();
		if(str.length()==8) {
			sb.append(str).append("\n");
		}
		if(str.length()<8) {
			int counts=8-str.length();
			sb.append(str);
			for(int i=0;i<counts;i++) {
				sb.append("0");
			}
			sb.append("\n");
		}
		if(str.length()>8) {
			int counts=str.length()/8;
			int index=0;
			for(int i=0;i<counts;i++) {
				sb.append(str.substring(index, index+8)).append("\n");
				index+=8;
			}
			int temp=index+8-str.length();
			sb.append(str.substring(index));
			for(int i=0;i<temp;i++) {
				sb.append("0");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		String nextLine = sc.nextLine();
		String nextLine2 = sc.nextLine();
		
		String sb= cutDown(nextLine);
		sb+=cutDown(nextLine2);
		System.out.println(sb.toString());
	}
	
}
