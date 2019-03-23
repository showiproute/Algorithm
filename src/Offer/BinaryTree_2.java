package Offer;

/*
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class BinaryTree_2 {

	
	public  static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
    public static boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result=false;
        if(root1!=null && root2!=null) {
        	if(root1.val==root2.val) {
        		result=doesTree1inTree2(root1, root2);
        	}
        	
        	if(!result) {
        		result=doesTree1inTree2(root1.left,root2);
        	}
        	if(!result) {
        		result=doesTree1inTree2(root1.right, root2);
        	}
        }	
    	return result;
    }
    
    
    public static boolean doesTree1inTree2(TreeNode root1,TreeNode root2) {
    	if(root2==null) {
    		return true;
    	}
    	
    	if(root1==null) {
    		return false;
    	}
    	
    	if(root1.val!=root2.val) {
    		return false;
    	}
    	

    	
    	return doesTree1inTree2(root1.left, root2.left) && doesTree1inTree2(root1.right, root2.right);
    }
    
    
}
