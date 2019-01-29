package Part_1;

import java.util.Arrays;

public class BinarySearch_1_1_10 {

	public static int rank(int key,int[] array) {
		int lo=0;
		int hi=array.length-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(key<array[mid]) hi=mid-1;
			if(key>array[mid]) lo=mid+1;
			else return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testarray= {1,2,3,4,5,6,7};
		  
		int result=rank(7, testarray);
		System.out.println(result);
		
		
	}

}
