package Xiaozhao_2018;

import java.util.Scanner;

public class BigDecimial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String num1 = sc.nextBigDecimal().toString();
		String num2 = sc.nextBigDecimal().toBigInteger().toString();
		int[] ret=new int[num1.length()+num2.length()];
		for(int i=num1.length()-1;i>=0;i--) {
			int x=num1.charAt(i)-'0';
			for(int j=num2.length()-1;j>=0;j--) {
				int y=num2.charAt(j)-'0';
				ret[i+j]+=(ret[i+j+1]+x*y)/10;
				ret[i+j+1]=(ret[i+j+1]+x*y)%10;
			}
		}
	
		String s="";
		for(int i=0;i<ret.length;i++) {
			if(i==0&&ret[i]==0) continue;
			s+=ret[i];
		}
		System.out.println(s);
		
	}
	
	
}
