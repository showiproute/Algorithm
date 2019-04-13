package Offer;

import java.security.KeyStore.TrustedCertificateEntry;

/*
 * 地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，
 * 每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
 *  例如，当k为18时，机器人能够进入方格（35,37），
 *  因为3+5+3+7 = 18。但是，它不能进入方格（35,38），
 *  因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class Normal_5 {

    public int movingCount(int threshold, int rows, int cols) {
    	boolean[][] visited=new boolean[rows][cols];
    	return judge(threshold, rows, cols, 0, 0, visited);
    }
    
    
    public int judge(int limit,int rows,int cols,int i,int j,boolean[][] visited) {
    	if(i<0 || i>=rows || j<0 || j>=cols || visited[i][j]==true 
    			|| sum(i)+sum(j) > limit
    			) {
    		return 0;
    	}
    	
    	visited[i][j]=true;
    	
    	return judge(limit, rows, cols, i-1, j, visited) +
    			judge(limit, rows, cols, i+1, j, visited)+
    			judge(limit, rows, cols, i, j-1, visited)+
    			judge(limit, rows, cols, i, j+1, visited)+1;

    }
    
    public int sum(int num) {
    	int count=0;
    	while(num!=0) {
    		count+=num%10;
    		num/=10;
    	}
    	return count;
    }
    
    
}
