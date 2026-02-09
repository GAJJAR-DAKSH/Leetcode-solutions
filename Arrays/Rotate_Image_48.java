/*
LeetCode Problem: 48 - Rotate Image
Difficulty: Medium
Topic: Arrays / Matrix

Problem Statement:
You are given an n x n 2D matrix representing an image.
Rotate the image by 90 degrees (clockwise) in-place.

Approach:
- Use an auxiliary matrix
- Place each element at its rotated position
- Copy the rotated matrix back to the original

Time Complexity: O(n^2)
Space Complexity: O(n^2)
*/

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];

        // Build rotated matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                temp[j][n - 1 - i] = matrix[i][j];
            }
        }

        // Copy back to original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = temp[i][j];
            }
        }
    }
}
