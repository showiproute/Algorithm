package PAT;

import java.util.Scanner;

public class Java_12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int D = scanner.nextInt();
		
		// 10 5 2 1
		// 0 1 0 1
		int C=A+B;
		StringBuilder sb=new StringBuilder();
		while(C>0) {
			int num=C%D;
			C=C/D;
			sb.append(num);
		}
		System.out.println(sb.reverse());
		
		
		
	}
	
}
