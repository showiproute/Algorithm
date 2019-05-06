package HuaweiCoding;

import java.util.Scanner;

public class IP_Equal {

	public static int checkNetSeqment(String mask,String ip1,String ip2) {
		
		//判断ip地址是否非法
		String[] split = ip1.split("\\.");
		String[] split2= ip2.split("\\.");
		
		for(int i=0;i<split.length;i++) {
			if(Integer.parseInt(split[i])>255 || Integer.parseInt(split[i])<0) {
				return 1;
			}
	
			if(Integer.parseInt(split2[i])>255 || Integer.parseInt(split2[i])<0) {
				return 1;
			}
		}
		
		//判断子网掩码是否非法
		if(isInvalidMask(mask)!=0) {
			return 1;
		}
		
		//判断是否属于同一个子网
		
		//获取子网掩码长度
		String[] splitMask = mask.split("\\.");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<splitMask.length;i++) {
			int num = Integer.parseInt(splitMask[i]);
			while(num!=0) {
				sb.append(num%2);
				num=num/2;				
			}
		}
		String resultMask = sb.toString();
		int length=0;
		for(int i=0;i<resultMask.length();i++) {
			if(resultMask.charAt(i)=='1') {
				length++;
			}else {
				break;
			}
		}
		
		//把ip1 和ip2存在sb中
		StringBuilder ipSb1=new StringBuilder();
		StringBuilder ipSb2=new StringBuilder();
	
		for(int i=0;i<split.length;i++) {
			int num = Integer.parseInt(split[i]);
			StringBuilder ipSbTemp=new StringBuilder();
			for(int j=0;j<8;j++){
				ipSbTemp.append(num%2);
				num=num/2;
			}
			ipSbTemp.reverse();
			ipSb1.append(ipSbTemp.toString());
		}
		
		
		for(int i=0;i<split2.length;i++) {
			int num = Integer.parseInt(split2[i]);
			StringBuilder ipSbTemp=new StringBuilder();
			for(int j=0;j<8;j++){
				ipSbTemp.append(num%2);
				num=num/2;
			}
			ipSbTemp.reverse();
			ipSb2.append(ipSbTemp.toString());
		}
		
		
		String resultIp1 = ipSb1.toString();
		String resultIp2 = ipSb2.toString();
		
//		System.out.println("ip1:"+resultIp1+"length:"+resultIp1.length());
//		System.out.println("ip2:"+resultIp2+"length:"+resultIp2.length());
		for(int i=0;i<length;i++) {
			if(resultIp1.charAt(i)==resultIp2.charAt(i)) {
				continue;
			}else {
				return 2;
			}
		}
		
		return 0;
	}
	
	public static int isInvalidMask(String mask) {
		String[] split = mask.split("\\.");
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<split.length;i++) {
			int num = Integer.parseInt(split[i]);
			if(num>255 || num<0) {
				return 1;
			}
			while(num!=0) {
				sb.append(num%2);
				num=num/2;				
			}
		}
		//补0
		for(int i=sb.toString().length();i<32;i++) {
			sb.append("0");
		}
		
		String resultMask = sb.toString();
//		System.out.println(resultMask+"length"+resultMask.length());
		int index=0;
		for(int i=0;i<resultMask.length();i++) {
			if(resultMask.charAt(i)=='0') {
				index=i;
				break;
			}
		}
		
		for(int i=index;i<resultMask.length();i++) {
			if(resultMask.charAt(i)=='1') {
				return 1;
			}	
		}
	
		return 0;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String[] fields = sc.nextLine().split(" ");
			System.out.println(checkNetSeqment(fields[0], fields[1], fields[2]));
		}

		
	}
}
