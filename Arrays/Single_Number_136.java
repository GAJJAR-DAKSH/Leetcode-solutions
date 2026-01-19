/*
LeetCode Problem: 136 - Single Number
Difficulty: Easy
Topic: Arrays / Bit Manipulation

Problem Statement:
Given a non-empty array of integers nums, every element appears twice
except for one. Find that single one.

Approach:
- Use XOR operation
- XOR of a number with itself is 0
- XOR of a number with 0 is the number itself
- All duplicates cancel out, leaving the unique number

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }
}
