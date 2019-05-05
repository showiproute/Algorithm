package HuaweiCoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class DynamicProgramming_2 {

	public static int getNeedValue(int[] array,int n) {
		int[] dp=new int[n];
		int[] dp2=new int[n];
		int maxValue=0;		
		ArrayList<Integer> arrayList=new ArrayList<>();
		for(int i=0;i<n;i++) {
			arrayList.add(array[i]);
		}
		dp[0]=1;
		for(int i=1;i<n;i++) {
			dp[i]=1;
			for(int j=0;j<i;j++) {
				if(arrayList.get(j)<arrayList.get(i)
						&& dp[j]>dp[i]-1) {
					dp[i]=dp[j]+1;
				}		
			}
		}

		Collections.reverse(arrayList);
		dp2[0]=1;
		for(int i=1;i<n;i++) {
			dp2[i]=1;
			for(int j=0;j<i;j++) {
				if(arrayList.get(j)<arrayList.get(i)
						&& dp2[j]>dp2[i]-1) {
					dp2[i]=dp2[j]+1;
				}		
			}
		}
		
		for(int i=0;i<n;i++) {
			if(dp[i]+dp2[n-i-1]>maxValue) {
				maxValue=dp[i]+dp2[n-i-1];
			}
		}
		
		return n-maxValue+1;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int n = sc.nextInt();
			int[] array=new int[n];
			for(int i=0;i<n;i++) {
				array[i]=sc.nextInt();
			}
			int result = getNeedValue(array, n);
			System.out.println(result);
		}
		
	
	}
	
}
