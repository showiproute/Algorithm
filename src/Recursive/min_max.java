package Recursive;



public class min_max {

	public static class IntPair{
		int x;
		int y;
	}
	

	public static IntPair min_max(int[] a,int low,int high) {
		IntPair pair=new IntPair();
		if(low>high-2) {
			if(a[low]<a[high]) {
				pair.x=a[high];
				pair.y=a[low];
			}else {
				pair.y=a[high];
				pair.x=a[low];
			}
		}
		else {
			int mid=(low+high)/2;
			IntPair p1=min_max(a, low, mid);
			IntPair p2=min_max(a, mid+1, high);
			pair.x=p1.x>p2.x? p1.x:p2.x;
			pair.y=p1.y<p2.y? p1.y:p2.y;
		}
		return pair;
		
	}
	
	
	public static void main(String[] args){
	
		int[] array= {1,2,3,4,5,6,7,8,9};
		
		IntPair result=min_max(array, 0, 8);
		System.out.println("Min:"+result.y+"Max:"+result.x);
		
	}
}
