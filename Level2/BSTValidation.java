package Level2;

import java.util.Stack;

public class BSTValidation {


    // Given the root node of a Binary Tree, determine if it is a Binary Search Tree.


    public static boolean validateBST(TreeNode root) {

        if (root == null) {
            return false;
        }

        Stack<TreeNode> stack = new Stack<>();
        int count = 0;

        stack.add(root); // add the entire root to the Stack

        while (!stack.isEmpty()) {
            TreeNode current = stack.pop();


            if (current.left != null) {
                if (current.left.data > current.data) {
                    return false;
                }
            }

            if (current.right != null) {
                if (current.right.data < current.data) {
                    return false;
                }
            }

            if (current.right != null && current.left != null) {
                if (current.right.data > root.data &&  current.left.data < current.data && count > 0) {
                    return false;
                }
            }

            if (current.left != null) {
                stack.push(current.left);
            }

            if (current.right != null) {
                stack.push(current.right);
            }

            count++;

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
