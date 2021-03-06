package Offer;


/*
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回。
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针。
 */
public class BinaryTree_8 {
	public static class TreeLinkNode {
	    int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;

	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	
	
    public static TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode==null) return null;
        
        if(pNode.right!=null) {
        	TreeLinkNode Node = pNode.right;
        	while(Node.left!=null) {
        		Node=Node.left;
        	}
        	return Node;
        }
        while(pNode.next!=null) {
        	if(pNode==pNode.next.left) return pNode.next;
        	pNode=pNode.next;
        }
        
    	return null;
    }
}

