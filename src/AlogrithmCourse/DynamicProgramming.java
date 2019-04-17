package AlogrithmCourse;

import java.util.ArrayList;


public class DynamicProgramming {

	public static int[][] c;
	public static String[][] b;
	public static StringBuilder result=new StringBuilder();
	
	public static void LCS_LENGTH(String X,String Y) {		
		X=init(X);
		Y=init(Y);
		
		int m=X.length();
		int n=Y.length();
		
		c=new int[m][n];
		b=new String[m][n];
		
		for(int i=1;i<m;i++) {
			c[i][0]=0;
		}
		for(int i=0;i<n;i++) {
			c[0][i]=0;
		}
		
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				if(X.charAt(i)==(Y.charAt(j))) {
					c[i][j]=c[i-1][j-1]+1;
					b[i][j]="LU"; //左上箭头
				}else if(c[i-1][j]>=c[i][j-1]) {
					c[i][j]=c[i-1][j];
					b[i][j]="U"; //上箭头
				}else {
					c[i][j]=c[i][j-1];
					b[i][j]="L"; //左箭头
				}
			}
		}
		
		PRINT_LCS(b,X,X.length()-1,Y.length()-1);
		
	}
	
	public static void PRINT_LCS(String[][] b,String X,int i,int j) {
		if(i==0 || j==0)
			return;
		if(b[i][j].equals("LU")) {
			PRINT_LCS(b,X,i-1,j-1);
			result.append(X.charAt(i));
		}else if(b[i][j].equals("U")) {
			PRINT_LCS(b,X,i-1,j);
		}else {
			PRINT_LCS(b,X,i,j-1);
		}
		
	}
	
	public static String init(String temp) {
		StringBuilder sb=new StringBuilder();
		sb.append("#").append(temp);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String X="aabbdab";
		String Y="bdcabd";
		
		LCS_LENGTH(X,Y);
		System.out.println(result.toString());

		
	}
	
}
