package Part_1;

import java.util.Arrays;
import java.util.function.IntPredicate;

import javax.xml.stream.events.StartDocument;

import Java_algroithm.ListArray;
import Java_algroithm.OutOfBoundaryException;
import Java_algroithm.Strategy;
import Java_algroithm.StudentStrategy;

import java.lang.Integer;
import java.lang.Math;
import java.util.Random;

public class test {

	private static final Strategy Strategy = null;


	public static int rank(int key,int[] a) {
		int lo=0;
		int hi=a.length-1;
		while(lo<=hi) {
			int mid=lo+(hi-lo)/2;
			if (key<a[mid]) hi=mid-1;
			else if(key>a[mid]) lo=mid+1;
			else  return mid;
		}
		
		return -1;
	}
	
	public static void find_max(int[] arr) {
		int max=arr[0];
		int index=0;
		for(int i=1;i<arr.length;i++) {
			if(max<=arr[i]) {
				max=arr[i];
				index=i;
			}
		}
		System.out.println(max+"\t"+index);
	}
	
	public static void calave(int[] arr) {
		double ave=0;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		ave=sum/arr.length;
		System.out.println(ave);
	}
	
	public static int[] copyarr(int[] arr) {
		int length=arr.length;
		int[] newarr=new int[length];
		for(int i=0;i<length;i++) {
			newarr[i]=arr[i];
		}
		
		return newarr;
	}
	
	public static int[] reversearr(int[] arr) {
		int length=arr.length;
		for(int i=0;i<length/2;i++) {
			int temp;
			temp=arr[i];
			arr[i]=arr[length-1-i];
			arr[length-1-i]=temp;
		}
		
		return arr;
	}
	
	public static int[][] chengfa(int[][] arr,int[][] arr2) {
		int length=arr.length;
		int[][] c=new int[length][length];
		for(int i=0;i<length;i++) {
			for(int j=0;j<length;j++) {
				for(int k=0;k<length;k++) {
					c[i][j]=arr[i][k]*arr2[k][j];
				}
			}
		}
		
		return c;
	}

	public static int abs(int x) {
		if(x<0) return -x;
		else return x;
	}
	
	public static double abs(double x) {
		if(x<0.0) return -x;
		else return x;
	}
	
	public static boolean isPrime(int N) {
		if(N<2) return false;
		for(int i=2;i<N;i++) {
			if(N%i==0) return false;
		}
		return true;
	}
	
	public static double sqrt(double c) {
		if(c<0) return Double.NaN;
		double err=1e-15;
		double t=c;
		while(Math.abs(t-c/t)>err*t)
			t=(c/t+t)/2.0;
		return t;
		
	}

	
	public static void main(String[] args) {
//		int[] whitelist= {1,2,3,4,5};
//		int result=rank(4, whitelist);
		
//		System.out.println(result);
		
//		double[] a=new double[10];
//		
//		for(int i=0;i<a.length;i++) {
//			a[i]=i;
//		}
//		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		
//		int[] a=new int[10];
//		
//		for(int i=0;i<a.length;i++) {
//			a[i]=i;
//		}
//		
//		int[] b=new int[10];
//		for(int i=0;i<b.length;i++) {
//			b[i]=b.length-i;
//		}
//		
//		find_max(a);
	
//		calave(a);
		
//		int[] result1=copyarr(a);
//
//		int[] result1=reversearr(a);
//		
//		for(int i=0;i<result1.length;i++) {
//			System.out.println(result1[i]);
//		}
	
//		int[][] arr=new int[5][5];
//		int[][] arr2=new int[5][5];
//		
//		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				arr[i][j]=i*j;
//				arr2[i][j]=i*j;
//			}
//		}
//		
//		int[][] newarr=chengfa(arr, arr2);
//		
//		for(int i=0;i<5;i++) {
//			for(int j=0;j<5;j++) {
//				System.out.print(newarr[i][j]+"\t");
//				if(j==4) {
//					System.out.println();
//				}
//			}
//		}
		
//		boolean result2=isPrime(5);
//		System.out.println(result2);
//		
//		
//		double result=sqrt(4);
//		System.out.println(result);
		
//		
//		String str1="AB";
//		String str2="CD";
//		System.out.println(str1+str2);
//		
//		String str3="123";
//		System.out.println(Integer.parseInt(str3));
//		int num=123;
//		System.out.println(Integer.toString(num));
//		
//		System.out.printf("PI is approximately %.2f\n",Math.PI);

		//		int N=Integer.parseInt(args[0]);
//		double lo=Double.parseDouble(args[1]);
//		double hi=Double.parseDouble(args[2]);
//		for(int i=0;i<N;i++) {
//			//
//		}
//		
		
		StudentStrategy studentStrategy=new StudentStrategy();
		ListArray listArray=new ListArray(studentStrategy);
		Student stu1=new Student();
		
		try {
			listArray.insert(0, stu1);
		} catch (OutOfBoundaryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Object stu=listArray.get(0);
			System.out.println(stu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int result=listArray.getSize();
		System.out.println(result);
	
		
		int result2=listArray.indexOf(stu1);
		System.out.println(result2);
		
		boolean result3=listArray.contains(stu1);
		System.out.println(result3);
	}
}
