/*
LeetCode Problem: 54 - Spiral Matrix
Difficulty: Medium
Topic: Arrays / Matrix Traversal

Problem Statement:
Given an m x n matrix, return all elements of the matrix in spiral order.

Approach:
- Maintain four boundaries: top, bottom, left, right
- Traverse layer by layer in spiral order
- Shrink boundaries after each traversal

Time Complexity: O(m × n)
Space Complexity: O(1)   (excluding output list)
*/

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {

            // top row
            for (int j = left; j <= right; j++) {
                ans.add(matrix[top][j]);
            }
            top++;

            // right column
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            // bottom row
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans.add(matrix[bottom][j]);
                }
                bottom--;
            }

            // left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }

        return ans;
    }
}
