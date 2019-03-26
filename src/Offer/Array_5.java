package Offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，
 * 则最小的4个数字是1,2,3,4,。
 */

public class Array_5 {
	
	
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
    	
    	HashMap<Integer, Integer> map=new HashMap<>();
    	ArrayList<Map.Entry<Integer, Integer>> list=new ArrayList<>();    	
    	
    	ArrayList<Integer> resultList=new ArrayList<>();    	
    	
    	if(input.length==0) {
    		return resultList;
    	}
    	
    	if(k>input.length) {
    		return resultList;
    	}

    	
    	for(int i=0;i<input.length;i++) {
    		if(map.containsKey(input[i])) {
    			map.put(input[i], map.get(input[i])+1);
    		}else {
    			map.put(input[i], 1);
    		}
    	}
    	
    	for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    		list.add(entry);
		}
    	
    	list.sort(new Comparator<Map.Entry<Integer, Integer>>() {
    		
    		@Override
    		public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
    			// TODO Auto-generated method stub
    			return o1.getKey()-o2.getKey();
    		}
		});
    	
    	
    	
    	List<Entry<Integer,Integer>> subList = list.subList(0, k);
    	

    	for (Entry<Integer, Integer> entry : subList) {
			resultList.add(entry.getKey());
		}
    	
    	
    	return resultList;
    
    }
    
    public static void main(String[] args) {
		
    	Array_5 obj = new Array_5();
    	int[] input= {4,5,1,6,2,7,2,8};
    	System.out.println(obj.GetLeastNumbers_Solution(input, 2).toString());
	}
}
