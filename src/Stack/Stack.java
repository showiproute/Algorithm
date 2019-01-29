package Stack;

public interface Stack {

	public int getSize();
	
	public boolean isEmpty();
	
	public void push(Object e);
	
	public Object pop() throws StackEmptyException;
	
	public Object peek() throws StackEmptyException;
	
}
