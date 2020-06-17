package Level2;

public class SumBinaryTree {
    
    // Given a binary tree, write a method to find and return the sum of all the elements using recursion. For an empty tree the sum is 0.
    // Example:  
    //       1
    //      / \
    //     2   3    
    //    / \ / \        
    //   4  5 6  7
    //  /
    // 8   
    // ==> sum of all nodes = 36 
    // (1+2+3+4+5+6+7+8)

    public static int sum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.data == 0) {
            return 0;
        }
        return root.data + sum(root.left) + sum(root.right);


    }


    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode(int data, TreeNode left, TreeNode right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        TreeNode() {

        }
    }
}
