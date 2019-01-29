package LinkedList;


import NodeList.Node;


public interface LinkedList {
	public int getSize();
	
	public boolean isEmpty();
	
	public Node first() throws OutOfBoundayException;
	
	public Node last() throws OutOfBoundayException;
	
	public Node getNext(Node p) throws InvalidNodeException,OutOfBoundayException;
	
	public Node getPre(Node p) throws InvalidNodeException,OutOfBoundayException;
	
	public Node insertFirst(Object e);
	
	public Node insertLast(Object e);
	
	public Node insertAfter(Node p,Object e) throws InvalidNodeException;
	
	public Node insertBefore(Node p,Object e) throws InvalidNodeException;
	
	public Object remove(Node p) throws InvalidNodeException;
	
	public Object removeFirst() throws OutOfBoundayException;
	
	public Object removeLast() throws OutOfBoundayException;
	
	public Object replace(Node p,Object e) throws InvalidNodeException;
	
	public Iterator elements();

}
