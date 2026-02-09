/*
LeetCode Problem: 88 - Merge Sorted Array
Difficulty: Easy
Topic: Arrays / Two Pointers

Problem Statement:
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
and two integers m and n, representing the number of elements in nums1 and nums2.
Merge nums2 into nums1 as one sorted array in-place.

Approach:
- Use three pointers starting from the end
- Compare largest elements and place them at the end
- Copy remaining elements of nums2 if any

Time Complexity: O(m + n)
Space Complexity: O(1)
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        // copy remaining elements from nums2
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}
