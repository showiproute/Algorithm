package Offer;

/*
 * 请实现一个函数，用来判断一颗二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class BinaryTree_9 {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	
    public static boolean isSymmetrical(TreeNode pRoot) {
    	if(pRoot==null) {
    		return true;
    	}
    	
    	return symmetrical(pRoot.left, pRoot.right);
    		
    }
    
    public static boolean symmetrical(TreeNode leftNode,TreeNode rightNode) {
    	if(leftNode==null) return rightNode==null;
    	
    	if(rightNode==null) return false;
    	
    	if(leftNode.val!=rightNode.val) return false;
    	return symmetrical(leftNode.left, rightNode.right) && 
    			symmetrical(leftNode.right, rightNode.left);
    }
    
}
