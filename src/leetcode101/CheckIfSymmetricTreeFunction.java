package leetcode101;

public class CheckIfSymmetricTreeFunction {
    public boolean isSymmetric(TreeNode root) {
    	if(root == null){
    		return true;
    	}
        // check left subtree and right subtree to see if its symmetric
        return root == null || checkingLeftRight(root.left, root.right);
    }
    
    // Checking if left subtree node are same as right subtree node
    private boolean checkingLeftRight(TreeNode leftSub, TreeNode rightSub){
        // If reach till end where both children is null, return true
        if(leftSub == null && rightSub == null){
            return true;
        }
        
        // If one of them is null and one of them is not null return false
        if(leftSub == null || rightSub == null){
            return false;
        }
        
        // Check the value if they are equal, then check their child patterns
        return leftSub.val == rightSub.val && checkingLeftRight(leftSub.left, rightSub.right) && checkingLeftRight(leftSub.right, rightSub.left);
    }
}
