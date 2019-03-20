package Offer;

import java.util.ArrayList;
import java.util.List;

/*
 * 输入两个单调递增的链表，输出两个链表合成后的链表，
 * 当然我们需要合成后的链表满足单调不减规则。
 */

public class List_4 {
	
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	
	    /*
	     * 1,3,5,7,9...
	     * 2,4,6,8,10
	     * 
	     * result: 1 2 3 4 ...
	     */
	   
    public static ListNode Merge(ListNode list1,ListNode list2) {
    	if(list1==null)
    		return list2;
    	if(list2==null)
    		return list1;
    	ListNode mergeHead=null;
    	ListNode currentHead=null;
    	
    	while(list1!=null && list2!=null) {
    		if(list1.val<=list2.val) {
    			if(mergeHead==null) {
    				mergeHead=currentHead=list1;
    			}else {
    				currentHead.next=list1;
    				currentHead=currentHead.next;
    			}
    			list1=list1.next;
    		}
    		
    		if(list1.val>list2.val) {
    			if(mergeHead==null) {
    				mergeHead=currentHead=list2;
    			}else {
    				currentHead.next=list2;
    				currentHead=currentHead.next;
    			}
    			list2=list2.next;
    		}
    	}
    	
    	if(list1.next==null) {
    		currentHead.next=list2;
    	}
    	
    	if(list2.next==null) {
    		currentHead.next=list1;
    	}
    	
    	return mergeHead;
	}
  }
}
	
	

