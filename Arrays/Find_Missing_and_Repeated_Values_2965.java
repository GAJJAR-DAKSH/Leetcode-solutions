/*
LeetCode Problem: 2965 - Find Missing and Repeated Values
Difficulty: Easy
Topic: Arrays / Counting

Problem Statement:
You are given a 0-indexed 2D integer array grid of size n x n with values
in the range [1, n^2]. Each value appears exactly once except one value
which appears twice and one value which is missing.
Return the repeated value and the missing value.

Approach:
- Use a frequency array of size n^2 + 1
- Count occurrences of each number
- Number with frequency 2 is repeated
- Number with frequency 0 is missing

Time Complexity: O(n^2)
Space Complexity: O(n^2)
*/

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] freq = new int[n * n + 1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                freq[grid[i][j]]++;
            }
        }

        int repeated = -1, missing = -1;

        for (int i = 1; i <= n * n; i++) {
            if (freq[i] == 2) repeated = i;
            if (freq[i] == 0) missing = i;
        }

        return new int[]{repeated, missing};
    }
}
