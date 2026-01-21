/*
LeetCode Problem: 3314 - Minimum Bitwise Array
Difficulty: Medium
Topic: Arrays / Bit Manipulation

Problem Statement:
Given a list of integers nums, for each element find the minimum integer x
such that (x | (x + 1)) == nums[i]. If no such x exists, return -1 for that element.

Approach:
- For each target value, try all x from 0 to target
- Check if (x | (x + 1)) equals the target
- Store the first valid x found, else -1

Time Complexity: O(n * max(nums[i]))
Space Complexity: O(n)
*/

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int target = nums.get(i);
            int found = -1;

            for (int x = 0; x <= target; x++) {
                if ((x | (x + 1)) == target) {
                    found = x;
                    break;
                }
            }

            ans[i] = found;
        }

        return ans;
    }
}
