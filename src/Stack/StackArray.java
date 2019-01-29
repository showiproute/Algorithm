package Stack;

public class StackArray implements Stack{
	private final int LEN=8;
	private Object[] elements;
	private int top;

	public StackArray() {
		top=-1;
		elements=new Object[LEN];
	}
	
	public int getSize() {
		return top+1;
	}
	
	public boolean isEmpty() {
		return top<0;
	}

	@Override
	public void push(Object e) {
		// TODO Auto-generated method stub
		if(getSize()>=elements.length) expandSpace();
		elements[++top]=e;
	}
	
	private void expandSpace() {
		Object[] a=new Object[elements.length*2];
		for(int i=0;i<elements.length;i++)
			a[i]=elements[i];
		elements=a;
	}

	@Override
	public Object pop() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(getSize()<1)
			throw new StackEmptyException("错误，空堆栈");
		Object obj=elements[top];
		elements[top--]=null;
		
		return obj;
	}

	@Override
	public Object peek() throws StackEmptyException {
		// TODO Auto-generated method stub
		if(getSize()<1)
			throw new StackEmptyException("错误，堆栈为空");
			
		return elements[top];
	}

	
	public void printStack() {
		for(int i=top;i>=0;i--)
			System.out.println(elements[i]);
	}
	
}

