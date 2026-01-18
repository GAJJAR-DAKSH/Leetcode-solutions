/*
LeetCode Problem: 26 - Remove Duplicates from Sorted Array
Difficulty: Easy
Topic: Arrays

Problem Statement:
Given a sorted array nums, remove the duplicates in-place such that
each unique element appears only once.
Return the number of unique elements.

Approach:
- Use two pointers
- Pointer i tracks the index of the last unique element
- Pointer j scans the array for new unique values
- When nums[j] != nums[i], move i forward and update nums[i]

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }
}
