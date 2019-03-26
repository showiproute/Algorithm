package Offer;

import java.util.HashMap;

/*
 * 数组中有一个数字出现的次数超过数组长度的一半，
 * 请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class Array_4 {

    public int MoreThanHalfNum_Solution(int [] array) {
        int length=array.length;
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=0;i<length;i++) {
        	if(map.containsKey(array[i])) {
        		map.put(array[i], map.get(array[i])+1);
        	}else {
        		map.put(array[i], 1);
        	}     	
        }
        
        for(int i=0;i<length;i++) {
        	if(map.get(array[i])>(length/2)) {
        		return array[i];
        	}
        }
        
    	return 0;
    }	
    
    public static void main(String[] args) {
		int[] array= {1,2,3,2,2,2,5,4,2};
		Array_4 obj = new Array_4();
    	System.out.println(obj.MoreThanHalfNum_Solution(array));
    	
	}
	
}
