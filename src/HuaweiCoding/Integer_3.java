package HuaweiCoding;

import java.util.Scanner;

/*
 * 输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
 */
public class Integer_3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int num = sc.nextInt();
			int retValue=0;
			while(num!=0) {
				if(num%2==1) {
					retValue+=1;
				}
				num=num/2;
			}
			System.out.println(retValue);
		}
	}
}
