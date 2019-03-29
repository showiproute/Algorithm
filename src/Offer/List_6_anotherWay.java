package Offer;

public class List_6_anotherWay {
	
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
    	
    	int length1=getLength(pHead1);
    	int length2=getLength(pHead2);
    	
    	if(length1>length2) {
    		int value=length1-length2;
    		while(value>0) {
    			pHead1=pHead1.next;
    			value--;
    		}
    	}else {
    		int value=length2-length1;
    		while(value>0) {
    			pHead2=pHead2.next;
    			value--;
    		}
    	}
    	
    	while(pHead1!=pHead2) {
    		pHead1=pHead1.next;
    		pHead2=pHead2.next;
    	}    	
    	
    	return pHead1;
    }
    
    public int getLength(ListNode pHead) {
    	
    	int length=0;
    	while(pHead!=null) {
    		length++;
    		pHead=pHead.next;
    	}
    	
    	
    	return length;
    }
	
}
