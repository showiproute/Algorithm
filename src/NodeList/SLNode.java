package NodeList;

public class SLNode implements Node{

	private Object element;
	private SLNode next;
	
	public SLNode() {
		this.element=null;
		this.next=null;
	}
	
	public SLNode(Object ele,SLNode next) {
		this.element=ele;
		this.next=next;
	}
	
	public SLNode getNext() {
		return next;
	}
	
	public void setNext(SLNode next) {
		this.next=next;
	}
	
	public boolean hasNext() {
		if(getNext()!=null) {
			return true;
		}else
			return false;
	}
	
	@Override
	public Object getData() {
		// TODO Auto-generated method stub
		return element;
	}

	@Override
	public void setData(Object obj) {
		// TODO Auto-generated method stub
		element=obj;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SLNode [element=" + element + ", next=" + next + "]";
	}
	
	
}
