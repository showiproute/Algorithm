package AlogrithmCourse;

import java.util.Arrays;
import java.util.Random;

public class QuickSort_Random {

	public static Random random=new Random();
	
	public static void QuickSort(int[] array,int low,int high) {
		if(low<high) {
			int pivot=RandomizedPartition(array, low, high);
			QuickSort(array, low, pivot-1);
			QuickSort(array, pivot+1, high);
		}
	}
	
	public static int RandomizedPartition(int[] array,int low,int high) {
		int randInt=random.nextInt(high)%(high-low+1)+low;
		int temp=array[randInt];
		array[randInt]=array[high];
		array[high]=temp;
		
		return Partition(array,low,high);
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
