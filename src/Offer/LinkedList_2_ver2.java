package Offer;

import Offer.LinkedList_2.ListNode;

public class LinkedList_2_ver2 {

	//Recurise
	 public  class ListNode {
		    int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
		}
	
	 public ListNode deleteDuplication(ListNode pHead) {
		 if(pHead==null) 
			 return null;;
	     if(pHead!=null && pHead.next==null)
	    	 return pHead;
		 
	     ListNode current=new ListNode(-1);
	     
	     if(pHead.next.val==pHead.val) {
	    	 current=pHead.next.next;
	    	 while(current!=null && current.val==pHead.val) {
	    		 current=current.next;
	    	 return deleteDuplication(current);
	    	 }
	     }else {
	    	 current=pHead.next;
	    	 pHead.next=deleteDuplication(current);
	    	 return pHead;
	     }
	     
		return pHead;
	     
	     
	 }
	 
}
