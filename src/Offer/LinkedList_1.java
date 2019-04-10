package Offer;

/*
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。

 */
public class LinkedList_1 {
	 public class ListNode {
		    int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
		}

    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if(pHead==null || pHead.next==null || pHead.next.next==null)
        	return null;
        
        ListNode fast=pHead.next.next;
        ListNode slow=pHead.next;
        
        while(fast!=slow) {
        	if(fast.next!=null && fast.next.next!=null) {
        		fast=fast.next.next;
        		slow=slow.next;
        	}else {
        		return null;
        	}
        }
        fast=pHead;
        while(fast!=slow) {
        	fast=fast.next;
        	slow=slow.next;
        }
        
    	return slow;
    }
}
