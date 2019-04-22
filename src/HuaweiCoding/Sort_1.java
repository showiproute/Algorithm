package HuaweiCoding;

import java.util.Scanner;

public class Sort_1 {
	
	public static void calculate(long num) {
		for(long i=2;i<=num;i++) {
			if(num%i==0) {
				System.out.print(i+" ");
				calculate(num/i);
				return ;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			long num = sc.nextLong();
			calculate(num);
		
		}
		
		
	}
	
}
