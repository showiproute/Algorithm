package Part_1;

public class practice_1_1_13 {

	public static void ArrayReverse(int[][] arrays,int M,int N) {
		int[][] reversedArray=new int[N][M];
		for(int i=0;i<M;i++)
			for(int j=0;j<N;j++) {
				int temp=arrays[i][j];
				reversedArray[j][i]=temp;
			}
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<M;j++) {
				System.out.print(reversedArray[i][j]+"\t");
			}
			System.out.println();
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[][] arrays= {{1,2,3,4},
					{5,6,7,8},
					{4,3,2,1},
			};
			
			ArrayReverse(arrays, 3, 4);
	
	}
}
