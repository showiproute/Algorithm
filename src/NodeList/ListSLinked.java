package NodeList;

public class ListSLinked  {
	private Strategy strategy;
	private SLNode head;
	private int size;
	
	public ListSLinked() {
		this.strategy=null;
		this.head=null;
		this.size=0;
	}

	public ListSLinked(Strategy strategy) {
		this.strategy=strategy;
		head=new SLNode();
		size=0;
	}
	
	private SLNode getPreNode(Object e) {
		SLNode p=head;
		while(p.getNext()!=null) {
			if(strategy.equal(p.getNext().getData(), e)) return p;
		}
		return null;
	}
	
	private SLNode getPreNode(int i) {
		SLNode p=head;
		for(;i>0;i--) p=p.getNext();
		return p;
	}
	
	private SLNode getNode(int i) {
		SLNode p=head.getNext();
		for(;i>0;i--) p=p.getNext();
		return p;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public boolean isEmpty() {
		return this.size==0;
	}
	
	public boolean contains(Object e) {
		SLNode p=head.getNext();
		while(p.getNext()!=null) {
			if(strategy.equal(p.getData(), e)) 
				return true;
			p=p.getNext();
		}
		return false;
	}
	
	public int indexOf(Object e) {
		SLNode p=head.getNext();
		int index=0;
		while(p.getNext()!=null) {
			if(strategy.equal(p.getData(), e))
				return index;
			else
				index++;
				p=p.getNext();
		}
		return index;
	}
	
	public void insert(int i,Object e) throws OutOfBoundayException{
		if(i<0||i>size) {
			throw new OutOfBoundayException("错误，数据溢出");
		}
		SLNode p=getPreNode(i);
		SLNode q=new SLNode(e,p.getNext());
		p.setNext(q);
		size++;
		return;
	}
	
	public boolean insertBefore(Object obj,Object e) {
		SLNode p=getPreNode(obj);
		if(p!=null) {
			SLNode q=new SLNode(e,p.getNext());
			p.setNext(q);
			size++;
			return true;
		}
		return false;		
	}
	
	public boolean insertAfter(Object obj,Object e) {
		SLNode p=head.getNext();
		
		while(p.getNext()!=null) {
			if(strategy.equal(p.getData(), obj)) {
				SLNode insertNode=new SLNode(e,p.getNext());
				p.setNext(insertNode);
				size++;
				return true;
			}
			else
				p=p.getNext();
		}
		return false;
	}
	
	public Object remove(int i) throws OutOfBoundayException {
		if(i<0||i>size)
			throw new OutOfBoundayException("错误，数据溢出");
		SLNode p=getPreNode(i);
		Object obj=p.getNext();
		p.setNext(p.getNext().getNext());
		size--;
		return obj;
		
	}
	
	public boolean remove(Object e) {
		SLNode p=head.getNext();
		while(p.getNext()!=null) {
			if(strategy.equal(p.getData(), e)) {
				SLNode pNode=getPreNode(e);
				Object obj=pNode.getNext();
				pNode.setNext(pNode.getNext().getNext());
				size--;
				return true;
			}
			else 
				p=p.getNext();
		}
		return false;
	}
	
	public Object replace(int i,Object e) throws OutOfBoundayException{
		if(i<0||i>size)
			throw new OutOfBoundayException("错误，数据溢出");
		SLNode p=head;
		for(;i>0;i--) {
			p=p.getNext();
		}
		SLNode preNode=getPreNode(i);
		SLNode newNode=new SLNode(e,p.getNext());
		preNode.setNext(newNode);
		return newNode;
	}
	
	public Object get(int i) throws OutOfBoundayException{
		if(i<0||i>size)
			throw new OutOfBoundayException("错误，数据溢出");
		SLNode p=head;
		for(;i>0;i--) {
			p=p.getNext();
		}
		Object data=p.getData();
		return data;
	}
	
	public void PrintLinkedList() {
		SLNode p=head;
		while(p.getNext()!=null) {
			p=p.getNext();
			System.out.println(p);
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListSLinked [strategy=" + strategy + ", head=" + head + ", size=" + size + "]";
	}
	
}
