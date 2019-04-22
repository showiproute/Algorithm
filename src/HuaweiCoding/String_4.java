package HuaweiCoding;

import java.util.Scanner;

/*
 * 输入描述:
输入一个十六进制的数值字符串。
输出描述:
输出该数值的十进制字符串。
 */
public class String_4 {

	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String str = sc.nextLine();
			System.out.println(Integer.parseInt(str.substring(2),16));
		}
		
	}
	
}
