package CoderInterview;

import java.util.*;
public class String_2 {

    public String reverseString(String iniString) {
        // write code here
    	char[] charArray = iniString.toCharArray();
    	for(int i=0;i<iniString.length()/2;i++) {
    		char temp=charArray[charArray.length-1-i];
    		charArray[charArray.length-i-1]=charArray[i];
    		charArray[i]=temp;
    	}
    	return new String(charArray);
    }
	
}
