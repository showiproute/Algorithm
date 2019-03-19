package Offer;

import java.util.Arrays;

/*
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy
 */

public class String_1 {

    public static String replaceSpace(StringBuffer str) {
    	String[] result=str.toString().split("");
    	StringBuilder sb=new StringBuilder();
    	for (String string : result) {
			if(" ".equals(string)) {
				sb.append("%20");
			}else {
				sb.append(string);
			}
		}
    	   	
    	
    	System.out.println(sb.toString());
    	return sb.toString();
    }
	
    public static void main(String[] args) {
		
    	StringBuffer sb=new StringBuffer();
    	sb.append("We").append(" ").append("Are").append(" ").append("Happy");
    	
    	replaceSpace(sb);    	
    	
	}
}
