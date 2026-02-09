/*
LeetCode Problem: 11 - Container With Most Water
Difficulty: Medium
Topic: Arrays / Two Pointers / Greedy

Problem Statement:
Given n non-negative integers height where each represents a point at
coordinate (i, height[i]), find two lines that together with the x-axis
form a container that holds the most water.

Approach:
- Use two pointers (left & right)
- Compute area using min(height[left], height[right]) * width
- Move the pointer pointing to the smaller height

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            maxArea = Math.max(maxArea, h * w);

            // move the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}
