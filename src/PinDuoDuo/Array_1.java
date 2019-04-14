package PinDuoDuo;

import java.util.Scanner;

/*
 * 给定一个无序数组，包含正数、负数和0，
 * 要求从中找出3个数的乘积，使得乘积最大，
 * 要求时间复杂度：O(n)，空间复杂度：O(1)
 */
public class Array_1 {

	public static long Solution(long[] array,int n) {
		long max1,max2,max3,min1,min2;
		max1=max2=max3=min1=min2=0;
		for(int i=0;i<n;i++) {
			if(array[i]>max1) {
				max3=max2;
				max2=max1;
				max1=array[i];
			}else if(array[i]>max2) {
				max3=max2;
				max2=array[i];
			}else if(array[i]>max3) {
				max3=array[i];
			}else if(array[i]<min1) {
				min2=min1;
				min1=array[i];
			}else if(array[i]<min2 && array[i]>min1) {
				min2=array[i];
			}
			
		}
		
		return Math.max(max1*max2*max3, max1*min1*min2);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array=new long[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextLong();
		}
		System.out.println(Solution(array, n));
	}
	
}
