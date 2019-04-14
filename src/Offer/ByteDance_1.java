package Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ByteDance_1 {

	public static int min=0;
	public static int Solution(char[][] inputArray,int rows,int cols) {
		
		boolean flag=true;
		while(flag) {
			ArrayList<Integer> tmp=new ArrayList<>();
			flag=false;
			for(int i=0;i<rows;i++) {
				for(int j=0;j<cols;j++) {
					if(inputArray[i][j]=='2') {
						tmp.add(i);
						tmp.add(j);
					}
				}
			}
			System.out.println(tmp.toString());
			if(helper(inputArray, tmp, rows, cols)) {
				flag=true;
			}
			
		}
		
		
		
		return min;
	}
	
	public static boolean helper(char[][] inputArray,ArrayList<Integer> tmp,int rows,int cols) {
		boolean flag=false;
		for(int k=0;k<tmp.size();k+=2) {
			int i=tmp.get(k);
			int j=tmp.get(k+1);
			System.out.println("RESULT:"+i+":"+j);
			if(i-1>=0) {
				if(inputArray[i-1][j]=='1') {
					inputArray[i-1][j]='2';
					flag=true;
				}
			}
			if(j-1>=0) {
				if(inputArray[i][j-1]=='1') {
					inputArray[i][j-1]='2';
					flag=true;
				}
			}
			if(i+1<=rows) {
				if(inputArray[i+1][j]=='1') {
					inputArray[i+1][j]='2';
					flag=true;
				}
			}
			if(j+1<=cols) {
				System.out.println(i+":"+(j+1));
				if(inputArray[i][j+1]=='1') {
					inputArray[i][j+1]='2';
					flag=true;
				}
			}
		}
		
		if(flag) {
			min++;
			return true;
		}
		
		return false;
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		int rows=0,cols=0;
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			if("".equals(str)) {
				break;
			}
			rows+=1;
			sb.append(str).append("\n");
		}
		
		char[] charArray = sb.toString().trim().toCharArray();
		StringBuilder matrix=new StringBuilder();
		int length=0;
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]>='0'&&charArray[i]<='9') {
				matrix.append(charArray[i]);
				length++;
			}
		}
		cols=length/rows;
		char[] matrixArray=matrix.toString().toCharArray();
				
		char[][] inputArray=new char[rows][cols];
	
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				inputArray[i][j]=matrixArray[i*cols+j];
			}
		}

		System.out.println(Solution(inputArray, rows, cols));
		
	}
	
}
