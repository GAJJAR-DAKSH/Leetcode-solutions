/*
LeetCode Problem: 53 - Maximum Subarray
Difficulty: Medium
Topic: Arrays / Dynamic Programming

Problem Statement:
Given an integer array nums, find the contiguous subarray
(containing at least one number) which has the largest sum
and return its sum.

Approach:
- Use Kadane’s Algorithm
- Maintain current subarray sum and maximum sum found so far
- At each step, decide whether to extend the subarray or start new

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
