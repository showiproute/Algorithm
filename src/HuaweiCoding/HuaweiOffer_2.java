package HuaweiCoding;

import java.util.Scanner;
import java.util.TreeSet;

public class HuaweiOffer_2 {

	public static void printResult(int N,int M,int result) {
		TreeSet<String> treeSet=new TreeSet<>();
		

		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int fenmu=1;
			for(int i=1;i<=N;i++) {
				fenmu*=i;
			}
			int fenzi=1;
			int temp=N+M-1;
			for(int i=1;i<=N;i++) {
				fenzi*=temp;
				temp--;
			}
			int result=fenzi/fenmu;
			
			printResult(N, M, result);
		}
		
		
		
	}
}
