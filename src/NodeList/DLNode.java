package NodeList;

public class DLNode implements Node {
	private Object element;
	private DLNode pre;
	private DLNode next;
	
	public DLNode() {
		this.element=null;
		this.pre=null;
		this.next=null;
	}
	
	public DLNode(Object ele,DLNode pre,DLNode next) {
		this.element=ele;
		this.pre=pre;
		this.next=next;
	}
	
	public DLNode getNext() {
		return next;
	}
	
	public void setNext(DLNode next) {
		this.next=next;
	}
	
	public DLNode getPre() {
		return pre;
	}
	
	public void setPre(DLNode pre) {
		this.pre=pre;
	}
	
	
				
	@Override
	public Object getData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setData(Object obj) {
		// TODO Auto-generated method stub
		
	};

}
