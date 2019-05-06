package Java_algoirthm;

import java.util.Arrays;

public class QuickSort {
	public static int partition(int[] array,int low,int high) {
		int key=array[low];
		while(low<high) {
			while(array[high]>key && high>low) {
				high--;
			}
			array[low]=array[high];
			while(array[low]<key && high>low) {
				low++;
			}
			array[high]=array[low];
		}
		array[high]=key;
		return high;
	}
	
	public static void sort(int[] array,int low,int high) {
		if(low>=high)
			return;
		int index=partition(array, low, high);
		sort(array, 0, index-1);
		sort(array, index+1, high);
	}
	public static void main(String[] args) {
		int[] array= {23,4,6,1,55};
		sort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
}
