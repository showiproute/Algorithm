package Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/*
从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
public class BinaryTree_4 {

	public  static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
    	ArrayList<Integer> result=new ArrayList<>();
    	if(root==null) return result;
    	
    	Queue<TreeNode> queue=new LinkedList<>();
    
    	queue.offer(root);
    	while(!queue.isEmpty()) {
    		TreeNode temp = queue.poll();
    		if(temp.left!=null) {
    			queue.offer(temp.left);
    		}
    		if(temp.right!=null) {
    			queue.offer(temp.right);
    		}
    		
    		result.add(temp.val);
    		
    	}
    	return result;
    }
	
}
