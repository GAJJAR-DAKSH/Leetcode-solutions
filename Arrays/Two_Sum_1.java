/*
LeetCode Problem: 1 - Two Sum
Difficulty: Easy
Topic: Arrays / Hashing

Problem Statement:
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.

Approach:
- Use a HashMap to store previously seen numbers and their indices
- For each element, check if (target - current number) exists in the map
- If found, return both indices

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];

            if (map.containsKey(rem)) {
                return new int[]{map.get(rem), i};
            }

            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
