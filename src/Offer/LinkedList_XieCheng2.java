package Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LinkedList_XieCheng2 {

	public static int[] reverseList(int[] arrays,int k) {
		if(arrays==null)
			return null;
		ArrayList<Integer> arraylist=new ArrayList<>();
		int length=arrays.length;
		int counts=length/k;
		int index=0;
		int end=index+k;
		for(int i=1;i<=counts;i++) {
			for(int j=end-1;j>=index;j--) {
				arraylist.add(arrays[j]);
			}
			index=index+k;
			end=index+k;
		}
		if(length>index) {
			for(int i=index;i<length;i++) {
				arraylist.add(arrays[i]);
			}
		}
		int[] result=new int[length];
		for(int i=0;i<arraylist.size();i++) {
			result[i]=arraylist.get(i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		String nextLine=null;
		int k=0;
		Scanner scanner = new Scanner(System.in);
		nextLine = scanner.nextLine();
		k = scanner.nextInt();
		ArrayList<Integer> arrayList=new ArrayList<>();
		for(int i=0;i<nextLine.length();i++) {
			if(nextLine.charAt(i)>='0' && nextLine.charAt(i)<='9') {
				arrayList.add(nextLine.charAt(i)-48);
			}
		}
		int[] inputarray=new int[arrayList.size()];
		for(int i=0;i<arrayList.size();i++) {
			inputarray[i]=arrayList.get(i);
		}		
		System.out.println(Arrays.toString(reverseList(inputarray, k)));
	}
}
