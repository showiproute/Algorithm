package Offer;

import java.util.LinkedList;
import java.util.Queue;


public class Tree2_anotherWay {
	
	public class TreeNode {
	    int val = 0;
	    TreeNode left = null;
	    TreeNode right = null;

	    public TreeNode(int val) {
	        this.val = val;

	    }

	}
	
    public int TreeDepth(TreeNode root) {
    	if(root==null)
    		return 0;
    	
    	int heights=0;
    	Queue<TreeNode> queue=new LinkedList<>();
    	queue.offer(root);
    	while(!queue.isEmpty()) {
    		heights++;
    		for(int i=0;i<queue.size();i++) {
    			TreeNode poll = queue.poll();
    			if(poll.left!=null) {
    				queue.offer(poll.left);
    			}
    			if(poll.right!=null) {
    				queue.offer(poll.right);
    			}	
    		}
    		
    	}
    	
    	
    	return heights;
    }
	
}
