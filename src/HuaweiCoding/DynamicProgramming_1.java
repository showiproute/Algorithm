package HuaweiCoding;

import java.util.Scanner;

/*
 * 王强今天很开心，公司发给N元的年终奖。王强决定把年终奖用于购物，他把想买的物品分为两类：主件与附件，附件是从属于某个主件的，下表就是一些主件与附件的例子：
主件	附件
电脑	打印机，扫描仪
书柜	图书
书桌	台灯，文具
工作椅	无
如果要买归类为附件的物品，必须先买该附件所属的主件。每个主件可以有 0 个、 1 个或 2 个附件。附件不再有从属于自己的附件。王强想买的东西很多，为了不超出预算，他把每件物品规定了一个重要度，分为 5 等：用整数 1 ~ 5 表示，第 5 等最重要。他还从因特网上查到了每件物品的价格（都是 10 元的整数倍）。他希望在不超过 N 元（可以等于 N 元）的前提下，使每件物品的价格与重要度的乘积的总和最大。
    设第 j 件物品的价格为 v[j] ，重要度为 w[j] ，共选中了 k 件物品，编号依次为 j 1 ， j 2 ，……， j k ，则所求的总和为：
v[j 1 ]*w[j 1 ]+v[j 2 ]*w[j 2 ]+ … +v[j k ]*w[j k ] 。（其中 * 为乘号）
    请你帮助王强设计一个满足要求的购物单。
 */
public class DynamicProgramming_1 {

	//v 价格 , p重要度, q主件还是附件
	
	public static int getMaxValue(int[] weight,int[] value,int[] q,int capacity,int counts) {
		int maxValue=0;
		int weightLen=counts+1;
		int valueLen=capacity+1;
		int[][] dp=new int[weightLen][valueLen];
		
		//构造新的weight value数组 便于运算
		int[] newWeight=new int[weightLen];
		newWeight[0]=0;
		for(int i=1;i<weightLen;i++) {
			newWeight[i]=weight[i-1];
		}
		
		int[] newValue=new int[weightLen];
		newValue[0]=0;
		for(int i=1;i<weightLen;i++) {
			newValue[i]=value[i-1];
		}
		
		int[] newQ=new int[weightLen];
		newQ[0]=0;
		for(int i=1;i<weightLen;i++) {
			newQ[i]=q[i-1];
		}
		
		//开始01背包的运算
		for(int i=0;i<weightLen;i++) {
			for(int j=0;j<valueLen;j++) {
				if(i==0) {
					dp[i][j]=0;
				}else if(j==0) {
					dp[i][j]=0;
				}else {
					if(newQ[i]==0) {
						if(newWeight[i]<=j) {
							dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-newWeight[i]]+newValue[i]);
						}
//						else {
//							dp[i][j]=dp[i-1][j];
//						}
					}else {
						if((newWeight[i]+newWeight[newQ[i]])<=j) {
							dp[i][j]=Math.max(dp[i-1][j], dp[i-1][j-newWeight[i]]+newValue[i]);
						}
//						else {
//							dp[i][j]=dp[i-1][j];
//						}
					}
				}
				maxValue=dp[i][j];
			}
		}
	
		return maxValue;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		int m = sc.nextInt();
		int[] v=new int[m];
		int[] p=new int[m];
		int[] q=new int[m];
		
		for(int i=0;i<m;i++) {
			v[i]=sc.nextInt();
			p[i]=sc.nextInt()*v[i];
			q[i]=sc.nextInt();
		}
		
		System.out.println(getMaxValue(v, p, q, N,m));
		
	}
	
}
