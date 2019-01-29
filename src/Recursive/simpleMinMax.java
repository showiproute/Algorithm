package Recursive;

public class simpleMinMax {
	
	private static class IntPair{
		int x;
		int y;
	}
	
	public static IntPair simpleMinMax(int[] a) {
		IntPair pair=new IntPair();
		pair.x=a[0];
		pair.y=a[0];
		for(int i=0;i<a.length;i++) {
			if(pair.x<a[i]) pair.x=a[i];
			if(pair.y>a[i]) pair.y=a[i];
		}
		
		return pair;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,2,3,4,5,6,7,8,9};
		Object temp=simpleMinMax(array);
		IntPair result=(IntPair)temp;
		System.out.println("Min"+result.y+"Max:"+result.x);
	}

}
