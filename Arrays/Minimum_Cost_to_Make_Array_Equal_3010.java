/*
LeetCode Problem: 3010 - Minimum Cost to Make Array Equal
Difficulty: Easy
Topic: Arrays / Greedy

Problem Statement:
Given an integer array nums, return the minimum possible cost
to make the array equal by selecting exactly three elements
and summing their values.

Approach:
- Always include the first element
- Find the two smallest elements from the remaining array
- Sum the first element with the two smallest values

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int minimumCost(int[] nums) {
        int first = nums[0];

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min1) {
                min2 = min1;
                min1 = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }

        return first + min1 + min2;
    }
}
