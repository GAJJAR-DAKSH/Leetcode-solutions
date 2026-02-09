/*
LeetCode Problem: 73 - Set Matrix Zeroes
Difficulty: Medium
Topic: Arrays / Matrix

Problem Statement:
Given an m x n integer matrix, if an element is 0,
set its entire row and column to 0.
You must do it in-place.

Approach:
- Use two boolean arrays to mark rows and columns that contain zero
- Traverse the matrix again and set cells to zero based on marks

Time Complexity: O(m × n)
Space Complexity: O(m + n)
*/

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        // Step 1: mark rows and columns
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Step 2: set zeros
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}

