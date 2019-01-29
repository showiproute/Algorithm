package Part_1;

import java.util.Scanner;
import java.lang.Integer;

public class practice_1_1_21 {
	
	public static int binsearch(int[] args,int key) {
		int lo=0;
		int hi=args.length-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if(key<args[mid]) hi=mid-1;
			else if(key>args[mid]) lo=mid+1;
			else return mid;
			
		}
		return -1;
	}
	
	public static int cur_binsearch(int[] args,int lo,int hi,int key) {
		int mid=lo+(hi-lo)/2;
		if(key<args[mid]) return cur_binsearch(args, lo,mid-1, key);
		else if(key>args[mid]) return cur_binsearch(args, mid+1, hi, key);
		else return mid;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("Please enter three args name score1 score2");
//		String string=scanner.nextLine();
//		String[] argsstr=string.split(" ");
//		String name=argsstr[0];
//		double score1=Double.valueOf(argsstr[1]);
//		double score2=Double.valueOf(argsstr[2]);
//		System.out.println("name:"+name+"score1:"+score1+"score2:"+score2+"percent:"+score1/score2);
//		
//		for(int i=0;i<argsstr.length;i++) {
//			System.out.println("i="+argsstr[i]);
//		}
		
		int[] arrays= {1,2,3,4,5,6};
		int result=binsearch(arrays, 6);
		System.out.println("result:"+result);
	
		int result2=cur_binsearch(arrays, 0, arrays.length-1, 5);
		System.out.println("result2:"+result2);
		
	}
}
