package HuaweiCoding;

import java.util.Scanner;

/*
 * 
 */
public class String_10 {
		
	public static int A=0;
	public static int B=0;
	public static int C=0;
	public static int D=0;
	public static int E=0;
	public static int wrongIp=0;
	public static int wrongMask=0;
	public static int privateIp=0;
	public static boolean privateIpFlag;

	public static void toBinary(String mask,StringBuilder resultMask) {
		if("0".equals(mask)) {
			resultMask.append("00000000");
		}
		
		int parseInt = Integer.parseInt(mask);
		while(parseInt!=0) {
			resultMask.append(parseInt%2);
			parseInt=parseInt/2;
		}
	}
	
	public static void netMask(StringBuilder resultMask) {
		String stringMask = resultMask.toString();
		int index=0;
		for(int i=0;i<stringMask.length();i++) {
			if(stringMask.charAt(i)=='0') {
				index=i;
				break;
			}
		}
		for(int j=index;j<stringMask.length();j++) {
			if(stringMask.charAt(j)=='1') {
				wrongMask+=1;
				break;
			}
		}
	}
	
	public static boolean ipPrivate(String ip) {
		String[] inputIp = ip.split("\\.");
		if(Integer.parseInt(inputIp[0])==10) {
			for(int i=1;i<inputIp.length;i++) {
				int num=Integer.parseInt(inputIp[i]);
				if(num<0 || num>255) {
					privateIpFlag=false;
					return false;
				}
			}
			privateIpFlag=true;
			privateIp+=1;
			return true;
		}
		if(Integer.parseInt(inputIp[0])==172) {
			int secondIp = Integer.parseInt(inputIp[0]);
			if(secondIp<16 || secondIp>31) {
				privateIpFlag=false;
				return false;
			}
			for(int i=2;i<inputIp.length;i++) {
				int num=Integer.parseInt(inputIp[i]);
				if(num<0 || num>255) {
					privateIpFlag=false;
					return false;
				}
			}
			privateIpFlag=true;
			privateIp+=1;
			return true;
		}
		if(Integer.parseInt(inputIp[0])==192) {
			int secondIp = Integer.parseInt(inputIp[0]);
			if(secondIp!=168) {
				privateIpFlag=false;
				return false;
			}
			for(int i=2;i<inputIp.length;i++) {
				int num=Integer.parseInt(inputIp[i]);
				if(num<0 || num>255) {
					privateIpFlag=false;
					return false;
				}
			}
			privateIpFlag=true;
			privateIp+=1;
			return true;
		}
		privateIpFlag=false;
		return false;
	}
	
	public static boolean ipAddress(String ip) {
		String[] inputIp = ip.split("\\.");
		for (String strIp : inputIp) {
			if("".equals(strIp)) {
				wrongIp+=1;
				return false;
			}
			int parseInt = Integer.parseInt(strIp);
			if(parseInt<0 || parseInt>255) {
				wrongIp+=1;
				return false;
			}
		}
		
		return true;
	}
	
	public static void ipRange(String ip) {
		String[] inputIp = ip.split("\\.");
		int firstIp = Integer.parseInt(inputIp[0]);
		if(!privateIpFlag) {
			if(firstIp>=1 && firstIp<=126) {
				A+=1;
			}
			if(firstIp>=128 && firstIp<=191) {
				B+=1;
			}
			if(firstIp>=192 && firstIp<=223) {
				C+=1;
			}
			if(firstIp>=224 && firstIp<=239) {
				D+=1;
			}
			if(firstIp>=240 && firstIp<=255) {
				E+=1;
			}
		}
	}
	
	public static void ipAddressAndnetMask(String ip,String netmask) {
		//计算mask
		String[] inputMask = netmask.split("\\.");
		StringBuilder resultMask=new StringBuilder();
		for (String mask : inputMask) {
			toBinary(mask,resultMask);	
		}
		netMask(resultMask);		
		//计算Ip是否合法
		boolean resultIp = ipAddress(ip);
		
		privateIpFlag=false;
		//检查私有IP
		if(resultIp) {
			ipPrivate(ip);
		}
		
		//这里不对
		if(resultIp && privateIpFlag==false) {
			ipRange(ip);
		}
		
	}
	
	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			String inputLineTemp = sc.nextLine();
			if("".equals(inputLineTemp)) {
				break;
			}
			String[] inputLine=inputLineTemp.split("~");
			ipAddressAndnetMask(inputLine[0], inputLine[1]);
			
		}
		sc.close();
		System.out.println(A+" "+B+" "+C+" "+D+" "+E+" "+(wrongIp+wrongMask)+" "+privateIp);

	}
	
}
