/*
LeetCode Problem: 2149 - Rearrange Array Elements by Sign
Difficulty: Medium
Topic: Arrays / Simulation

Problem Statement:
Given a 0-indexed integer array nums of even length consisting of
an equal number of positive and negative integers, rearrange the array
such that the result alternates between positive and negative numbers,
starting with a positive number.

Approach:
- Separate positive and negative numbers into two arrays
- Merge them alternately into the result array

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];

        int p = 0, q = 0;

        for (int num : nums) {
            if (num > 0) pos[p++] = num;
            else neg[q++] = num;
        }

        int[] ans = new int[n];
        int i = 0;
        for (int k = 0; k < n / 2; k++) {
            ans[i++] = pos[k];
            ans[i++] = neg[k];
        }

        return ans;
    }
}
