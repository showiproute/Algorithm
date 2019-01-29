package Recursive;

public class power {

	public static int power(int x,int n) {
		int y;
		if(n==0)
			y=1;
		else {
			y=power(x,n/2);
			y=y*y;
			if(n%2==1) y=y*x;
		}
		return y;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=power(2, 3);
		System.out.println(result);
		
	}

}
