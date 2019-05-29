package CoderInterview;

import java.util.*;

public class String_1 {

	public  boolean checkDifferent(String inputLine) {
		
		boolean[] flag=new boolean[65536];
		for(int i=0;i<inputLine.length();i++) {
			char item = inputLine.charAt(i);
			if(flag[item]) {
				return false;
			}
			flag[item]=true;
		}
		
		return true;
		
	}
	
}
