package HuaweiCoding;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * 数据表记录包含表索引和数值，
 * 请对表索引相同的记录进行合并，
 * 即将相同索引的数值进行求和运算，
 * 输出按照key值升序进行输出。
 */
public class Stack_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int num = sc.nextInt();
			TreeMap<Integer, Integer> treeMap=new TreeMap<>();
			for(int i=0;i<num;i++) {
				int key = sc.nextInt();
				int value = sc.nextInt();
				if(treeMap.containsKey(key)) {
					treeMap.put(key, treeMap.get(key)+value);
				}else {
					treeMap.put(key, value);
				}
			}
		
			for (Entry<Integer,Integer> keyValues: treeMap.entrySet()) {
				System.out.println(keyValues.getKey()+" "+keyValues.getValue());
			}
			
		}
		
		
	}
	
}
