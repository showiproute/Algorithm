package Offer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含质因子7。
 *  习惯上我们把1当做是第一个丑数。
 *  求按从小到大的顺序的第N个丑数。
 */
public class Array_8 {
	public static Stack<Integer> resultQueue=new Stack<>();
	public static Queue<Integer> two=new LinkedList<>();
	public static Queue<Integer> three=new LinkedList<>();
	public static Queue<Integer> five=new LinkedList<>();
	
    public  int GetUglyNumber_Solution(int index) {
    	resultQueue.push(1);
    	for(int i=1;i<index;i++) {
    		int peek = resultQueue.pop();
    		two.add(peek*2);
    		three.add(peek*3);
    		five.add(peek*5);
    		resultQueue.push(getMinValue());
    	}
    
        return resultQueue.pop();
    }
    
    public  int getMinValue() {
    	int twoValue=two.peek();
    	int threeValue=three.peek();
    	int fiveValue=five.peek();
    	
    	int tempmin=Math.min(twoValue, threeValue);
    	int resultMin = Math.min(tempmin, fiveValue);
    	two.remove(resultMin);
    	three.remove(resultMin);
    	five.remove(resultMin);
 
    	return resultMin;
    }
    
    public static void main(String[] args) {
		Array_8 obj = new Array_8();
    	System.out.println(obj.GetUglyNumber_Solution(1));
    	
	}
    
}
