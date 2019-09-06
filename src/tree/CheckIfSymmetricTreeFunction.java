package tree;

public class CheckIfSymmetricTreeFunction {
    public boolean isSymmetric(TreeNode root) {
        // If root is null, return false or check left subtree and right subtree if root is not null
        return root == null || checkingLeftRight(root.left, root.right);
    }
    
    // Checking if left subtree node are same as right subtree node
    private boolean checkingLeftRight(TreeNode leftSub, TreeNode rightSub){
        // If there is only root, return true
        if(leftSub == null && rightSub == null){
            return true;
        }
        
        // If one of them is null and one of them is not null return false
        if(leftSub == null || rightSub == null){
            return false;
        }
        
        return leftSub.val == rightSub.val && checkingLeftRight(leftSub.left, rightSub.right) && checkingLeftRight(leftSub.right, rightSub.left);

    
    }
}
