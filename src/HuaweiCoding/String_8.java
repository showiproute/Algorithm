package HuaweiCoding;

import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

/*
 * 输入描述:
输入第一行为一个正整数n(1≤n≤1000),下面n行为n个字符串(字符串长度≤100),字符串中只含有大小写字母。
输出描述:
数据输出n行，输出结果为按照字典序排列的字符串。
 */
public class String_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int num = sc.nextInt();
			TreeMap<String, Integer> treeMap=new TreeMap<>();
			for(int i=0;i<num;i++) {
				String value = sc.next();
				if(treeMap.containsKey(value)) {
					treeMap.put(value, treeMap.get(value)+1);
				}else {
					treeMap.put(value, 1);
				}
			}
			for (Entry<String, Integer> keyValues : treeMap.entrySet()) {
				if(keyValues.getValue()>1) {
					int counts=keyValues.getValue();
					for(int i=0;i<counts;i++) {
						System.out.println(keyValues.getKey());
					}
				}else {
					System.out.println(keyValues.getKey());
				}
			}
			
		}
		
		
	}
}
