package HuaweiCoding;

import java.util.HashSet;
import java.util.Scanner;

public class String_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			char[] nextLine = sc.nextLine().toCharArray();
			HashSet<Character> hashSet=new HashSet<>();
			for (Character value : nextLine) {
				hashSet.add(value);
			}
			System.out.println(hashSet.size());
			
			
			
		}
		
		
	}
	
}
