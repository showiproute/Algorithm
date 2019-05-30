package CoderInterview;

import java.util.Scanner;

public class String_4 {
	
    public String replaceSpace(String iniString, int length) {
        // write code here
    	StringBuilder sb = new StringBuilder();
    	for(int i=0;i<iniString.length();i++) {
    		if(iniString.charAt(i)!=' ') {
    			sb.append(iniString.charAt(i));
    		}else {
    			sb.append("%20");
    		}
    	}
    	
    	return sb.toString();
    	
    }

    public static void main(String[] args) {
    	String_4 obj=new String_4();
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String iniString = sc.nextLine();
			int length = sc.nextInt();
			System.out.println(obj.replaceSpace(iniString, length));
		}
    	
	}
    
}
