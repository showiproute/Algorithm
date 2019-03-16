package PAT;


import java.util.Scanner;


public class Java_13 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int[] buff=new int[10];
		for(int i=0;i<=9;i++) {
			buff[i]=scanner.nextInt();
		}
		
		int pos=-1;
		for(int i=1;i<=9;i++) {
			if(buff[i]!=0) {
				pos=i;
				break;
			}
		}
		StringBuilder sb = new StringBuilder();
		sb.append(pos);
		buff[pos]=buff[pos]-1;
		
		for(int i=0;i<=9;i++) {
			while(buff[i]>0) {
				sb.append(i);
				buff[i]=buff[i]-1;
			}
		}
		
		System.out.println(sb.toString());
		
	}
}
