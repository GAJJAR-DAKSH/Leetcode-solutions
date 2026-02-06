/*
LeetCode Problem: 3637 - Trionic Array
Difficulty: Easy
Topic: Arrays / Pattern Traversal

Problem Statement:
An array is trionic if it strictly increases, then strictly decreases,
and then strictly increases again.
Return true if the array follows this pattern, otherwise false.

Approach:
- Traverse the array in three phases:
  1. Increasing
  2. Decreasing
  3. Increasing
- Ensure each phase has at least one element
- Validate that traversal ends at the last index

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        int i = 0;

        // First increasing phase
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }
        if (i == 0) return false;

        // Decreasing phase
        while (i + 1 < n && nums[i] > nums[i + 1]) {
            i++;
        }
        if (i == n - 1) return false;

        // Final increasing phase
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            i++;
        }

        return i == n - 1;
    }
}
