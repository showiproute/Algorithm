package AlogrithmCourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

//
public class BinaryTree_search_ver2 {
	public  static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public static Stack<TreeNode> stack=new Stack<>();
	public static ArrayList<Integer> arraylist=new ArrayList<>();
	
	public static int FindMinValue(TreeNode root) {
		InOrderUnRecurse(root);
		int[] result=new int[arraylist.size()-1];
		
		for(int i=0;i<arraylist.size()-1;i++) {
			result[i]=Math.abs(arraylist.get(i)-arraylist.get(i+1));
		}
		
		Arrays.sort(result);
		return result[0];		
	}
	
	
	public static void InOrderUnRecurse(TreeNode root) {
		while(root!=null || !stack.isEmpty()) {
			while(root!=null) {
				stack.push(root);
				root=root.left;
			}
			if(!stack.isEmpty()) {
				TreeNode node = stack.pop();
				arraylist.add(node.val);
				root=node.right;
			}
		}
	}
	
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(4);
		TreeNode node2=new TreeNode(2);
		TreeNode node3=new TreeNode(6);
		TreeNode node4=new TreeNode(1);
		TreeNode node5=new TreeNode(3);
		root.left=node2;
		root.right=node3;
		node2.left=node4;
		node2.right=node5;
		
		System.out.println(FindMinValue(root));		
		
	}
}
