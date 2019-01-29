package Recursive;

public class hanoi {

	public static void move(char x,int n,char y) {
		System.out.println("Move"+n+"from"+x+"to"+y);
	}
	
	public static void hanoi(int n,char x,char y,char z) {
		if(n==1) move(x,n,z);
		else {
			hanoi(n-1, x, z, y);
			move(x,n,z);
			hanoi(n-1, y, x, z);
		}
	}
	
	public static void main(String[] args) {
		
		int n=3;
		
		hanoi(n, 'X', 'Y', 'Z');
	}
	
}
