package Level2;

import java.util.ArrayList;
import java.util.Stack;

public class preorderTraversal {

    // Given a binary tree, write a method to iteratively traverse the tree in the preorder manner.
    // Mark a node as visited by adding its data to a list - Arraylist <Integer> preorderedList. Return this list.

    // Preorder traversal - Data,Left,Right


    public static ArrayList<Integer> preorderItr(TreeNode root) {

        ArrayList<Integer> nums = new ArrayList<>();

        Stack<TreeNode> stack = new Stack<>();

        stack.push(root);

        if (stack.isEmpty()) {
            return nums;
        }

        while (!stack.isEmpty()) {

            TreeNode current = stack.pop();

            nums.add(current.data);

            if (current.right != null) {
                stack.push(current.right);
            }

            if (current.left != null) {
                stack.push(current.left);
            }
        }

        return nums;

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
