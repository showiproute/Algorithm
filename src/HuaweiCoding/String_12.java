package HuaweiCoding;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class String_12 {

	public static TreeSet<String> treeSet=new TreeSet<>();
	
	public static boolean passwordCheck(String password) {
		if(password.length()<8) {
			return false;
		}
		int characterSmall=0,characterBig=0,digit=0,other=0;
		
		char[] passwordCharArray = password.toCharArray();
		for(int i=0;i<passwordCharArray.length;i++) {
			if(passwordCharArray[i]>='0' && passwordCharArray[i]<='9') {
				digit=1;
				continue;
			}
			else if(passwordCharArray[i]>='a' && passwordCharArray[i]<='z') {
				characterSmall=1;
				continue;
			}
			else if(passwordCharArray[i]>='A' && passwordCharArray[i]<='Z') {
				characterBig=1;
				continue;
			}
			else {
				other=1;
				continue;
			}	
		}
		if((characterBig+characterSmall+digit+other)<3) {
			return false;
		}
		
		//判断是否有子串重复
		for(int i=0;i<passwordCharArray.length-2;i++) {
			String substring = password.substring(i, i+3);
			if(password.substring(i+1).contains(substring)) {
				return false;
			}
		}
		
		if(treeSet.contains(password)) {
			return false;
		}
		
		treeSet.add(password);
		return true;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()) {
			String inputStr = sc.nextLine();
			boolean result = passwordCheck(inputStr);
			if(result) {
				System.out.println("OK");
			}else {
				System.out.println("NG");
			}
		}
		
	}
	
}
