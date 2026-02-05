/*
LeetCode Problem: 35 - Search Insert Position
Difficulty: Easy
Topic: Arrays / Binary Search

Problem Statement:
Given a sorted array of distinct integers nums and a target value,
return the index if the target is found.
If not, return the index where it would be inserted in order.

Approach:
- Use binary search
- Keep track of the possible insertion index
- Shrink search space until resolved

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = nums.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
