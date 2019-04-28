package HuaweiCoding;

import java.util.Scanner;

/*
 * 描述：
输入一个整数，将这个整数以字符串的形式逆序输出
程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 */
public class String_6{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String inputValue=new String(sc.nextInt()+"");
			StringBuilder sb=new StringBuilder(inputValue);
			System.out.println(sb.reverse());
			
		}
		
	}
	
}
