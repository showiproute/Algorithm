package Offer;

import java.util.Scanner;

public class IFLYTEK_2 {

	public static String encryptMessage(int[] code,int m,String message) {
		int[] newCode=new int[code.length+1];
		newCode[0]=-1;
		for(int i=0;i<code.length;i++) {
			newCode[i+1]=code[i];
		}
		
		char[] newMessage=new char[message.length()+1];
		newMessage[0]='N';
		for(int i=1;i<message.length();i++) {
			newMessage[i]=message.charAt(i);
		}
		
		for(int i=1;i<m+1;i++) {
			int index=newCode[i];
			char temp=newMessage[index];
			newMessage[index]=newMessage[i];
			newMessage[i]=temp;
		}
		
		char[] resultMessage=new char[message.length()];
		for(int i=0;i<message.length();i++) {
			resultMessage[i]=newMessage[i+1];
		}
		StringBuilder resultString=new StringBuilder();
		for(int i=0;i<resultMessage.length;i++) {
			resultString.append(resultMessage[i]);
		}
		
		return resultString.toString();
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int N = sc.nextInt();
			int[] code=new int[N];
			for(int i=0;i<N;i++) {
				code[i]=sc.nextInt();
			}
			StringBuilder sb=new StringBuilder();
			int m= sc.nextInt();
			
			while(m!=0) {
				String message = sc.nextLine();
				String encryptMessage = encryptMessage(code, m, message);
				sb.append(encryptMessage).append("\n");
				m=sc.nextInt();
			}
			if(m==0) {
				System.out.println(sb.toString());
				break;
			}
		}
		
	}
	
}
