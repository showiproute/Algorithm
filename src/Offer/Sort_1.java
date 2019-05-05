package Offer;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Sort_1 {
	public static void getIinRString(int[] I, int[] R,int N,int M) {
		
		//从小到大获取R的值存到newR
		TreeMap<Integer, Integer> treeMap=new TreeMap<>();
		for(int i=0;i<M;i++) {
			if(treeMap.containsKey(R[i])) {
				treeMap.put(R[i], treeMap.get(R[i])+1);
			}else {
				treeMap.put(R[i], 1);
			}
		}
		
		int index=0;
		String[] newR=new String[treeMap.size()];
		for (Integer key : treeMap.keySet()) {
			newR[index]=""+key;
			index++;
		}
		
		//构造一个新的newI
		String[] newI=new String[N];
		for(int j=0;j<N;j++) {
			newI[j]=""+I[j];
		}
		
		LinkedHashMap<Integer, Integer> hashMap=new LinkedHashMap<>();
		ArrayList<Integer> arrayList=new ArrayList<>();
		
		for(int i=0;i<newR.length;i++) {
			String key = newR[i];
			int counts=0;
			for(int j=0;j<newI.length;j++) {
				if(newI[j].contains(key)) {
					counts++;
					arrayList.add(j);
					arrayList.add(Integer.parseInt(newI[j]));
				}
			}
			if(counts!=0) {
				hashMap.put(Integer.parseInt(key), counts);
			}
		}
		
		ArrayList<Integer> resultList=new ArrayList<>();
		int totals=0;
		int start=0;
		int end=0;
		for (Entry<Integer, Integer> keyValue : hashMap.entrySet()) {
			int key = keyValue.getKey();
		    int value = keyValue.getValue();
		    resultList.add(key);
		    resultList.add(value);
		    totals+=value*2+2;
		    end+=value*2;
		    for(;start<end;start++) {
		    	resultList.add(arrayList.get(start));
		    }
		}
		resultList.add(0, totals);
		for(int i=0;i<resultList.size();i++){
			System.out.print(resultList.get(i)+" ");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int[] I=new int[N];
			for(int i=0;i<N;i++) {
				I[i]=sc.nextInt();
			}
			int M=sc.nextInt();
			int[] R=new int[M];
			for(int i=0;i<M;i++) {
				R[i]=sc.nextInt();
			}
			getIinRString(I, R, N, M);
		}

	}
}
