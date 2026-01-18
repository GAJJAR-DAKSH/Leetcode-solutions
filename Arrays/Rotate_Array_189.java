/*
LeetCode Problem: 189 - Rotate Array
Difficulty: Medium
Topic: Arrays

Problem Statement:
Given an array nums, rotate the array to the right by k steps,
where k is non-negative.

Approach:
- Create an auxiliary array
- Place each element at its new rotated position using modulo
- Copy the result back to the original array

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;

        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[(i + k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = ans[i];
        }
    }
}
