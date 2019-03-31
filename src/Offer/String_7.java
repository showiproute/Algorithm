package Offer;


/*
 * 将一个字符串转换成一个整数
 * (实现Integer.valueOf(string)的功能，
 * 但是string不符合数字要求时返回0)，
 * 要求不能使用字符串转换整数的库函数。 
 * 数值为0或者字符串不是一个合法的数值则返回0。
 */

public class String_7 {
    public int StrToInt(String str) {
    	
    	if(str.equals("")) {
    		return 0;
    	}
    	if(str.charAt(0)=='0' && str.length()==1)
    		return 0;
    	
    	char[] charStr = str.toCharArray();
    	boolean flag=true;
    	boolean temp=true;
    	int counts=0;
    	
    	if(charStr[0]=='+'||charStr[0]=='-') {
    		if(charStr[0]=='+')
    			temp=true;
    		else 
    			temp=false;
    		for(int i=1;i<charStr.length;i++) {
    			if(charStr[i]>='0'&&charStr[i]<='9') {
    				counts=counts*10+(int)(charStr[i]-'0');
    				continue;
    			}else {
    				flag=false;
    				break;
    			}
    		}
    	}else {
    		for(int i=0;i<charStr.length;i++) {
    			if(charStr[i]>='0' && charStr[i]<='9') {
    				counts=counts*10+(int)(charStr[i]-'0');
    				continue;
    			}else {
    				flag=false;
    				break;
    			}
    		}
    	}
    	
    	if(!flag) {
    		return 0;
    	}
   
    
    	if(temp) {
    		return 0+counts;
    	}else {
    		return 0-counts;
    	}
    	
    }
    
    public static void main(String[] args) {
		
    	String_7 obj = new String_7();
    	System.out.println(obj.StrToInt(" 1a33"));
    	
	}
}
