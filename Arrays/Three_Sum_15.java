/*
LeetCode Problem: 15 - 3Sum
Difficulty: Medium
Topic: Arrays / Hashing

Problem Statement:
Given an integer array nums, return all the triplets
[nums[i], nums[j], nums[k]] such that i != j != k and
nums[i] + nums[j] + nums[k] == 0.

Approach:
- Fix one element nums[i]
- Use a HashSet to find two-sum pairs for -nums[i]
- Sort each triplet before storing to avoid duplicates
- Use a Set of lists to ensure uniqueness

Time Complexity: O(n^2)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int needed = -nums[i] - nums[j];

                if (seen.contains(needed)) {
                    List<Integer> triplet =
                            Arrays.asList(nums[i], nums[j], needed);
                    Collections.sort(triplet);
                    result.add(triplet);
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(result);
    }
}
