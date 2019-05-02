package HuaweiCoding;

import java.util.Scanner;

public class String_13 {
	
	public static String passwordTrans(String passwordOrigin) {
		char[] passCharArray = passwordOrigin.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<passCharArray.length;i++) {
			char item=passCharArray[i];
			if(item>='a' && item<='z') {
				char result= charTrans(item);
				sb.append(result);
			}else if(item>='A' && item<='Z') {
				char result = charTrans(item);
				sb.append(result);
			}else {
				sb.append(item);
			}
		}
		
		return sb.toString();
	}
	
	public static char charTrans(char item) {
		String abc="abc"; //2
		String def="def"; //3
		String ghi="ghi"; //4
		String jkl="jkl"; //5 
		String mno="mno"; //6
		String pqrs="pqrs"; //7
		String tuv="tuv"; //8 
		String wxyz="wxzy";//9
		
		if(item>='a' && item<='z') {
			if(abc.contains(item+"")) {
				return '2';
			}else if(def.contains(item+"")) {
				return '3';
			}else if(ghi.contains(item+"")) {
				return '4';
			}else if(jkl.contains(item+"")) {
				return '5';
			}else if(mno.contains(item+"")) {
				return '6';
			}else if(pqrs.contains(item+"")) {
				return '7';
			}else if(tuv.contains(item+"")) {
				return '8';
			}else if(wxyz.contains(item+"")) {
				return '9';
			}
		}
		
		if(item>='A' && item<='Z') {
			if(item=='Z') {
				return 'a';
			}else {
				item=(char)(item+33);
				return item;
			}
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String inputLine = sc.nextLine();
			String passTrans = passwordTrans(inputLine);
			System.out.println(passTrans);
		}
		
	}
	
}
