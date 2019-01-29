package My_algroithm;

import java.io.ObjectStreamException;

import javax.swing.tree.ExpandVetoException;

public class My_ListArray implements My_List_Interface {

	public My_ListArray(int lEN, My_Strategy strategy, int size) {
		super();
		this.LEN = lEN;
		this.strategy =strategy;
		this.size = size;
		this.elements =new Object[this.LEN];
	}

	private int LEN;
	private My_Strategy strategy;
	private int size;
	private Object[] elements;
	
	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size==0;
	}

	@Override
	public boolean contains(Object e) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			if(strategy.equal(e, elements[i]))
				return true;
		}	
		return false;
	}

	@Override
	public int indexOf(Object e) {
		// TODO Auto-generated method stub
		for(int i=0;i<size;i++) {
			if(strategy.equal(e, elements[i]))
				return i;
		}
		
		return -1;
	}

	@Override
	public void insert(int i, Object e) throws My_OutOfBoundaryException {
		// TODO Auto-generated method stub
		if(i<0||i>size)
			throw new My_OutOfBoundaryException("错误，数组越界");
		if(size>=elements.length)
			ExpandElements();
		for(int j=size;j>i;j--)
			elements[j]=elements[j-1];
		elements[i]=e;
		size++;
	}

	private void ExpandElements() {
		// TODO Auto-generated method stub
		Object[] newarray=new Object[this.LEN*2];
		for(int i=0;i<size;i++)
			newarray[i]=elements[i];
		elements=newarray;
	}

	@Override
	public boolean insertBefore(Object obj, Object e) {
		// TODO Auto-generated method stub
		if(contains(obj)) {
			int index=indexOf(obj);
			for(int i=size;i>index;i--)
				elements[i]=elements[i-1];
			elements[index]=e;
			size++;
			return true;
		}else
			return false;
	
	}

	@Override
	public boolean insertAfter(Object obj, Object e) {
		// TODO Auto-generated method stub
		if(contains(obj)) {
			int index=indexOf(obj);
			try {
				insert(index+1,e);
			}catch (My_OutOfBoundaryException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}finally {
				return true;
			}
			
		}else
			return false;
		
	}

	@Override
	public Object remove(int i) throws My_OutOfBoundaryException {
		// TODO Auto-generated method stub
		if(i<=0||i>size)
			throw new My_OutOfBoundaryException("数组越界，错误");
		Object obj=elements[i];
		for(int j=i;j<size;j++)
			elements[j]=elements[j+1];
		elements[--size]=null;
		return obj;
	}

	@Override
	public boolean remove(Object e) {
		// TODO Auto-generated method stub
		if(contains(e)) {
//			int index=indexOf(e);
//			for(int i=index;i<size;i++)
//				elements[i]=elements[i+1];
//			elements[--size]=null;
//			return true;
			int index=indexOf(e);
			try {
				remove(index);
			} catch (My_OutOfBoundaryException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			finally {
				return true;
			}
		}else
			return false;
	}

	@Override
	public Object replace(int i, Object e) throws My_OutOfBoundaryException {
		// TODO Auto-generated method stub
		if(i<0||i>size)
			throw new My_OutOfBoundaryException("错误，数组越界");
		Object obj=elements[i];
		elements[i]=e;
		return obj;
	}

	@Override
	public Object get(int i) throws My_OutOfBoundaryException {
		// TODO Auto-generated method stub
		if(i<0||i>size)
			throw new My_OutOfBoundaryException("错误，数组越界");
		Object obj=elements[i];
		
		return obj;
	}
	
	public void PrintList() {
		for(int i=0;i<size;i++)
			System.out.println(elements[i]);
	}
}
