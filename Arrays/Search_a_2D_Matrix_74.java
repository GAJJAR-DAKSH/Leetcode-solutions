/*
LeetCode Problem: 74 - Search a 2D Matrix
Difficulty: Medium
Topic: Arrays / Binary Search / Matrix

Problem Statement:
Given an m x n matrix where each row is sorted in ascending order
and the first integer of each row is greater than the last integer
of the previous row, determine if target exists in the matrix.

Approach:
- Treat the matrix as a flattened sorted array
- Apply binary search on indices [0 .. m*n - 1]
- Map index to (row, col) using division and modulo

Time Complexity: O(log(m * n))
Space Complexity: O(1)
*/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int low = 0, high = m * n - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            int row = mid / n;
            int col = mid % n;

            int val = matrix[row][col];

            if (val == target) return true;
            else if (val < target) low = mid + 1;
            else high = mid - 1;
        }

        return false;
    }
}
