/*
LeetCode Problem: 1752 - Check if Array Is Sorted and Rotated
Difficulty: Easy
Topic: Arrays

Problem Statement:
Given an array nums, return true if the array was originally sorted
in non-decreasing order and then rotated some number of times.
Otherwise, return false.

Approach:
- Count the number of places where the order breaks
- For a sorted & rotated array, this can happen at most once
- Use modulo (%) to handle circular comparison

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }
        return true;
    }
}
