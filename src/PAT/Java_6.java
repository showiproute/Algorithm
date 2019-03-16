package PAT;

import java.util.Scanner;

public class Java_6 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int Da = scanner.nextInt();
		char sDa=(char)(Da+48);
		int B = scanner.nextInt();
		int Db = scanner.nextInt();
		char sDb=(char)(Db+48);
		
		String sA = Integer.toString(A);
		char[] charArray = sA.toCharArray();
		
		String sB = Integer.toString(B);
		char[] charArrayB = sB.toCharArray();
		
		int countA=0;
		int countB=0;
		
		boolean flagA=false;
		boolean flagB=false;
		
		for (char c : charArray) {
			if(c==sDa) {
				flagA=true;
				countA++;
			}
		}
		
		for (char c : charArrayB) {
			if(c==sDb) {
				flagB=true;
				countB++;
			}
		}
		
		StringBuilder sbA = new StringBuilder();
		StringBuilder sbB = new StringBuilder();
		
	
		if(flagA) {
			for(int i=0;i<countA;i++) {
				sbA.append(sDa);
			}
		}
		
		if(flagB) {
			for(int i=0;i<countB;i++) {
				sbB.append(sDb);
			}
		}
		if(flagA && flagB)
			System.out.print(Integer.parseInt(sbA.toString())+Integer.parseInt(sbB.toString()));
		if(flagA==true && flagB==false) {
			System.out.print(Integer.parseInt(sbA.toString())+0);
		}
		if(flagA==false && flagB==true) {
			System.out.print(Integer.parseInt(sbB.toString())+0);
		}
		if(flagA==false && flagB==false) {
			System.out.print(0);
		}
	}

}
