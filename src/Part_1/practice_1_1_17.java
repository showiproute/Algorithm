package Part_1;

public class practice_1_1_17 {

	public static String exR2(int n) {
		String s=exR2(n-3)+n+exR2(n-2)+n;
		if(n<=0) return "";
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			exR2(3);
	}

}
