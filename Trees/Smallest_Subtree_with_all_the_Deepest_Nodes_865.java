/*
LeetCode Problem: 865 - Smallest Subtree with all the Deepest Nodes
Difficulty: Medium
Topic: Trees / DFS

Problem Statement:
Given the root of a binary tree, return the smallest subtree
that contains all the deepest nodes in the tree.

Approach:
- Use DFS to calculate depth of left and right subtrees
- Track the maximum depth encountered
- If left depth == right depth == max depth, current node is the answer

Time Complexity: O(n)
Space Complexity: O(h)  // recursion stack
*/

class Solution {
    int max = 0;
    TreeNode ans;

    public TreeNode subtreeWithAllDeepest(TreeNode root) {
        dfs(root, 0);
        return ans;
    }

    int dfs(TreeNode n, int d) {
        if (n == null) {
            max = Math.max(max, d);
            return d;
        }

        int l = dfs(n.left, d + 1);
        int r = dfs(n.right, d + 1);

        if (l == r && l == max)
            ans = n;

        return Math.max(l, r);
    }
}
