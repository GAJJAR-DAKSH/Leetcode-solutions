/*
LeetCode Problem: 3379 - Construct Transformed Array
Difficulty: Easy
Topic: Arrays / Simulation

Problem Statement:
Given an integer array nums, construct a transformed array res such that:
- If nums[i] == 0, then res[i] = nums[i]
- Otherwise, res[i] = nums[(i + nums[i]) % n]
Handle negative indices correctly.

Approach:
- Traverse the array
- For each index, calculate the new index using modulo
- Adjust for negative indices
- Build the result array

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                res[i] = nums[i];
            } else {
                int newIndex = (i + nums[i]) % n;
                if (newIndex < 0) {
                    newIndex += n;
                }
                res[i] = nums[newIndex];
            }
        }
        return res;
    }
}
