package Offer;

import java.util.HashMap;
import java.util.Map.Entry;

/*
 * 一个整型数组里除了两个数字之外，
 * 其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。
 */
public class Array_11 {
	//num1,num2分别为长度为1的数组。传出参数
	//将num1[0],num2[0]设置为返回结果
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        
    	HashMap<Integer, Integer> hashMap = new HashMap<>();
    	for(int i=0;i<array.length;i++) {
    		hashMap.put(array[i], 0);
    	}
    	
    	for(int i=0;i<array.length;i++) {
    		hashMap.put(array[i],hashMap.get(array[i])+1);
    	}
    	
    	int[] result=new int[2];
    	int i=0;
    	for(Entry<Integer, Integer> keyvalue:hashMap.entrySet()) {
    		if(keyvalue.getValue()==1) {
    			result[i]=keyvalue.getKey();
    			i++;
    		}
    	}
    	num1[0]=result[0];
    	num2[0]=result[1];
    	
    }
	
}
