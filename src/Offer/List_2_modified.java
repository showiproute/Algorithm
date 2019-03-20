package Offer;


/*
 * 输入一个链表，输出该链表中倒数第k个结点。
 */

public class List_2_modified {
	
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
	
    public static ListNode FindKthToTail(ListNode head,int k) {
    	if(head==null||k<=0) {
    		return null;
    	}
    	
    	ListNode i = head;
    	ListNode j = head;
    	
    	for(int m=0;m<k-1;m++) {
    		if(i.next!=null) {
    			i=i.next;
    		}else {
    			return null;
    		}
    	}
    	
    	while(i.next!=null) {
    		j=j.next;
    		i=i.next;
    	}
    	
    	
    	return j;
    }
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		node1.next=node2;
		node2.next=node3;
		node3.next=null;
		System.out.println(FindKthToTail(node1, 3));
	
	}
}
