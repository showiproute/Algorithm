package AlogrithmCourse;


//不记录箭头 只用c数组
public class DynamicProgramming_ver2 {
	public static int[][] c;
	public static StringBuilder result=new StringBuilder();
	
	public static void LCS_LENGTH(String X,String Y) {		
		X=init(X);
		Y=init(Y);
		
		int m=X.length();
		int n=Y.length();
		
		c=new int[m][n];
		
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
				}else if(c[i-1][j]>=c[i][j-1]) {
					c[i][j]=c[i-1][j];
				}else {
					c[i][j]=c[i][j-1];
				}
			}
		}
		
		PRINT_LCS(c,X,X.length()-1,Y, Y.length()-1);
		
	}
	
	public static void PRINT_LCS(int[][] c,String X,int i,String Y,int j) {
		if(i==0 || j==0)
			return;
		if(X.charAt(i)==Y.charAt(j)) {
			PRINT_LCS(c,X,i-1,Y,j-1);     
			result.append(X.charAt(i));
		}else if(c[i-1][j]>=c[i][j-1]) {
			PRINT_LCS(c,X,i-1,Y,j);
		}else {
			PRINT_LCS(c,X,i,Y,j-1);
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
