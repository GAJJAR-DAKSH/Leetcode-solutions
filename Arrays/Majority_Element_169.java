/*
LeetCode Problem: 169 - Majority Element
Difficulty: Easy
Topic: Arrays / Voting Algorithm

Problem Statement:
Given an array nums of size n, return the majority element.
The majority element appears more than ⌊n / 2⌋ times.

Approach:
- Use Boyer-Moore Voting Algorithm
- Maintain a candidate and a counter
- Increment count if same as candidate, else decrement
- When count becomes 0, change the candidate

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
