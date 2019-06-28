package Xiaozhao_2019;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class NetEase_3 {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int m = sc.nextInt();
			String s = sc.next();
			int count=0;
			for(int j=0;j<m;j++) {
				if(s.charAt(j)=='.') {
					count++;
					j+=2;
				}
			}
			System.out.println(count);
		}
		
		
		
		
	}
	
}
