package HuaweiCoding;

import java.util.Scanner;

/*
 * 写出一个程序，接受一个字符串，然后输出该字符串反转后的字符串。例如：

 */
public class String_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			StringBuilder sb=new StringBuilder(sc.nextLine());
			System.out.println(sb.reverse());
		}
		
	}
	
}
