/*
LeetCode Problem: 128 - Longest Consecutive Sequence
Difficulty: Medium
Topic: Arrays / Sorting

Problem Statement:
Given an unsorted array of integers nums, return the length
of the longest consecutive elements sequence.

Approach:
- Sort the array
- Skip duplicate elements
- Count consecutive increasing numbers
- Track the maximum sequence length

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);

        int maxLen = 1;
        int currLen = 1;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            } else if (nums[i] == nums[i - 1] + 1) {
                currLen++;
            } else {
                currLen = 1;
            }

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}
