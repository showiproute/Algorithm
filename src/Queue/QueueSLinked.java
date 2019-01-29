package Queue;

import NodeList.SLNode;

public class QueueSLinked implements Queue{

	private SLNode front;
	private SLNode rear;
	private int size;
	
	public QueueSLinked() {
		front=new SLNode();
		rear=front;
		size=0;
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
	
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public void enqueue(Object e) {
		// TODO Auto-generated method stub
		
		SLNode p=new SLNode(e,null);
		rear.setNext(p);
		rear=p;
		size++;
		
	}

	@Override
	public Object dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(size<1)
			throw new QueueEmptyException("错误，空队列");
		SLNode p=front.getNext();
		front.setNext(p.getNext());
		size--;
		if(size<1) rear=front;
		return p.getData();
	}

	@Override
	public Object peek() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(size<1)                                                                                                                                                              
			throw new QueueEmptyException("错误，空队列");
		
		return front.getNext().getData();
	}

}
