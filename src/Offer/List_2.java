package Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import Offer.List_2.ListNode;


/*
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

public class List_2 {

	public static ArrayList<ListNode> arrayList=new ArrayList<>();
	
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	    
	    @Override
	    public String toString() {
	    	// TODO Auto-generated method stub
	    	return "val"+this.val;
	    }
	    
	}

	public static void ReverseList(ListNode head) {
		while(head.next!=null) {
			
			arrayList.add(head);
			head=head.next;
		}
		arrayList.add(head);
		Collections.reverse(arrayList);
		
	}
	
    public static ListNode FindKthToTail(ListNode head,int k) {
    	if(head==null) {
    		return null;
    	}
    	
    	ReverseList(head);
    	
    	if(k>arrayList.size()) {
    		return null;
    	}
    	
    	
    	return arrayList.get(k-1);
    }
    
    public static void main(String[] args) {
		
    	ListNode listNode = new ListNode(1);
    	ListNode listNode2 = new ListNode(2);
    	ListNode listNode3 = new ListNode(3);
    	ListNode listNode4 = new ListNode(4);
    	listNode.next=listNode2;
    	listNode2.next=listNode3;
    	listNode3.next=listNode4;
    	listNode4.next=null;
    	
    	ListNode findKthToTail = FindKthToTail(listNode,4);
    	System.out.println(findKthToTail.val);
	}
	
}
