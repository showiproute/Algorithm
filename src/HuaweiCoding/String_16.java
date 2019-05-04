package HuaweiCoding;

import java.util.Arrays;
import java.util.Scanner;

public class String_16 {

	public static void Encrypt(char aucPassword[],char aucResult[]) {
		for(int i=0;i<aucPassword.length;i++) {
			char item = aucPassword[i];
			if(item>='a' && item<='z') {
				if(item=='z') {
					aucResult[i]='A';
				}
				else {
					aucResult[i]=(char) (item-31);
				}
			}else if(item>='A' && item<='Z') {
				if(item=='Z') {
					aucResult[i]='a';
				}
				else {
					aucResult[i]=(char)(item+33);
				}
			}else if(item>='0' && item<='9') {
				if(item=='9') {
					aucResult[i]='0';
				}else {
					aucResult[i]=(char)(item+1);
				}
			}
		}
		
		System.out.println(new String(aucResult));
		
		
	}
	
	public static void unEncrypt(char result[],char password[]) {
		for(int i=0;i<password.length;i++) {
			char item = password[i];
			if(item>='a' && item<='z') {
				if(item=='a') {
					result[i]='Z';
				}else {
					result[i]=(char) (item-33);
				}
			}else if(item>='A' && item<='Z') {
				if(item=='A') {
					result[i]='z';
				}else {
					result[i]=(char)(item+31);
				}
			}else if(item>='0' && item<='9') {
				if(item=='0') {
					result[i]='9';
				}else {
					result[i]=(char) (item-1);
				}
			}
		}
		System.out.println(new String(result));
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNext()) {
			char[] needEncrypt = sc.nextLine().toCharArray();
			char[] result=new char[needEncrypt.length];
			Encrypt(needEncrypt, result);
			char[] hasEncrypt = sc.nextLine().toCharArray();
			char[] result2=new char[hasEncrypt.length];
			unEncrypt(result, hasEncrypt);
		}
		
		
	}
	
}
