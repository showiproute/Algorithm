package PAT;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Java_2 {

	public static void main(String[] args) {
		int A1=0;
		int A2=0;
		int A3=0;
		float A4=0;
		int A5=0;
		int temp=0;
		int count=0;
		int f=1;
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int[] buffer=new int[M];
		for(int i=0;i<M;i++) {
			buffer[i]=scanner.nextInt();
			switch (buffer[i]%5) {
			case 0:
				if(buffer[i]%2==0)
					A1+=buffer[i];
				break;
			case 1:
	            A2+=buffer[i]*f;
	            f=-f;
				break;
			case 2:
				A3++;
				break;
			case 3:
				A4+=buffer[i];
				count++;
				break;
			case 4:
				if(buffer[i]>temp) {
					temp=buffer[i];
				}
				break;
			default:
				break;
			}
		}
		
		A5=temp;
		DecimalFormat df = new DecimalFormat("0.0");		
		if(count!=0) {
			A4 = Float.parseFloat(df.format(A4*1.0/count));
		}else {
			A4=0.0f;
		}
		
		if(A1==0) {
			System.out.print("N"+" ");
		}else {
			System.out.print(A1+" ");
		}
		
		if(A2==0) {
			System.out.print("N"+" ");
		}else {
			System.out.print(A2+" ");
		}
		
		if(A3==0) {
			System.out.print("N"+" ");
		}else {
			System.out.print(A3+" ");
		}
		
		if(A4==0.0) {
			System.out.print("N"+" ");
		}else {
			System.out.print(A4+" ");
		}
		
		
		if(A5==0) {
			System.out.print("N");
		}else {
			System.out.print(A5);
		}	
	}
	
}
