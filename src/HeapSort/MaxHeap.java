package HeapSort;

import java.util.Arrays;

public class MaxHeap {

	protected int A[];
	protected int heapsize;
	
	public MaxHeap() {}
	public MaxHeap(int A[]) {
		buildMaxHeap(A);
	}
	
	protected int parent(int i) {return (i-1)/2;}
	protected int left(int i) {return 2*i+1;}
	protected int right(int i) {return 2*i+2;}
	
	
	private void maxHeapify(int i) {
		int l=left(i);
		int r=right(i);
		int largest;
		if(l<=heapsize-1 && A[l]>A[i]) {
			largest=l;
		}else {
			largest=i;
		}
		if(r<=heapsize-1 && A[r]>A[largest]) 
			largest=r;
		if(largest!=i) {
			int temp=A[i];
			A[i]=A[largest];
			A[largest]=temp;
			this.maxHeapify(largest);
		}
	}
	
	private void buildMaxHeap(int[] a) {
		// TODO Auto-generated method stub
		this.A=a;
		this.heapsize=a.length;
		int i=parent(heapsize-1);
		for(;i>=0;i--) {
			maxHeapify(i);
		}
	}
	
	private void heapSort(int[] a) {
		buildMaxHeap(a);
		int step=1;
		for(int i=heapsize-1;i>0;i--) {
			int temp=a[i];
			a[i]=a[0];
			a[0]=temp;
			heapsize-=1;
			System.out.println("Step:"+(step++)+Arrays.toString(a));
			maxHeapify( 0);
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
		int[] a= {3,7,2,11,3,4,9,2,18,0};
		System.out.println("Input:"+Arrays.toString(a));
		MaxHeap maxHeap = new MaxHeap();
		maxHeap.heapSort(a);
		System.out.println("Output:"+Arrays.toString(a));
		
	}
	
}
