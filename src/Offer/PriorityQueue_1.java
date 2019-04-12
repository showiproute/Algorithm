package Offer;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueue_1 {
	
	public static PriorityQueue<Integer> minHeap=new PriorityQueue<>();
	public static PriorityQueue<Integer> maxHeap=new PriorityQueue<>(15,new Comparator<Integer>() {
		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o2-o1;
		}
	});
	
	public static int count=0;
	
    public void Insert(Integer num) {
       if(count%2==0) {
    	   maxHeap.offer(num);
    	   int filteredMaxNum = maxHeap.poll();
    	   minHeap.offer(filteredMaxNum);
       }else {
    	   minHeap.offer(num);
    	   int filteredMinNum = minHeap.poll();
    	   maxHeap.offer(filteredMinNum);
       }
       count++;
    }

    public Double GetMedian() {
        if(count%2==0) {
        	return new Double((minHeap.peek()+maxHeap.peek()))/2;
        }else {
        	return new Double(minHeap.peek());
        }
    	
    }
	
}
