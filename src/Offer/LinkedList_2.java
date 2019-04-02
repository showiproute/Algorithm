package Offer;

/*
 * 在一个排序的链表中，
 * 存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class LinkedList_2 {
	 public static class ListNode {
		    int val;
		    ListNode next = null;

		    ListNode(int val) {
		        this.val = val;
		    }
		}
	 
	 public ListNode deleteDuplication(ListNode pHead) {
		 ListNode record=new ListNode(-1);
		 record.next=pHead;
		 
		 ListNode tmp=record;
		 ListNode p=pHead;
		 
		 while(p!=null && p.next!=null) {
			 if(p.val==p.next.val) {
				 int val=p.val;
				 while(p!=null && p.val==val) {
					 p=p.next;
				 }
				 tmp.next=p;
			 }else {
				 tmp=p;
				 p=p.next;
			 }
			 
		 }
		 
		 return record.next;
	 }
	
}
