package HuaweiCoding;

import java.util.Scanner;

public class String_22 {

	public static long ipToInteger(String inputStr) {
		long results=0;
		String[] fields = inputStr.split("\\.");
		StringBuilder sb=new StringBuilder();
		int parts=0;
		for(int i=0;i<fields.length;i++) {
			String resultStr = converToBinary(fields[i]);
			parts++;
			if(parts!=4) {
				sb.append(resultStr).append(".");
			}else {
				sb.append(resultStr);
			}
		}
		
		results = getIntegerResult(sb.toString());
		
		return results;
	}

	public static String intValueToIp(long value) {
		StringBuilder sb=new StringBuilder();
		int counts=0;
		while(value!=0) {
			int result=(int) (value%2);
			if(result==0) {
				sb.append("0");
				counts++;
				if(counts%8==0) {
					sb.append(".");
				}
			}else if(result==1) {
				sb.append("1");
				counts++;
				if(counts%8==0) {
					sb.append(".");
				}
			}
			value=value/2;
		}
		String secondStr = sb.reverse().toString();
		String[] fields = secondStr.split("\\.");
		int size=8-fields[0].length();
		StringBuilder firstStr=new StringBuilder();
		for(int i=0;i<size;i++) {
			firstStr.append("0");
		}
		
		String[] needHandle = firstStr.append(secondStr).reverse().toString().split("\\.");
		StringBuilder afterHandle=new StringBuilder();
		int handleCounts=0;
		int parts=0;
		for(int i=needHandle.length-1;i>=0;i--) {
			char[] charArray = needHandle[i].toCharArray();
			int values=0;
			for(int j=0;j<charArray.length;j++) {
				if(charArray[j]=='1') {
					values+=Math.pow(2, handleCounts);
				}
				handleCounts++;
			}
			if(parts!=3) {
				afterHandle.append(values).append(".");			
			}else {
				afterHandle.append(values);
			}
			parts++;
			handleCounts=0;
		}
		return afterHandle.toString();
	}
	
	public static String converToBinary(String inputStr) {
		int parseInt = Integer.parseInt(inputStr);
		StringBuilder temp=new StringBuilder();
		while(parseInt!=0) {
			temp.append(parseInt%2);
			parseInt=parseInt/2;
		}
		int size=temp.toString().length();
		if(size<8){
			int counts=8-size;
			for(int i=0;i<counts;i++) {
				temp.append("0");
			}
		}
		return temp.reverse().toString();
	}
	
	public static long getIntegerResult(String inputStr) {
		long result=0;
		String[] inputArray = inputStr.split("\\.");
		StringBuilder needCal=new StringBuilder();
		for(int i=0;i<inputArray.length;i++) {
			needCal.append(inputArray[i]);
		}
		String resultStrCal = needCal.toString();
		int counts=0;
		for(int i=resultStrCal.length()-1;i>=0;i--) {
			if(resultStrCal.charAt(i)=='1') {
				result+=Math.pow(2, counts);
			}
			counts++;
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String inputStr = sc.nextLine();
			String inputValue = sc.nextLine();
			System.out.println(ipToInteger(inputStr));
			System.out.println(intValueToIp(Long.parseLong(inputValue)));	
		}
		
		
	}
	
}
