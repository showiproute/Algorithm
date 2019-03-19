package Offer;

import java.util.ArrayList;

import javax.swing.text.AbstractDocument.LeafElement;

/*
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */



public class Array_2 {
//    public static int minNumberInRotateArray(int [] array) {
//    	int minValue=array[0];
//    	for(int i=1;i<array.length;i++) {
//    		if(minValue>array[i])
//    			minValue=array[i];
//    	}
//   
//    	return minValue;
//    }

	public static int minNumberInRotateArray(int [] array) {
		if(array.length==0)
			return 0;
		int low=0;
		int high=array.length-1;
		int middle=-1;
		
		while(array[low]>=array[high]) {
			if(high-low==1) {
				middle=high;
				break;
			}
			
			middle=low+(high-low)/2;
			if(array[middle]>=array[low]) {
				low=middle;
			}
			if(array[middle]<=array[high]) {
				high=middle;
			}
			
		}
		
		
		return array[middle];
	}
	
    public static void main(String[] args) {
    	int[] array= {3,4,5,1,2};
    	int result = minNumberInRotateArray(array);
    	System.out.println(result);
    	
	}
}
