package Stack;

import NodeList.SLNode;

public class StackSLinked implements Stack {
	
	private SLNode top;
	private int size;
	
	public StackSLinked() {
		// TODO Auto-generated constructor stub
		top=null;
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
	public void push(Object e) {
		// TODO Auto-generated method stub
		SLNode q=new SLNode(e,top);
		top=q;
		size++;
	}

	@Override
	public Object pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(size<1)
			throw new StackEmptyException("错误，空栈");
		Object obj=top.getData();
		top=top.getNext();
		size--;
		return obj;
		
	}

	@Override
	public Object peek() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(size<1)
			throw new StackEmptyException("错误，空栈");
		
		return top.getData();
	}

}
