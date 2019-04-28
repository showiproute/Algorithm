package HuaweiCoding;

import java.util.HashMap;
import java.util.Scanner;

/*
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 */
public class Integer_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int nextInt = sc.nextInt();
			String inputValue=nextInt+"";
			StringBuilder sb=new StringBuilder(inputValue);
			StringBuilder reverse = sb.reverse();
			StringBuilder retsb=new StringBuilder();
			HashMap<Character, Integer> hashMap=new HashMap<>();
			for (Character value : reverse.toString().toCharArray()) {
				if(hashMap.containsKey(value)) {
					hashMap.put(value, hashMap.get(value)+1);
				}else {
					hashMap.put(value, 1);
					retsb.append(value.toString());
				}
			}
			
			System.out.println(retsb.toString());
			
		}
		
	}
	
}
