/*
LeetCode Problem: 18 - 4Sum
Difficulty: Medium
Topic: Arrays / Two Pointers / Sorting

Problem Statement:
Given an array nums of n integers, return all unique quadruplets
[nums[a], nums[b], nums[c], nums[d]] such that:
a, b, c, and d are distinct and
nums[a] + nums[b] + nums[c] + nums[d] == target.

Approach:
- Sort the array
- Fix two indices i and j
- Use two pointers (left, right) for remaining part
- Skip duplicates at every level
- Use long for sum to avoid overflow

Time Complexity: O(n^3)
Space Complexity: O(1) (excluding output)
*/

import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int left = j + 1, right = n - 1;

                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return ans;
    }
}
