package AlogrithmCourse;

import java.util.Arrays;

public class QuickSort_Origin {

	public static void QuickSort(int[] array,int low,int high) {
		if(low<high) {
			int pivot=Partition(array, low, high);
			QuickSort(array, low, pivot-1);
			QuickSort(array, pivot+1, high);
		}
	}
	
	public static int Partition(int[] array,int low,int high) {
		int middle=array[high];
		int i=low-1;
		for(int j=low;j<=high-1;j++) {
			if(array[j]<=middle) {
				i+=1;
				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
		}
		int temp=array[i+1];
		array[i+1]=array[high];
		array[high]=temp;
		
		return i+1;
	}
	
	
	public static void main(String[] args) {
		int[] array=new int[]{2,8,7,1,3,5,6,4};
		
		QuickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
	
}
