package Offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * 
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
 */

public class List_1 {
	public static class ListNode{
		int val;
		ListNode next=null;
		
		ListNode(int val){
			this.val=val;
		}
	}

	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
		Stack<Integer> stack=new Stack<>();
		while(listNode!=null) {
			stack.push(listNode.val);
			listNode=listNode.next;
		}
		
		ArrayList<Integer> arrayList=new ArrayList<>();
		while(!stack.isEmpty()) {
			arrayList.add(stack.pop());
		}
		
		
		return arrayList;
	}
	
	 public static void main(String[] args) {
		ListNode listNode = new ListNode(1);
		ListNode listNode2 = new ListNode(2);
		ListNode listNode3 = new ListNode(3);
		listNode3.next=null;
		
		 listNode.next=listNode2;
		 listNode2.next=listNode3;
		 
		 
	}
	
    
}
