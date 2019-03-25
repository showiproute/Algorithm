package Offer;


/*
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class BinaryTree_5 {
    public static boolean VerifySquenceOfBST(int [] sequence) {
        
    	if(sequence.length==0) return false;
    	if(sequence.length==1) return true;
    	
    	return verify(sequence, 0, sequence.length-1);
    }
    
    public static boolean verify(int[] sequence,int start,int end) {
    	
    	if(start>=end) return true;
    		
    	int i=start;
    	while(sequence[i]<sequence[end]) i++;
    	
    	for(int j=i+1;j<end;j++) {
    		if(sequence[j]<sequence[end])
    			return false;
    	}
    	
    	return verify(sequence, start, i-1) && verify(sequence, i+1, end);
    }
    
    
    
    
}
