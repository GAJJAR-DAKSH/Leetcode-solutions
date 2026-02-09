/*
LeetCode Problem: 3835 - Count Subarrays With Cost Less Than or Equal to K
Difficulty: Hard
Topic: Arrays / Sliding Window / Monotonic Deque

Problem Statement:
Given an integer array nums and a long k, return the number of subarrays
where "cost" = (max element - min element) * length of subarray ≤ k.

Approach:
- Use sliding window with two monotonic deques
- One deque maintains maximum values
- One deque maintains minimum values
- Shrink window when cost exceeds k
- Count valid subarrays ending at each right index

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public long countSubarrays(int[] nums, long k) {
        Deque<Integer> maxD = new ArrayDeque<>();
        Deque<Integer> minD = new ArrayDeque<>();

        int left = 0;
        long ans = 0;

        for (int right = 0; right < nums.length; right++) {

            // maintain max deque
            while (!maxD.isEmpty() && nums[maxD.peekLast()] <= nums[right]) {
                maxD.pollLast();
            }
            maxD.addLast(right);

            // maintain min deque
            while (!minD.isEmpty() && nums[minD.peekLast()] >= nums[right]) {
                minD.pollLast();
            }
            minD.addLast(right);

            // shrink window if cost exceeds k
            while ((long) (nums[maxD.peekFirst()] - nums[minD.peekFirst()])
                    * (right - left + 1) > k) {

                if (maxD.peekFirst() == left) maxD.pollFirst();
                if (minD.peekFirst() == left) minD.pollFirst();
                left++;
            }

            // count valid subarrays ending at right
            ans += (right - left + 1);
        }

        return ans;
    }
}
