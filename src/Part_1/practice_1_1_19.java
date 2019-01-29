package Part_1;

public class practice_1_1_19 {
	
	public static int Fabbnoionc(int n) {
		if(n==0) return 0;
		if(n==1) return 1;
		return Fabbnoionc(n-1)+Fabbnoionc(n-2);
	}

	public static int[] savearray(int[] array) {
		array[0]=0;
		array[1]=1;
		for(int i=2;i<array.length;i++) {
			array[i]=array[i-1]+array[i-2];
			System.out.println(i+"\t"+array[i]);
		}
		return array;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		for(int N=0;N<100;N++) {
//			System.out.println(N+"\t"+Fabbnoionc(N));
//		}

		int[] array=new int[10];
		savearray(array);
		
	}

}
