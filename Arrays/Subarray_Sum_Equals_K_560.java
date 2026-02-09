/*
LeetCode Problem: 560 - Subarray Sum Equals K
Difficulty: Medium
Topic: Arrays / Prefix Sum

Problem Statement:
Given an array of integers nums and an integer k,
return the total number of continuous subarrays whose sum equals k.

Approach:
- Fix a starting index
- Extend subarray and keep cumulative sum
- Count whenever cumulative sum equals k

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) count++;
            }
        }
        return count;
    }
}
