package CoderInterview;

import java.util.Scanner;

public class String_5 {
    public String zipString(String iniString) {
        // write code here
    	StringBuilder sb=new StringBuilder();
    	
    	for(int i=0;i<iniString.length()-1;i++) {
    		int tempValue=1;
    		while(i+1<iniString.length() && 
    				iniString.charAt(i)==iniString.charAt(i+1)) {
    			tempValue++;
    			i++;
    		}
    		sb.append(iniString.charAt(i)).append(tempValue);
    	}
    	
    	if(sb.toString().length()>=iniString.length()) {
    		return iniString;
    	}else {
    		return sb.toString();
    	}
    	
    	
    }

    public static void main(String[] args) {
    	String_5 obj=new String_5();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String initString = sc.nextLine();
			String zipString = obj.zipString(initString);
			System.out.println(zipString);
		}
    	
	}
}
