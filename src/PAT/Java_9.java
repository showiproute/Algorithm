package PAT;

import java.util.Arrays;
import java.util.Scanner;


public class Java_9 {

	public static String[] Kaprekar(String[] fields){
		Arrays.sort(fields);
		int low=0;
		int high=0;
		int result;
//		System.out.println("Before:"+Arrays.toString(fields));
		for(int i=0;i<4;i++) {
			low+=Integer.parseInt(fields[3-i])*Math.pow(10, i);
		}
		
		for(int i=0;i<4;i++) {
			high+=Integer.parseInt(fields[i])*Math.pow(10, i);
		}
		result=high-low;
		
		if(low<1000) {
			if(low>100)
				System.out.println(high+" "+"-"+" "+"0"+low+" "+"="+" "+result);
			else if(low>10)
				System.out.println(high+" "+"-"+" "+"00"+low+" "+"="+" "+result);
			else 
				System.out.println(high+" "+"-"+" "+"000"+low+" "+"="+" "+result);
		}else {
			System.out.println(high+" "+"-"+" "+low+" "+"="+" "+result);
		}
				
		String str = Integer.toString(result);
		fields = str.split("");
		
//		System.out.println("test"+result+"fields:"+Arrays.toString(fields));
		
		return fields;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String words = scanner.nextLine();
		String[] fields = words.split("");
		boolean flag=true;
		
		StringBuilder tempsb=new StringBuilder();
		int length = fields.length;
		
		if(length<4) {
			int space=4-length;
//			System.out.println("Space:"+space);
			if(space==1) {
				tempsb.append("0");
			}
			if(space==2) {
				tempsb.append("0").append("0");
			}
			if(space==3) {
				tempsb.append("0").append("0").append("0");
			}
			for(int i=0;i<length;i++) {
				tempsb.append(fields[i]);
			}
			fields = tempsb.toString().split("");
		}
		
		
		if(fields[0].equals(fields[1]) && fields[0].equals(fields[2]) &&fields[0].equals(fields[3])) {
			System.out.println(words+" "+"-"+" "+words+" "+"="+" "+"0000");
			flag=false;
		}
		
		
//		System.out.println(Arrays.toString(fields));
		if(flag==true) {
			fields = Kaprekar(fields);
			while(true) {
				StringBuilder sb=new StringBuilder();
				sb.append(fields[0]).append(fields[1]).append(fields[2]).append(fields[3]);
				if(sb.toString().equals("6174")) {
					break;
				}else {
					fields = Kaprekar(fields);
				}
			}
		}
		
	}
	
}
