package HuaweiCoding;

import java.util.Scanner;

public class Recursive_1 {

	public static int function(int n) {
		if(n==0) return 0;
		if(n==1) return 0;
		if(n==2) return 1;
		else return function(n-2)+1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()) {
			int value = sc.nextInt();
			if(value==0)
				break;
			System.out.println(function(value));
		}
		
	}
}
