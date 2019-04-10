package AlogrithmCourse;

public class MinDepth_DFS {
	public  static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public static int getMinDepth(TreeNode root) {
		if(root==null) return 0;
		if(root.left==null) return 1+getMinDepth(root.right);
		if(root.right==null) return 1+getMinDepth(root.left);
		return 1+Math.min(getMinDepth(root.left), getMinDepth(root.right));
	}
	
	public static void main(String[] args) {
		
		TreeNode root=new TreeNode(3);
		TreeNode node=new TreeNode(9);
		TreeNode node2=new TreeNode(20);
		TreeNode node3=new TreeNode(15);
		TreeNode node4=new TreeNode(7);
		root.left=node;
		root.right=node2;
		node2.left=node3;
		node2.right=node4;
		
		System.out.println(getMinDepth(root));
		
		
	}
	
	
}
