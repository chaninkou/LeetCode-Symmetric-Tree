package tree;


public class Main {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		
		System.out.println("Input: " + "[1,2,2,3,4,4,3]");
		
		CheckIfSymmetricTreeFunction solution = new CheckIfSymmetricTreeFunction();
		
		System.out.println("Solution: " + solution.isSymmetric(root));
		
	}
	
}
