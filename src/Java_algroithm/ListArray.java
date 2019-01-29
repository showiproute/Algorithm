package Java_algroithm;

import javax.swing.text.AbstractDocument.LeafElement;

public class ListArray implements List_Interface {
	
	private final int LEN=8;
	private Strategy strategy;
	private int size;
	private Object[] elements;
	
	public ListArray(Strategy strategy) {
		this.strategy=strategy;
		this.size=0;
		elements=new Object[LEN];
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public boolean contains(Object e) {
		for(int i=0;i<size;i++) {
			if(strategy.equal(e, elements[i])) return true;
		}
		return false;
	}

	@Override
	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++)
			if(strategy.equal(e, elements[i])) return i;
		return -1;
	}

	@Override
	public void insert(int i, Object e) throws OutOfBoundaryException {
		// TODO Auto-generated method stub
		if(i<0||i>size)
			throw new OutOfBoundaryException("错误，数组越界");
		if(size>=elements.length)
			expandSapce();
		for(int j=size;j>i;j--)
			elements[j]=elements[j-1];
		elements[i]=e;
		size++;
		return;
	}

	private void expandSapce() {
		// TODO Auto-generated method stub
		Object[] a=new Object[elements.length*2];
		for(int i=0;i<elements.length;i++) {
			a[i]=elements[i];
		}
		elements=a;
	}

	@Override
	public boolean insertBefore(Object obj, Object e) {
		// TODO Auto-generated method stub
		int i=indexOf(obj);
		if(i<0)
			return false;
		else
			try {
				insert(i, e);
			} catch (OutOfBoundaryException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			return true;
	}

	@Override
	public boolean insertAfter(Object obj, Object e) {
		// TODO Auto-generated method stub
		int i=indexOf(obj);
		if(i<0) return false;
			try {
				insert(i+1, e);
			} catch (OutOfBoundaryException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		
		return true;
	}

	@Override
	public Object remove(int i) throws OutOfBoundaryException {
		// TODO Auto-generated method stub
		if(i<0||i>=size)
			throw new OutOfBoundaryException("错误，数组越界");
		Object obj=elements[i];
		for(int j=i;j<size-1;j++) {
			elements[j]=elements[j+1];
		}
		elements[--size]=null;		
		
		return obj;
	}

	@Override
	public boolean remove(Object e) {
		// TODO Auto-generated method stub
		int i=indexOf(e);
		if(i<0)return false;
		try {
			remove(i);
		} catch (OutOfBoundaryException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return true;
	}

	@Override
	public Object replace(int i, Object e) throws OutOfBoundaryException {
		// TODO Auto-generated method stub
		if(i<0||i>=size)
			throw new OutOfBoundaryException("错误，数组越界");
		Object obj=elements[i];
		elements[i]=e;
		
		return obj;
	}

	@Override
	public Object get(int i) throws Exception {
		// TODO Auto-generated method stub
		if(i<0||i>=size)
			throw new OutOfBoundaryException("错误，数组越界");
		
		return elements[i];
	}

}
