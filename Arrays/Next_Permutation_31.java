/*
LeetCode Problem: 31 - Next Permutation
Difficulty: Medium
Topic: Arrays / Two Pointers

Problem Statement:
Implement next permutation, which rearranges numbers into the
lexicographically next greater permutation.
If no such permutation exists, rearrange it as the lowest possible order.

Approach:
1. Find first decreasing element from the right
2. Find the element just larger than it and swap
3. Reverse the suffix

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            swap(nums, l++, r--);
        }
    }
}
