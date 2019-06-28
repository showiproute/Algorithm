package Xiaozhao_2019;

import java.util.Scanner;

public class NetEase_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			String next = sc.next();			
			int counts=0;
			for(int i=0;i<N;i++) {
				if(next.charAt(i)=='L') {
					counts--;
				}else if (next.charAt(i)=='R') {
					counts++;
				}
			}
			while(counts<0) {
				counts+=4;
			}
			
			switch (counts%4) {
			case 0:
				System.out.println('N');
				break;
			case 1:
				System.out.println('E');
				break;
			case 2:
				System.out.println('S');
				break;
			case 3:
				System.out.println('W');
				break;
			}
			
		}
	}
	
}
