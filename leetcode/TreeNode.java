package leetcode;


public class TreeNode {
	public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode() {}
    public TreeNode(int x) { val = x; }
    public TreeNode toTreeNode(int[] nums){
    	if(nums==null||nums.length==0)return new TreeNode();
    	
    	TreeNode root=new TreeNode(nums[0]);
    	for(int i = 1;i<nums.length;i++){
//    		nu
    	}
    	return root;
    }
    
}
 
