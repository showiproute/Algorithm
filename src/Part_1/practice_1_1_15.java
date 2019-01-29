package Part_1;

public class practice_1_1_15 {
	
	
	public static int[] histogram(int[] a,int M) {
		int[] arrayreturn=new int[M];
		int counts = 0,sum=0;
		for(int i=0;i<M;i++) {
			arrayreturn[i]=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]==i) {
					counts++;
				}
			}
			arrayreturn[i]=counts;
			counts=0;
		}
	
		for(int j=0;j<arrayreturn.length;j++)
			sum+=arrayreturn[j];
		
		if(sum==a.length)
			System.out.println("True");
		else {
			System.out.println("Not ture");
		}
		
		return arrayreturn;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] testarray= {0,4,3,2,1,5,6,7,8};
		int[] results=histogram(testarray, 9);
		
		for(int i=0;i<results.length;i++)
			System.out.println(results[i]);
	
	}
}
