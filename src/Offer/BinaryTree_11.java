package Offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


/*
 * 从上到下按层打印二叉树，
 * 同一层结点从左至右输出。每一层输出一行。

 */
public class BinaryTree_11 {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
    static ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
    	ArrayList<ArrayList<Integer>> result = new ArrayList<>();
    	
    	if(pRoot==null) return result;
    	
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(pRoot);
        
        while(!queue.isEmpty()) {
        	int size = queue.size();
        	ArrayList<Integer> tempList=new ArrayList<>();
        	for(int i=0;i<size;i++) {
        		TreeNode node = queue.poll();
        		if(node.left!=null) queue.offer(node.left);
        		if(node.right!=null) queue.offer(node.right);
        		tempList.add(node.val);
        	}
        	result.add(tempList);
        	
        }
        
        return result;
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
		node2.left=node4;
		node2.right=node5;
		node3.left=node6;
		node3.right=node7;
		
		
		System.out.println(Print(root).toString());
	}
	
}
