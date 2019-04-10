package AlogrithmCourse;

import java.util.LinkedList;
import java.util.Queue;


public class MinDepth_BFS {
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
		int res=0;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			res+=1;
			int counts=queue.size();
			for(int i=0;i<counts;i++) {
				TreeNode node = queue.poll();
				if(node.left==null && node.right==null) return res;
				if(node.left!=null) queue.offer(node.left);
				if(node.right!=null) queue.offer(node.right);
			}
		}
		
		return -1;
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
