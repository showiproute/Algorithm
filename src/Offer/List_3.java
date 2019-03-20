package Offer;

/*
 * 输入一个链表，反转链表后，输出新链表的表头。
 */



public class List_3 {
	
	public static class ListNode {
	    int val;
	    ListNode next = null;

	    ListNode(int val) {
	        this.val = val;
	    }
	}
	
	/*
	 * 1->2->3->4
	 * 
	 *     4->3->2->1
	 */
    public static ListNode ReverseList(ListNode head) {
    	if(head==null)
    		return null;
    	ListNode before=null;
    	ListNode after=null;
    	
    	while(head!=null) {
    		after=head.next;
    		head.next=before;
    		
    		before=head;
    		head=after;
    	}
    	
    	return before;
    }
	
	public static void main(String[] args) {
		ListNode node1=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=null;
		
		System.out.println(ReverseList(node1).val);
		
		
	}
	
}
