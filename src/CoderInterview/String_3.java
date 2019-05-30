package CoderInterview;

import java.util.Scanner;
import java.util.TreeSet;

public class String_3 {
    public boolean checkSam(String stringA, String stringB) {
        // write code here
    	if(stringA.length()!=stringB.length()) {
    		return false;
    	}
    	
    	int[] flagA=new int[256];
    	int[] flagB=new int[256];
    	
    	for(int i=0;i<stringA.length();i++) {
    		flagA[stringA.charAt(i)]++;
    		flagB[stringB.charAt(i)]++;
    	}
    	
    	for(int i=0;i<flagA.length;i++) {
    		if(flagA[i]!=flagB[i]) {
    			return false;
    		}
    	}
    	return true;
    }
    
    public static void main(String[] args) {
    	String_3 obj = new String_3();
    	Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String nextLine = sc.nextLine();
			String nextLine2 = sc.nextLine();
			System.out.println(obj.checkSam(nextLine, nextLine2));
		}
		
	}
    
}
