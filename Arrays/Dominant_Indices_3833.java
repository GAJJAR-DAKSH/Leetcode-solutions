/*
LeetCode Problem: 3833 - Dominant Indices
Difficulty: Medium
Topic: Arrays / Brute Force

Problem Statement:
An index i is dominant if nums[i] is strictly greater than the average
of all elements after index i.
Return the number of dominant indices.

Approach:
- For each index i (except last), calculate:
    nums[i] * (number of elements after i) > sum of elements after i
- Count such indices

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Solution {
    public int dominantIndices(int[] nums) {
        int n = nums.length;
        int count = 0;

        // last index can NEVER be dominant
        for (int i = 0; i < n - 1; i++) {
            int sum = 0;
            int elements = n - i - 1;

            for (int j = i + 1; j < n; j++) {
                sum += nums[j];
            }

            // strictly greater check
            if ((long) nums[i] * elements > sum) {
                count++;
            }
        }
        return count;
    }
}
