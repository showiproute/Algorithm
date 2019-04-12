package Offer;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 给定一个数组和滑动窗口的大小，找出所有滑动窗口里数值的最大值。
 * 例如，如果输入数组{2,3,4,2,6,2,5,1}及滑动窗口的大小3，
 * 那么一共存在6个滑动窗口，他们的最大值分别为{4,4,6,6,6,5}； 
 * 针对数组{2,3,4,2,6,2,5,1}的滑动窗口有以下6个： {[2,3,4],2,6,2,5,1}， 
 * {2,[3,4,2],6,2,5,1}， {2,3,[4,2,6],2,5,1}， {2,3,4,[2,6,2],5,1}，
 *  {2,3,4,2,[6,2,5],1}， {2,3,4,2,6,[2,5,1]}。
 */

public class ArrayList_3_SlideWindow {
	
    public ArrayList<Integer> maxInWindows(int [] num, int size){
    	ArrayList<Integer> result=new ArrayList<>();
    	if(size==0) return result;
    	
    	if(size>num.length) return result;
    	int index=0;
    	int i;
	    	
    	while(index+size<=num.length) {
    		ArrayList<Integer> tmp=new ArrayList<>(size);
	    	for(i=index;i<index+size;i++) {
	    		tmp.add(num[i]);
	    	}
	    	index++;
	    	Collections.sort(tmp);
	    	result.add(tmp.get(size-1));
    	}
    	return result;
    }
    
    public static void main(String[] args) {
		ArrayList_3_SlideWindow obj = new ArrayList_3_SlideWindow();
    	int[] num={2,3,4,2,6,2,5,1};
		System.out.println(obj.maxInWindows(num, 3));
    	int[] num2= {2,3,4,2,6,2,5,1};
    	System.out.println(obj.maxInWindows(num2, 3));
	}
}
