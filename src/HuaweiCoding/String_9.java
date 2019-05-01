package HuaweiCoding;

import java.util.Scanner;

/*
 * 
 */
public class String_9 {
	
	public static int x=0;
	public static int y=0;
	
	public static void moveLocation(String location) {
		if(location.length()==0) {
			return;
		}
		char[] fields = location.toCharArray();
		char firstChar = fields[0];
		if(firstChar!='A' && firstChar!='S' &&
				firstChar!='D' && firstChar!='W' ) {
			return;
		}
		for(int i=1;i<fields.length;i++) {
			if(!(fields[i]>='0' && fields[i]<='9')) {
				return;
			}
		}
		
		int counts=0;
		for(int i=1;i<fields.length;i++) {
			counts*=10;
			counts+=Integer.parseInt(fields[i]+"");
		}
		
		if(firstChar=='A') {
			x-=counts;
		}
		if(firstChar=='S') {
			y-=counts;
		}
		if(firstChar=='D') {
			x+=counts;
		}
		if(firstChar=='W') {
			y+=counts;
		}

	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String[] inputLine = sc.nextLine().split(";");
			for (String inputStr : inputLine) {
				moveLocation(inputStr);
			}
			System.out.println(x+","+y);
			x=0;
			y=0;
		}
		
	}
	
}
