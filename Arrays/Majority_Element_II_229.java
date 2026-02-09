/*
LeetCode Problem: 229 - Majority Element II
Difficulty: Medium
Topic: Arrays / Sorting

Problem Statement:
Given an integer array of size n, find all elements that appear
more than ⌊ n/3 ⌋ times.

Approach:
- Sort the array
- Count consecutive equal elements
- Add element to result if count > n/3

Time Complexity: O(n log n)
Space Complexity: O(1)   (excluding output list)
*/

import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        int count = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                if (count > n / 3) {
                    res.add(nums[i - 1]);
                }
                count = 1;
            }
        }

        // check last element
        if (count > n / 3) {
            res.add(nums[n - 1]);
        }

        return res;
    }
}
