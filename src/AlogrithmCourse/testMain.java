package AlogrithmCourse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class testMain {

	public static void main(String[] args) {
		int[] array= {1,1,1,2,3,4,5,6,7,8,9};
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i=0;i<array.length;i++) {
			if(map.containsKey(array[i])) {
				map.put(array[i], map.get(array[i])+1);
			}else {
				map.put(array[i], 1);
			}
		}
		
		Set<Integer> keySet = map.keySet();
		ArrayList<Integer> arraylist=new ArrayList<>();
		
		for (Integer integer : keySet) {
			arraylist.add(integer);
		}
		
		System.out.println(arraylist.toString());
	}
	
}
