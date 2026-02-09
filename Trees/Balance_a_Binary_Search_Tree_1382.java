/*
LeetCode Problem: 1382 - Balance a Binary Search Tree
Difficulty: Medium
Topic: Trees / BST / DFS

Problem Statement:
Given a binary search tree, return a balanced binary search tree
with the same node values.

Approach:
1. Perform inorder traversal to collect values in sorted order
2. Build a balanced BST using divide and conquer (middle as root)

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {

    List<Integer> list = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inorder(root);
        return build(0, list.size() - 1);
    }

    void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        list.add(node.val);
        inorder(node.right);
    }

    TreeNode build(int l, int r) {
        if (l > r) return null;

        int mid = (l + r) / 2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = build(l, mid - 1);
        root.right = build(mid + 1, r);

        return root;
    }
}
