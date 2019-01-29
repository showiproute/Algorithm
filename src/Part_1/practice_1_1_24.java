package Part_1;

public class practice_1_1_24 {

	public static int CommonDivisor(int x,int y) {
		if(x==1||y==1) {
			System.out.println("x+"+x+"y="+y);
			return 1;
		}
		if(x<y) {
			int temp=x;
			x=y;
			y=temp;
		}
		System.out.println("x="+x+"y="+y);
		if(x%y==0) {
			return y;
		}else {
			x=x%y;
			System.out.println("x="+x);
			return CommonDivisor(x, y);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result=CommonDivisor(1111111,1234567);
		System.out.println("result:"+result);
		
		
		
	}

}
