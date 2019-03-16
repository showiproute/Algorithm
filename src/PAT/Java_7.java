package PAT;

import java.math.BigInteger;
import java.util.Scanner;

public class Java_7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigInteger A = scanner.nextBigInteger();
		BigInteger B = scanner.nextBigInteger();
		BigInteger[] divideAndRemainder = A.divideAndRemainder(B);
		scanner.close();
		System.out.print(divideAndRemainder[0]+" "+divideAndRemainder[1]);
		
	}

	
}
