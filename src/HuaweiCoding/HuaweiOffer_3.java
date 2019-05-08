package HuaweiCoding;

import java.util.Scanner;

/*
 * [1,2,3]
 * [4,5,6]
 * [7,8,9]
 */

public class HuaweiOffer_3 {

	public static int[][] turnOver(int[][] array){
		int[][] temp=new int[array[0].length][array.length];
		int index=array.length-1;
		for(int i=0;i<array.length;i++,index--) {
			for(int j=0;j<array[0].length;j++) {
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
			int M = sc.nextInt();
			int[][] tempArray=new int[array.length][array.length];
			for(int j=0;j<M;j++) {
				tempArray=turnOver(array);
				array=tempArray;
			}
			
			for(int i=0;i<array.length;i++) {
				for(int j=0;j<array.length;j++) {
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		
	}
	
}
