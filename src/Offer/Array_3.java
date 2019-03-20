package Offer;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序
有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

public class Array_3 {

	
    public  static void reOrderArray(int [] array) {
        ArrayList<Integer> arrayQi=new ArrayList<>();
        ArrayList<Integer> arrayOu=new ArrayList<>();
        
        for (int value : array) {
			if(value%2==0)
				arrayOu.add(value);
			else
				arrayQi.add(value);
		}
        
        arrayQi.addAll(arrayOu);
        
        Object[] array2 = arrayQi.toArray();
        for(int i=0;i<array.length;i++) {
        	array[i]=(int) array2[i];
        }
        
    	
    }
	
    public static void main(String[] args) {
		
    	int[] array=new int[]{1,2,3,4,5,6};
    	reOrderArray(array);
    	System.out.println(Arrays.toString(array));
	}
}
