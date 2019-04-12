package Offer;

import java.util.ArrayList;



/*
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如， （5，3，7，2，4，6，8） 
 *    中，按结点数值大小顺序第三小结点的值为4。
 */
public class BinaryTree_13 {
	public static class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
    public static TreeNode KthNode(TreeNode pRoot, int k) {
    	ArrayList<TreeNode> arrayList=new ArrayList<>();

    	if(pRoot==null || k<=0) return null;
    	
    	InOrder(pRoot,arrayList);
    	
    	if(k>arrayList.size()) return null;
    	
    	
    	
    	return arrayList.get(k-1);
        
    }
    
    public static void InOrder(TreeNode pRoot,ArrayList<TreeNode> arrayList) {
    	if(pRoot==null)
    		return;
    	InOrder(pRoot.left,arrayList);
    	arrayList.add(pRoot);
    	InOrder(pRoot.right,arrayList);
    }
	
    public static void main(String[] args) {
		TreeNode root=new TreeNode(8);
		TreeNode node2=new TreeNode(9);
		TreeNode node3=new TreeNode(10);
		TreeNode node4=new TreeNode(5);
		TreeNode node5=new TreeNode(7);
		TreeNode node6=new TreeNode(9);
		TreeNode node7=new TreeNode(11);
		
		root.left=node2;
		root.right=node3;
		node2.left=node4;
		node2.right=node5;
		node3.left=node6;
		node3.right=node7;
		
    	System.out.println(KthNode(root, 2).val);
	}
}
