/*
LeetCode Problem: 268 - Missing Number
Difficulty: Easy
Topic: Arrays / Math

Problem Statement:
Given an array nums containing n distinct numbers in the range [0, n],
return the one number that is missing from the array.

Approach:
- Use the sum formula for first n natural numbers
- Expected sum = n * (n + 1) / 2
- Subtract the actual sum of array elements
- The difference gives the missing number

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
