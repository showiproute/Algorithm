package Offer;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，
 * 打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，
 * 则打印出这三个数字能排成的最小数字为321323。
 */
public class Array_7 {
	
    public String PrintMinNumber(int [] numbers) {
    	StringBuilder sb=new StringBuilder();
    	String[] buffer=new String[numbers.length];
    	for(int i=0;i<numbers.length;i++) {
    		buffer[i]=Integer.toString(numbers[i]);
    	}
    	
    	Arrays.sort(buffer, new Comparator<String>() {
    		@Override
	    	public int compare(String o1, String o2) {
	    		// TODO Auto-generated method stub
	    		String s1=o1+o2;
	    		String s2=o2+o1;
	    		return s1.compareTo(s2);
    		}
		});
    	
    	for (String str : buffer) {
			sb.append(str);
		}
    	
    	return sb.toString();
    }
    
    
    public static void main(String[] args) {
		
    	Array_7 obj = new Array_7();
    	int[] array= {3,32,321};
    	System.out.println(obj.PrintMinNumber(array));
    
    }
    
}
