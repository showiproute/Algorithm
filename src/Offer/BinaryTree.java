package Offer;

import java.util.ArrayList;
import java.util.List;

import Offer.BinaryTree.TreeNode;

/*
 * /**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 
public class BinaryTree {

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		}
	}
	
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        ArrayList<Integer> preList=new ArrayList<>(pre.length);
        ArrayList<Integer> inList=new ArrayList<>(in.length);

        for(int i=0;i<pre.length;i++) {
        	preList.add(pre[i]);
        	inList.add(in[i]);
        }
        
    	return getRootNode(preList,inList);
    }
    
    private static TreeNode getRootNode(List preList,List inList) {
    	if(preList.size()==0) {
    		return null;
    	}   	
    	
    	int nodeVal =(Integer) preList.get(0);
    	TreeNode root = new TreeNode(nodeVal);
    	int rootIndex = inList.indexOf(nodeVal);
    	
    	List leftInList = inList.subList(0, rootIndex);
    	List leftPreList = preList.subList(1, leftInList.size()+1);
    	List rightInList = inList.subList(rootIndex+1, inList.size());
    	List rightPreList = preList.subList(preList.size()-rightInList.size(), preList.size());
    	
    	root.left=getRootNode(leftPreList, leftInList);
    	root.right=getRootNode(rightPreList, rightInList);
    	
    	return root;
    }
    
	
}
