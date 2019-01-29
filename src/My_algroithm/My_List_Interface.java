package My_algroithm;

public interface My_List_Interface {

	public int getSize();
	
	public boolean isEmpty();
	
	public boolean contains(Object e);
	
	public int indexOf(Object e);
	
	public void insert(int i,Object e) throws My_OutOfBoundaryException;
	
	public boolean insertBefore(Object obj,Object e);
	
	public boolean insertAfter(Object obj,Object e);
	
	public Object remove(int i) throws My_OutOfBoundaryException;
	
	public boolean remove(Object e);
	
	public Object replace(int i,Object e) throws My_OutOfBoundaryException;
	
	public Object get(int i) throws My_OutOfBoundaryException;
	
}
