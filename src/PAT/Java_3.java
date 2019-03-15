package PAT;

import java.util.Scanner;

public class Java_3 {

	public static boolean isPrime(int num) {
		if(num==1) {
			return false;
		}else if(num==2) {
			return true;
		}else if(num%2==0) {
			return false;
		}else {
			for(int i=3;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int begin = scanner.nextInt();
		int end= scanner.nextInt();
		int[] array=new int[end];
		int num=1;
		int index=0;
		
		while(index<end) {
			if(isPrime(num)) {
				array[index]=num;
				index++;
			}
			num++;
		}
		
		int j=1;
		for(int i=begin-1;i<end;i++) {
			if(j==10) {
				System.out.print(array[i]+"\n");
				j=1;
			}else if(i!=end-1){
				System.out.print(array[i]+" ");
				j++;
			}else {
				System.out.print(array[i]);
			}
		}
		
		
	}
	
	
}
