package Part_1;
import java.lang.Math;

public class practice_1_1_20 {

	public static double factorialln(int n) {
		if(n>1)
			return Math.log(n)+factorialln(n-1);
		else
			return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
