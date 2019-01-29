package StackUsed;

import java.text.BreakIterator;

import Stack.Stack;
import Stack.StackEmptyException;
import Stack.StackSLinked;

public class bracketMatch {

	public static boolean bracketMatch(String str) throws StackEmptyException {
		Stack s=new StackSLinked();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			switch(c) {
				case '{':
				case '[':
				case '(': s.push(Integer.valueOf(c));break;
				case '}':
					if(!s.isEmpty()&&((Integer)s.pop()).intValue()=='{')
						break;
					else 
						return false;
				case ']':
					if(!s.isEmpty()&&((Integer)s.pop()).intValue()=='[')
						break;
					else 
						return false;
				case ')':
					if(!s.isEmpty()&&((Integer)s.pop()).intValue()=='(')
						break;
					else 
						return false;
			}
		}
		if(s.isEmpty()) return true;
		else return false;
	}
	
	public static void main(String[] args) {
		
		boolean result;
		try {
			result=bracketMatch("{[(aasd)]}");
			System.out.println(result);
		} catch (StackEmptyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
		
		
	}
	
}
