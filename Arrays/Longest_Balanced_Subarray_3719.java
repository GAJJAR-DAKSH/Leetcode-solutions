/*
LeetCode Problem: 3719 - Longest Balanced Subarray
Difficulty: Medium
Topic: Arrays / Brute Force / HashSet

Problem Statement:
Given an integer array nums, find the length of the longest subarray
where the number of distinct even elements is equal to the number of
distinct odd elements.

Approach:
- Fix starting index i
- Expand subarray to the right
- Track distinct even and odd elements using HashSet
- Update max length when sizes match

Time Complexity: O(n^2)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            Set<Integer> evenSet = new HashSet<>();
            Set<Integer> oddSet = new HashSet<>();

            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 0) {
                    evenSet.add(nums[j]);
                } else {
                    oddSet.add(nums[j]);
                }

                if (evenSet.size() == oddSet.size()) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
}
