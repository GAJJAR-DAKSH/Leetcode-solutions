/*
LeetCode Problem: 283 - Move Zeroes
Difficulty: Easy
Topic: Arrays / Two Pointers

Problem Statement:
Given an integer array nums, move all 0's to the end of it
while maintaining the relative order of the non-zero elements.
Do this in-place without making a copy of the array.

Approach:
- Use an index pointer to track the position of non-zero elements
- Traverse the array and place non-zero values at the front
- Fill remaining positions with zeroes

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[idx++] = nums[i];
            }
        }

        while (idx < nums.length) {
            nums[idx++] = 0;
        }
    }
}
