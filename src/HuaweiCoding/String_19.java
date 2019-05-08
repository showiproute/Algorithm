package HuaweiCoding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class String_19 {

	public static void ProcessString(String str1,String str2) {
		//初始化操作
		String sumStr=str1+str2;
		ArrayList<Character> jishu=new ArrayList<>();
		ArrayList<Character> oushu=new ArrayList<>();
		for(int i=0;i<sumStr.length();i++) {
			if((i+1)%2==0) {
				oushu.add(sumStr.charAt(i));
			}else {
				jishu.add(sumStr.charAt(i));
			}
		}
		Collections.sort(jishu);
		Collections.sort(oushu);

		ArrayList<Character> sumList=new ArrayList<>();
		int jiIndex=0;
		int ouIndex=0;
		for(int i=0;i<sumStr.length();i++) {
			if(i%2==0) {
				sumList.add(jishu.get(jiIndex));
				jiIndex++;
			}else {
				sumList.add(oushu.get(ouIndex));
				ouIndex++;
			}
		}
		StringBuilder sbResult=new StringBuilder();
		for(int i=0;i<sumList.size();i++) {
			char item = sumList.get(i);
			sbResult.append(BIT(item));
		}
		System.out.println(sbResult.toString());
	}
	
	public static char BIT(char value) {
		if(value=='0')
			return '0';
		else if(value=='1')
			return '8';
		else if(value=='2')
			return '4';
		else if(value=='3')
			return 'C';
		else if(value=='4')
			return '2';
		else if(value=='5')
			return 'A';
		else if(value=='6')
			return '6';
		else if(value=='7')
			return 'E';
		else if(value=='8')
			return '1';
		else if(value=='9')
			return '9';
		else if(value=='A' || value=='a')
			return '5';
		else if(value=='B' || value=='b')
			return 'D';
		else if(value=='C' || value=='c')
			return '3';
		else if(value=='D' || value=='d')
			return 'B';
		else if(value=='E' || value=='e')
			return '7';
		else if(value=='F' || value=='f')
			return 'F';
		else if(value<='Z' && value>='A') {
			return value;
		}
		else
			return value;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String str1 = sc.next();
			String str2 = sc.next();
			ProcessString(str1, str2);		
		}	
	}
	
}
