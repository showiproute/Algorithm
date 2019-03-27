package AlogrithmCourse;

import java.util.Arrays;
import java.util.Random;

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
		int bound=new Random().nextInt(1000000-100000)+100000;
		int[] array=new int[bound];
		
		for(int i=0;i<bound;i++) {
			array[i]=new Random().nextInt(bound);
		}
		
		
		long startTime=System.currentTimeMillis();
		QuickSort(array, 0, array.length-1);
		long endTime=System.currentTimeMillis();
		System.out.println((endTime-startTime)+"ms");
	}
	
}
