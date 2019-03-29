package Offer;

/*
 * 统计一个数字在排序数组中出现的次数。
 */
public class Array_10 {
    public int GetNumberOfK(int [] array , int k) {
        int counts=0;
        for(int i=0;i<array.length;i++) {
        	if(array[i]==k) {
        		counts++;
        	}
        }
    	    	
    	return counts;
    }
}
