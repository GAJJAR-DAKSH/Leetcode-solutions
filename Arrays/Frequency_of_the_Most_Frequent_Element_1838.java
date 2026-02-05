/*
LeetCode Problem: 1838 - Frequency of the Most Frequent Element
Difficulty: Medium
Topic: Arrays / Sliding Window

Problem Statement:
Given an integer array nums and an integer k, you can increment any element
of the array by 1 at most k times.
Return the maximum possible frequency of an element.

Approach:
- Sort the array
- Use sliding window
- Maintain sum of elements inside window
- Shrink window if cost exceeds k

Time Complexity: O(n log n)
Space Complexity: O(1)
*/

import java.util.Arrays;

class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        long sum = 0;
        int left = 0, max = 1;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left];
                left++;
            }

            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
