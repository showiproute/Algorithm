package Offer;


/*
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 */
public class Tree_3 {
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null)
        	return true;
    	
    	return Math.abs(getMaxHeight(root.left)-getMaxHeight(root.right)) <=1 &&
    			IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    
    public int getMaxHeight(TreeNode node) {
    	if(node==null)
    		return 0;
    	int left=getMaxHeight(node.left);
    	int right=getMaxHeight(node.right);
    	
    	return Math.max(left, right)+1;
    }
}
