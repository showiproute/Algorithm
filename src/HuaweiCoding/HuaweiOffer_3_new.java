package HuaweiCoding;

import java.util.Scanner;

public class HuaweiOffer_3_new {

	public static int[][] arrayRecOver(int[][] array,int N) {
		int[][] temp=new int[N][N];
		int index=N-1;
		for(int i=0;i<N;i++,index--) {
			for(int j=0;j<N;j++) {
				temp[j][index]=array[i][j];
			}
		}
		
		return temp;
		
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int[][] array=new int[N][N];
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					array[i][j]=sc.nextInt();
				}
			}
			int[][] temp=new int[N][N];
			int M=sc.nextInt();
			for(int i=0;i<M;i++) {
				temp=arrayRecOver(array, N);
				array=temp;
			}
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					System.out.print(temp[i][j]+" ");
				}
				System.out.println();
			}
		}
		
		
	}
	
}
