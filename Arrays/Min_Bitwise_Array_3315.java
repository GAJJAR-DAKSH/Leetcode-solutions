/*
LeetCode Problem: 3315 - Minimum Bitwise Array
Difficulty: Medium
Topic: Arrays / Bit Manipulation

Problem Statement:
Given a list of integers nums, for each element find the minimum integer x
such that (x | (x + 1)) == nums[i]. If no such x exists, return -1.

Optimized Approach:
- If number is even, answer is -1
- Count trailing 1s in binary representation
- Subtract 2^(t-1) from the number

Time Complexity: O(n * log(max(nums[i])))
Space Complexity: O(n)
*/

class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++) {
            int n = nums.get(i);

            // Even numbers cannot satisfy condition
            if ((n & 1) == 0) {
                ans[i] = -1;
                continue;
            }

            // Count trailing ones
            int t = 0;
            int temp = n;
            while ((temp & 1) == 1) {
                t++;
                temp >>= 1;
            }

            ans[i] = n - (1 << (t - 1));
        }

        return ans;
    }
}
