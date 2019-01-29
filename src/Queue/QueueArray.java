package Queue;

public class QueueArray implements Queue{

	private static final int CAP=7;//队列默认大小
	
	private Object[] elements;
	
	private int capacity;
	
	private int front;
	
	private int rear;
	
	public QueueArray (int cap) {
		this.capacity=cap+1;
		this.elements=new Object[this.capacity];
		this.front=0;
		this.rear=0;
	}
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return (rear-front+capacity)%capacity;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return front==rear;
	}

	@Override
	public void enqueue(Object e) {
		// TODO Auto-generated method stub
		if(getSize()==capacity-1) expandSpace();
		elements[rear]=e;
		rear=(rear+1)%capacity;
	}

	private void expandSpace() {
		// TODO Auto-generated method stub
		Object[] a=new Object[elements.length*2];
		int i=front;
		int j=0;
		while(i!=rear) {
			a[j++]=elements[i];
			i=(i+1)%capacity;
		}
		elements=a;
		capacity=elements.length;
		front=0;
		rear=j;
	}

	@Override
	public Object dequeue() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new QueueEmptyException("错误，空队列");
		Object obj=elements[front];
		elements[front]=null;
		front=(front+1)%capacity;
		
		return obj;
	}

	@Override
	public Object peek() throws QueueEmptyException {
		// TODO Auto-generated method stub
		if(isEmpty())
			throw new QueueEmptyException("错误，空队列");
		
		return elements[front];
	}
	

}
