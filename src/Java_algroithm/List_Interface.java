package Java_algroithm;

public interface List_Interface {

	public int getSize();
	
	public boolean isEmpty();
	
	public boolean contains(Object e);
	
	public int indexOf(Object e);
	
	public void insert(int i,Object e) throws OutOfBoundaryException;
	
	public boolean insertBefore(Object obj,Object e);
	
	public boolean insertAfter(Object obj,Object e);
	
	public Object remove(int i) throws OutOfBoundaryException;
	
	public boolean remove(Object e);
	
	public Object replace(int i,Object e) throws OutOfBoundaryException;
	
	public Object get(int i) throws Exception;
	
}
