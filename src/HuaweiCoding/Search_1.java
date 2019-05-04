package HuaweiCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;


public class Search_1 {

	public static void getBrotherWord(int counts,String[] words,String key,int num) {
		
		ArrayList<String> storedList=new ArrayList<>();
		LinkedList<String> linkedList=new LinkedList<>();
		for (String word : words) {
			linkedList.add(word);
		}
		
		ArrayList<Character> arrayList=new ArrayList<>();
		for(int i=0;i<key.length();i++) {
			arrayList.add(key.charAt(i));
		}
		Collections.sort(arrayList);
			
		int totals=0;
		for (String itemValue : linkedList) {
			if(itemValue.length()==key.length() && !itemValue.equals(key)) {
				ArrayList<Character> arrayList2=new ArrayList<>();
				for(int i=0;i<itemValue.length();i++) {
					arrayList2.add(itemValue.charAt(i));
				}
				Collections.sort(arrayList2);
				if(arrayList.equals(arrayList2)) {
					totals++;
					storedList.add(itemValue);
				}
			}
		}
		Collections.sort(storedList,new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o1.toLowerCase().compareTo(o2.toLowerCase());
			}
		});
		
		System.out.println(totals);
		System.out.println(storedList.get(num-1));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int counts = sc.nextInt();
			String[] words=new String[counts];
			for(int i=0;i<counts;i++) {
				words[i]=sc.next();
			}
			String key=sc.next();
			int num=sc.nextInt();
			getBrotherWord(counts, words, key, num);
		}
	}
	
}
