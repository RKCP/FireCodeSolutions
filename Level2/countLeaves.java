package Level2;

public class countLeaves {

    // Write a function to find the total number of leaf nodes in a binary tree.
    // A node is described as a leaf node if it doesn't have any children.
    // If there are no leaf nodes, return 0.

    public int numberOfLeaves(TreeNode root) {

        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        } else if (root.right == null){
            return numberOfLeaves(root.left);
        } else if (root.left == null) {
            return numberOfLeaves(root.right);
        }
        return 1 +  numberOfLeaves(root);
    }


    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
