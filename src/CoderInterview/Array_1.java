package CoderInterview;

import java.util.Scanner;

public class Array_1 {
	
	/*
	 * 1 2 3
	 * 4 5 6
	 * 7 8 9 
	 * ---->
	 * 7 4 1
	 * 8 5 2
	 * 9 6 3
	 */

    public int[][] transformImage(int[][] mat, int n) {
        // write code here
    	if(mat==null) {
    		return mat;
    	}
    	
    	int temp=0;
    	for(int i=0;i<n-1;i++) {
    		for(int j=0;j<n-i-1;j++) {
    			temp=mat[i][j];
    			mat[i][j]=mat[n-j-1][n-i-1];
    			mat[n-j-1][n-i-1]=temp;
    		}
    	}
    	
    	for(int i=0;i<(n/2);i++) {
    		for(int j=0;j<n;j++) {
    			temp=mat[i][j];
    			mat[i][j]=mat[n-i-1][j];
    			mat[n-i-1][j]=temp;
    		}
    	}
    	return mat;
    
    }
	
    
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			
		}
    	
	}
	
}
