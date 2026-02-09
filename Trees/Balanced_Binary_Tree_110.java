/*
LeetCode Problem: 110 - Balanced Binary Tree
Difficulty: Easy
Topic: Trees / DFS

Problem Statement:
Given a binary tree, determine if it is height-balanced.
A height-balanced binary tree is defined as a binary tree in which
the depth of the two subtrees of every node never differs by more than 1.

Approach:
- Use bottom-up DFS
- Return height if subtree is balanced
- Return -1 immediately if an imbalance is detected
- Final tree is balanced if height(root) != -1

Time Complexity: O(n)
Space Complexity: O(h)  // recursion stack
*/

class Solution {
    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }

    private int height(TreeNode node) {
        if (node == null) return 0;

        int left = height(node.left);
        if (left == -1) return -1;

        int right = height(node.right);
        if (right == -1) return -1;

        if (Math.abs(left - right) > 1) return -1;

        return Math.max(left, right) + 1;
    }
}
