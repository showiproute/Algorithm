package Part_1;

import java.util.Scanner;
import java.lang.Math;

public class practice_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.1.1
		System.out.println((0+15)/2);
		System.out.println(2.0e-6*10000000000.1);
		System.out.println(true&&false||true&&true);
		
		//1.1.2
		System.out.println((1+2.236)/2);
		System.out.println(1+2+3+4.0);
		System.out.println(4.1>=4);
		System.out.println(1+2+"3");
		
		//1.1.3
//		System.out.println("Please enter three nums");
		Scanner scanner=new Scanner(System.in);
//		int num=scanner.nextInt();
//		int num2=scanner.nextInt();
//		int num3=scanner.nextInt();
//	
//		if(num==num2&&num==num3) {
//			System.out.println("Eqaul:");
//		}else {
//			System.out.println("Not equal:");
//		}
//
//			
//		//1.1.4
//		//a. then 语法错误
//		//b. ok
//		//c. ok
//		//d. ok
//
//		
//		//1.1.5
//		int x=scanner.nextInt();
//		int y=scanner.nextInt();
//		if(x<1.0 && y<1.0 && x>0 && y>0) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
//		
		
		//1.1.6
//		int f=0;
//		int g=1;
//		for(int i=0;i<=15;i++) {
//			System.out.print(f+"\t");
//			f=f+g;
//			g=f-g;
//		}
		
		//1.1.7
//		double t=9.0;
//		while(Math.abs(t-9.0/t)> .001) {
//			t=(9.0/t+t)/2.0;
//		}
//		System.out.printf("%.5f\n", t);
//		
//		
//		int sum=0;
//		for(int i=1;i<1000;i++)
//			for(int j=0;j<i;j++)
//				sum++;
//		System.out.println(sum);
//	
//		
//		int sum2=0;
//		for(int i=1;i<1000;i*=2)
//			for(int j=0;j<1000;j++)
//				sum2++;
//		System.out.println(sum2);
	
		//1.1.8
//		System.out.println('b');
//		System.out.println('b'+'c');
//		System.out.println((char)('a'+4));
		
		//1.1.9
//		System.out.println("Please enter one num and return with a binary code");
//		int N=scanner.nextInt();
//		String string="";
//		for(int n=N;n>0;n/=2) {
//			string=(n%2)+string;
//		}
//		System.out.println(string);
		
		//1.1.10
		//int[] a=new int[10];
		
		//1.1.11
//		boolean[][] arrays= {{true,true,true},
//				{false,false,false},
//				{true,false,true},
//		};
//		
//		for(int i=0;i<arrays.length;i++)
//			for(int j=0;j<arrays.length;j++) {
//				if(arrays[i][j]) {
//					System.out.print("*"+"\t");
//				}
//				else {
//					System.out.print("^"+"\t");
//				}
//			}
		//1.1.12
//		int[] a=new int[10];
//		for(int i=0;i<10;i++)
//			a[i]=9-i;
//		for(int i=0;i<10;i++)
//			a[i]=a[a[i]];
//		for(int i=0;i<10;i++)
//			System.out.println(i);

	
		
		
	}	
}
