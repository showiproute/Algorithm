package Offer;

import java.util.HashMap;

/*
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class List_6 {
	
	public class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if(pHead1==null || pHead2==null) 
    		return null;
    	HashMap<ListNode, Integer> hashMap=new HashMap<>();
    	
    	while(pHead1!=null) {
    		hashMap.put(pHead1, null);
    		pHead1=pHead1.next;
    	}
    	
    	while(pHead2!=null) {
    		if(hashMap.containsKey(pHead2)) {
    			return pHead2;
    		}
    		pHead2=pHead2.next;
    	}

    	return null;
    }

}
