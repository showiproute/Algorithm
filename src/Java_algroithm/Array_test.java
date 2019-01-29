package Java_algroithm;

public class Array_test {

	public static int[] rank(int[] input_array) {
		int length=input_array.length;
		int[] return_array=new int[length];
		int index=0;
		int pivot=0;
		for(int i=0;i<input_array.length;i++) {
			int input_value=input_array[i];
			if(input_value%2!=0) {
				return_array[index]=input_value;
				index++;
			}
			else {
				for(int j=index;j>=0;j--) {
					if(return_array[j]%2!=0) {
						return_array[j]=0;
						pivot=j;
					}
				}
				return_array[pivot]=input_value;
				index=pivot+1;
			}
		}
		
		return return_array;
	}
	
	public static int[] function4(int[] a) {
		int p=0,n=a.length;
		int[] array=new int[n];
		for(int i=0;i<n;i++) {
			if(a[i]%2==0)
				while(p>0 && array[p-1]%2!=0) array[p--]=0;
			array[p++]=a[i];
	}
		return array;
	}
	
	
	public static void main(String[] args) {
		int[] input_arrays= {2,3,5,8,4,7,3};
		int[] results=function4(input_arrays);
		for(int i=0;i<results.length;i++) {
			System.out.println(results[i]);
		}
		
	}
}
