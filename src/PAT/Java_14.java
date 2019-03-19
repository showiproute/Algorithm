package PAT;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_14 {
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] fields = scanner.nextLine().split(".");
		
		ArrayList<String> numlist = new ArrayList<>();
		ArrayList<String> resultlist=new ArrayList<>();
		
		String flag = fields[0].split("")[0];
		numlist.add(fields[0].split("")[1]);
		numlist.add(fields[1].split("E")[0]);
		String suffix = fields[1].split("E")[1];
		String suffixflag = suffix.split("")[0];
		String suffixnums = suffix.split("")[0];
		
		
		
		if(flag.equals("-")) {
			resultlist.add("-");
			if(suffixflag.equals("-")) {
				
			}
		
		}
		
		
		
		
		
		
		
		
	}
	
	

}
