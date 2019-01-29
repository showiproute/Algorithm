package Java_algroithm;

public class MergeSort {
	
	public static int[] rank(int[] array1,int[] array2) {
		int length=array1.length;
		int length2=array2.length;
		int[] newarray=new int[length+length2];
		int pa=0;
		int pb=0;
		int pc=0;
		while(pa<length && pb<length2) {
			if(array1[pa]<array2[pb]) {
				newarray[pc]=array1[pa];
				pc++;
				pa++;
			}
			else {
				newarray[pc]=array2[pb];
				pc++;
				pb++;
			}
		}
	
		if(pa==length) {
			for(int i=pb;i<length2;i++) {
				newarray[pc]=array2[i];
				pc++;
			}
		}
		else { 
			for(int j=pa;j<length;j++) {
				newarray[pc]=array1[j];
				pc++;
			}
		
			}
		
		return newarray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1= {1,3,5,7,9};
		int[] array2= {2,4,6,8,10,12,14};
		
		int[] results=rank(array1,array2);
		for(int i=0;i<results.length;i++) {
			System.out.println(results[i]);
		}
		
		
	}


}
