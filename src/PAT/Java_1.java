package PAT;

import java.util.Scanner;

public class Java_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		long A=0;
		long B=0;
		long C=0;
		String nextLine;
		for(int i=1;i<=n;i++) {
			 A = scanner.nextLong();
			 B = scanner.nextLong();
			 C = scanner.nextLong();
			 if(A+B>C) {
				 System.out.println("Case #"+i+":"+" true");
			 }else {
				 System.out.println("Case #"+i+":"+" false");
			 }
		
		}

		
		
	}
}
