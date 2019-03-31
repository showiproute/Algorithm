package Offer;

/*
 * 给定一个数组A[0,1,...,n-1],
 * 请构建一个数组B[0,1,...,n-1],
 * 其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
 * 不能使用除法。
 */
import java.util.ArrayList;

public class Array_13 {
    public int[] multiply(int[] A) {
    	int[] B=new int[A.length];
    	if(A.length==0)
    		return B;
    	
    	for(int i=0;i<A.length;i++) {
    		int counts=1;
    		for(int j=0;j<A.length;j++) {
    			if(j==i) {
    				continue;
    			}else {
    				counts=counts*A[j];
    			}
    		}
    		B[i]=counts;
    	}
    	
    	return B;
    }
    
}
