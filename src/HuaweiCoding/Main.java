package HuaweiCoding;

import java.util.Scanner;

/*
 * 将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
 */
public class Main {

	public String reverse(String sentence) {
		String[] fields = sentence.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=fields.length-1;i>=0;i--) {
			sb.append(fields[i]).append(" ");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
//		Main obj=new Main();
//		Scanner sc=new Scanner(System.in);
//		while(sc.hasNext()) {
//			System.out.println(obj.reverse(sc.nextLine()));
//		}

		int[][] array=new int[4][3];
		System.out.println(array.length);
		
		
	}
	
}
