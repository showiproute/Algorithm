package HuaweiCoding;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/*
 * Character.isLetter
 */
public class String_15 {

	public static String stringTrans(String inputLine) {
		char[] charArray = inputLine.toCharArray();
		LinkedList<Character> linkedList=new LinkedList<>();
		
		for(int i=0;i<charArray.length;i++) {
			if(Character.isLetter(charArray[i])) {
				linkedList.add(charArray[i]);
			}
		}
		Collections.sort(linkedList,new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				return Character.toLowerCase(o1)-Character.toLowerCase(o2);
			}
		});
		StringBuilder sb=new StringBuilder();
		int counts=0;
		for(int i=0;i<charArray.length;i++) {
			if(Character.isLetter(charArray[i]) && counts<linkedList.size()) {
				sb.append(linkedList.get(counts));
				counts++;
			}else {
				sb.append(charArray[i]);
			}
		}
		
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String inputLine = sc.nextLine();
			System.out.println(stringTrans(inputLine));
		}
		
	}
	
}
