package AlogrithmCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Map.Entry;

public class testMain2 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n=sc.nextInt();
			char arr[];
			HashSet<String> set=new HashSet<>();
			for(int i=0;i<n;i++) {
				arr = sc.next().toCharArray();
				Arrays.sort(arr);
				set.add(new String(arr));
			}
			System.out.println(set.size());
		
	}
	
}
