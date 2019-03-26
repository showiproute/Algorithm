package Offer;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c
 * 所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */

public class String_2 {
    public ArrayList<String> Permutation(String str) {
    	ArrayList<String> res=new ArrayList<>();
    	if(str!=null && str.length()>0) {
    		PermutationHelper(str.toCharArray(),0,res);
    		Collections.sort(res);
    	}
    	
    	return res;
    }
    
    public void PermutationHelper(char[] cs,int i,ArrayList<String> list) {
    	if(i==cs.length-1) {
    		String val=String.valueOf(cs);
    		if(!list.contains(val))
    			list.add(val);
    	}else {
    		for(int j=i;j<cs.length;j++) {
    			swap(cs,i,j);
    			PermutationHelper(cs, i+1, list);
    			swap(cs,i,j);
    			
    		}
    	}	
    	
    }
    
    public void swap(char[] cs,int i,int j) {
    	char temp=cs[i];
    	cs[i]=cs[j];
    	cs[j]=temp;
    }

    public static void main(String[] args) {
    	String_2 obj = new String_2();
    	System.out.println(obj.Permutation("abbc").toString());
    	
	}
    
    
    
}
