package Offer;

import java.util.ArrayList;
import java.util.Stack;


/*
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推。
 */
public class BinaryTree_10 {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }
	}
	
	public static ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> result=new ArrayList<>();
		if(pRoot==null) return result;
		
	
		Stack<TreeNode> stackFirst = new Stack<>();
		Stack<TreeNode> stackSecond = new Stack<>();
		stackFirst.push(pRoot);
		
		
		
		while(true) {
			if(!stackFirst.isEmpty()) {
				ArrayList<Integer> tempList = new ArrayList<>();
				while(!stackFirst.isEmpty()) {
					TreeNode pop = stackFirst.pop();
					if(pop.left!=null) stackSecond.push(pop.left);
					if(pop.right!=null) stackSecond.push(pop.right);
					tempList.add(pop.val);
				}
				result.add(tempList);
			}
			if(!stackSecond.isEmpty()) {
				ArrayList<Integer> tempList = new ArrayList<>();
				while(!stackSecond.isEmpty()) {
					TreeNode pop = stackSecond.pop();
					if(pop.right!=null) stackFirst.push(pop.right);
					if(pop.left!=null) stackFirst.push(pop.left);
					tempList.add(pop.val);
				}
				result.add(tempList);
			}
			
			if(stackFirst.isEmpty() && stackSecond.isEmpty()) {
				break;
			}
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
