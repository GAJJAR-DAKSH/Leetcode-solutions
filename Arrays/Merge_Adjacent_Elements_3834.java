/*
LeetCode Problem: 3834 - Merge Adjacent Elements
Difficulty: Medium
Topic: Arrays / Stack Simulation

Problem Statement:
Given an integer array nums, repeatedly merge adjacent equal elements.
When two adjacent elements are equal, they are merged into one element
with value equal to their sum.
Return the final array after all possible merges.

Approach:
- Use a stack (array) to simulate merging
- Traverse elements one by one
- While top of stack equals current, merge and pop
- Push the merged value back
- Convert stack to result list

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        int n = nums.length;

        long[] stack = new long[n];   // use long as values can grow
        int top = -1;

        for (int num : nums) {
            long curr = num;

            // merge while top equals current
            while (top >= 0 && stack[top] == curr) {
                curr += stack[top];
                top--;
            }

            stack[++top] = curr;
        }

        // convert stack to List<Long>
        List<Long> result = new ArrayList<>();
        for (int i = 0; i <= top; i++) {
            result.add(stack[i]);
        }

        return result;
    }
}
