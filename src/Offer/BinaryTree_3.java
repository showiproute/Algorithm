package Offer;

import java.util.Stack;

/*
 * 操作给定的二叉树，将其变换为源二叉树的镜像。
 * 二叉树的镜像定义：源二叉树 
    	    8
    	   /  \
    	  6   10
    	 / \  / \
    	5  7 9 11
    	镜像二叉树
    	    8
    	   /  \
    	  10   6
    	 / \  / \
    	11 9 7  5
 */
public class BinaryTree_3 {
	
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
    public static void Mirror(TreeNode root) {
     
    	if(root==null) {
    		return;
    	}
    	
    	Stack<TreeNode> stack = new Stack<>();    	
    	stack.push(root);
    	while(!stack.isEmpty()) {
    		TreeNode node = stack.pop();
    		     
    		if(node.left!=null || node.right !=null) {
    			TreeNode temp = node.left;
    			node.left=node.right;
    			node.right=temp;
    		
    		}
    		
    		if(node.left!=null) {
    			stack.push(node.left);
    		}
    		
    		if(node.right!=null) {
    			stack.push(node.right);
    		}
    		
    	}
    	
    }
}
