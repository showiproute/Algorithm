package Xiaozhao_2019;

import java.util.Scanner;

public class NetEase_2 {


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			int begin = sc.nextInt();
			int end = sc.nextInt();
			int counts=0;
			for(int i=begin;i<=end;i++) {
				switch (i%3) {
				case 1:
					break;
				case 2:
					counts++;
					break;
				case 0:
					counts++;
					break;
				}
			}
			
			System.out.println(counts);
		}
		
		
		
	}
	
}
