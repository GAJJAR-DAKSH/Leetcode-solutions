/*
LeetCode Problem: 3634 - Minimum Removals to Make Array K-Multiple Compatible
Difficulty: Medium
Topic: Arrays / Sliding Window

Problem Statement:
Given an array nums and an integer k, remove the minimum number of elements
such that for the remaining array, max <= min * k.

Approach:
- Sort the array
- Use sliding window to find the longest valid subarray
- Window is valid if nums[right] <= nums[left] * k
- Answer = total elements - max valid window length

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int left = 0;
        int maxLen = 1;

        for (int right = 0; right < n; right++) {
            while ((long) nums[right] > (long) nums[left] * k) {
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return n - maxLen;
    }
}
