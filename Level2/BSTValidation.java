package Level2;

import java.util.Stack;

public class BSTValidation {


    // Given the root node of a Binary Tree, determine if it is a Binary Search Tree.


    public static boolean validateBST(TreeNode root) {

        if (root == null) {
            return false;
        }

        Stack<TreeNode> stack = new Stack<>();

        stack.add(root);

        while (!stack.isEmpty()) {

            TreeNode current = stack.pop();

            if (current.right != null) {
                if (current.data > current.right.data) {
                    return false;
                }
            }

            if (current.left != null) {
                if (current.data < current.left.data) {
                    return false;
                }
            }

            if (current.left != null) {
                stack.push(current.left);
            }

            if (current.right != null) {
                stack.push(current.right);
            }


        }

        return true;


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
