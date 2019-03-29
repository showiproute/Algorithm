package Offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

/*
 * 输入一个递增排序的数组和一个数字S，
 * 在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class ArrayList_2 {

    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        if(array==null)
        	return null;
    	ArrayList<Integer> arrayList=new ArrayList<>();
    	HashMap<Integer, Integer> hashMap = new HashMap<>();
    	boolean flag;
    	for(int i=0;i<array.length;i++) {
    		hashMap.put(array[i], 0);
    		flag=false;
    		for(int j=i+1;j<array.length && flag==false;j++) {
	    		if(array[i]+array[j]==sum) {
	    			hashMap.put(array[i],array[j]);
	    			flag=true;
	    		}
    		}
    	}
    	HashMap<Integer, String> resultMap=new HashMap<>();
    	for (Entry<Integer, Integer> keyvalue : hashMap.entrySet()) {
			if(keyvalue.getValue()!=0) {
				int key=keyvalue.getKey();
				int value=keyvalue.getValue();
				StringBuilder sb=new StringBuilder();
				sb.append(key).append("-").append(value);
				resultMap.put(key*value, sb.toString());
			}
		}
    	
    	int[] resultarray=new int[2];
    	int min = Integer.MAX_VALUE;
    	for (Entry<Integer, String> keyvalue : resultMap.entrySet()) {
    		if(min>keyvalue.getKey()) {
    			min=keyvalue.getKey();
    			String sb = keyvalue.getValue();
    			resultarray[0]=Integer.parseInt(sb.split("-")[0]);
    			resultarray[1]=Integer.parseInt(sb.split("-")[1]);
    		}
    	}
    	ArrayList<Integer> resultarraylist=new ArrayList<>();
    	if(resultarray[0]==0 && resultarray[1]==0) {
    		return resultarraylist;
    	}else {
        	resultarraylist.add(resultarray[0]);
        	resultarraylist.add(resultarray[1]);
    	}
    	
    	return resultarraylist;
    }
    
    public static void main(String[] args) {
		ArrayList_2 obj = new ArrayList_2();
    	int[] array= {1,2,4,7,11,16};
    	System.out.println(obj.FindNumbersWithSum(array, 10).toString());
    	
    	
	}
}
