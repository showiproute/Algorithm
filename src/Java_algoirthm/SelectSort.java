package Java_algoirthm;

public class SelectSort {
	
	public static int[] rank(int[] arrays) {
		for(int i=0;i<arrays.length;i++) {
			int temp=arrays[i];
			int pivot=arrays[i];
			int index=i;
			for(int j=i+1;j<arrays.length;j++) {
				if(temp>arrays[j]) {
					temp=arrays[j];
					index=j;
				}
				
			}
			arrays[i]=temp;
			arrays[index]=pivot;
		}
		return arrays;
	}

	public static int[] rank2(int[] arrays) {
		for(int i=0;i<arrays.length;i++) {
			int pivot=i;
			for(int j=i+1;j<arrays.length;j++) {
				if(arrays[j]<arrays[pivot]) {
					pivot=j;
				}
			}
			if(pivot!=i) {
				int temp=arrays[i];
				arrays[i]=arrays[pivot];
				arrays[pivot]=temp;
			}
		}
		
		return arrays;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arrays= {8,6,5,3,2,1,4};
		int[] result=rank(arrays);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
		
		System.out.println("________________________________");
		
		int[] arrays2= {5,6,7,2,3,1,4};
		int[] results2=rank(arrays2);
		for(int i=0;i<results2.length;i++) {
			System.out.println(results2[i]);
		}
		
	}

}
