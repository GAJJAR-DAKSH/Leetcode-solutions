/*
LeetCode Problem: 704 - Binary Search
Difficulty: Easy
Topic: Arrays / Binary Search

Problem Statement:
Given a sorted array of integers nums and an integer target,
return the index of target if it exists in nums, otherwise return -1.

Approach:
- Use classic binary search
- Compare middle element with target
- Reduce search space by half each iteration

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
