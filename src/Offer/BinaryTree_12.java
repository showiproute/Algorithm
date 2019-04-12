package Offer;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree_12{
	
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	public static String Serialize(TreeNode root) {
		StringBuilder sb=new StringBuilder();
		if(root==null) {
			sb.append("#,");
			return sb.toString();
		}
		
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if(node!=null) {
				queue.offer(node.left);
				queue.offer(node.right);
				sb.append(node.val).append(",");
			}else {
				sb.append("#,");
			}
		}
		
		return sb.toString();
	}
	
	public static TreeNode Deserialize(String str) {
		TreeNode head=null;
		if(str==null || str.length()==0)
			return head;
		String[] nodes = str.split(",");
		TreeNode[] treeNodes=new TreeNode[nodes.length];
		for(int i=0;i<nodes.length;i++) {
			if(!nodes[i].equals("#"))
				treeNodes[i]=new TreeNode(Integer.valueOf(nodes[i]));
		}	
		for(int i=0,j=1;j<treeNodes.length;i++) {
			if(treeNodes[i]!=null) {
				treeNodes[i].left=treeNodes[j++];
				treeNodes[i].right=treeNodes[j++];
			}
		}
		
		
		return treeNodes[0];
	}
	
	public static void main(String[] args) {
		
		TreeNode root=new TreeNode(4);
		TreeNode node2=new TreeNode(3);
		TreeNode node3=new TreeNode(5);
		TreeNode node4=new TreeNode(6);
		TreeNode node5=new TreeNode(8);
		TreeNode node6=new TreeNode(9);
		TreeNode node7=new TreeNode(7);
		
		root.left=node2;
		root.right=node3;
//		node2.left=node4;
		node2.right=node5;
//		node3.left=node6;
		node3.right=node7;
		
		System.out.println(Serialize(root));
		System.out.println(Integer.valueOf("#"));
	}
}

