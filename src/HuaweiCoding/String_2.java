package HuaweiCoding;

import java.util.Scanner;

/*
 * 写出一个程序，接受一个由字母和数字组成的字符串，
 * 和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 */
public class String_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[] str = sc.nextLine().toUpperCase().toCharArray();
		char[] chr = sc.next().toUpperCase().toCharArray();
		int counts=0;
		for (char c : str) {
			if(c==chr[0]) {
				counts++;
			}
		}
		System.out.println(counts);
	}
	
}
