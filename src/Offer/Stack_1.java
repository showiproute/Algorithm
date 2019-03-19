package Offer;

import java.util.Stack;

import javax.management.RuntimeErrorException;

/*
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型
 */



public class Stack_1 {
    public static Stack<Integer> stack1 = new Stack<Integer>();
    public static Stack<Integer> stack2 = new Stack<Integer>();
    
    public static  void push(int node) {
        stack1.push(node);
    	
    }
    
    public static int pop() {
    	if(stack1.empty()&& stack2.empty()) {
    		throw new RuntimeException();
    	}

    	if(stack2.isEmpty()) {
    		while(!stack1.isEmpty()) {
    			stack2.push(stack1.pop());
    		}
    	}
    	
    	return stack2.pop();
    }
	
	
	public static void main(String[] args) {
		push(1);
		push(2);
		push(3);
		
		System.out.println(pop());
	}
}
