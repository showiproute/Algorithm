package HuaweiCoding;

import java.util.Scanner;

/*
 * 计算字符串最后一个单词的长度，单词以空格隔开。 
 */
public class String_1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=0;
		String[] fields = sc.nextLine().split(" ");
		N = fields[fields.length-1].length();
		System.out.println(N);
		
	}
	
}
