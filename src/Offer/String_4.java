package Offer;

/*
 * 汇编语言中有一种移位指令叫做循环左移（ROL），
 * 现在有个简单的任务，
 * 就是用字符串模拟这个指令的运算结果。
 * 对于一个给定的字符序列S，
 * 请你把其循环左移K位后的序列输出。
 * 例如，字符序列S=”abcXYZdef”,
 * 要求输出循环左移3位后的结果，
 * 即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class String_4 {

    public String LeftRotateString(String str,int n) {
    	StringBuilder sb=new StringBuilder();
    	if(str.equals(""))
    		return "";
    	
    	int length=str.length();
    	char[] charArray = str.toCharArray();
    	
    	for(int i=(n%length);i<charArray.length;i++) {
    		sb.append(charArray[i]);
    	}
    	for(int i=0;i<n%length;i++) {
    		sb.append(charArray[i]);
    	}
    	
    	return sb.toString();
    }
    public static void main(String[] args) {
		String_4 obj = new String_4();
    	System.out.println(obj.LeftRotateString("abcdefg", 7));
	}
}
