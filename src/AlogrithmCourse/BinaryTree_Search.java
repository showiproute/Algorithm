package AlogrithmCourse;

import java.util.ArrayList;
import java.util.Arrays;

public class BinaryTree_Search {
	public  static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;
	    }
	}
	
	public static ArrayList<Integer> arrayList=new ArrayList<>();
	
	public static int FindMinValue(TreeNode root) {
		InOrderTreversal(root);
		int[] result=new int[arrayList.size()-1];
		
		for(int i=0;i<arrayList.size()-1;i++) {
			result[i]=Math.abs(arrayList.get(i)-arrayList.get(i+1));
		}
		
		Arrays.sort(result);
		return result[0];
	}
	
	public static void InOrderTreversal(TreeNode root) {
		if(root.left!=null) {
			InOrderTreversal(root.left);
		}
		arrayList.add(root.val);
		if(root.right!=null) {
			InOrderTreversal(root.right);
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
