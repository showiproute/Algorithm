package StackUsed;

import Stack.Stack;
import Stack.StackEmptyException;
import Stack.StackSLinked;

public class baseConversion {

	public static void baseConversion(int i) throws StackEmptyException {
		Stack s=new StackSLinked();
		while(i>0) {
			s.push(i%2+"");
			i=i/2;
		}
		while(!s.isEmpty())
			System.out.println((String)s.pop());
	}
	
		public static void main(String[] args) {
			try {
				baseConversion(10);
			} catch (StackEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}



