package Offer;

import java.util.Arrays;
import java.util.Scanner;

public class PerfectWord_1 {


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] money=new int[n];
		for(int i=0;i<n;i++) {
			money[i]=sc.nextInt();
		}
		int price = sc.nextInt();
		Arrays.sort(money);

		int[] dp=new int[price+1];
		dp[0]=1;
		for(int i=0;i<money.length;++i) {
			for(int j=money[i];j<=price;++j) {
				dp[j]=(dp[j]+dp[j-money[i]]);
			}
		}
		System.out.println(dp[price]);
		
		
	}
	
}
