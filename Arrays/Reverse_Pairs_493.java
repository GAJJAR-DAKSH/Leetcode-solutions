/*
LeetCode Problem: 493 - Reverse Pairs
Difficulty: Hard
Topic: Arrays / Merge Sort / Divide & Conquer

Approach:
- Use modified merge sort
- Count reverse pairs during merge phase
- Maintain sorted halves

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

class Solution {

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    int mergeSort(int[] nums, int low, int high) {
        if (low >= high) return 0;

        int mid = (low + high) / 2;
        int count = 0;

        count += mergeSort(nums, low, mid);
        count += mergeSort(nums, mid + 1, high);
        count += countPairs(nums, low, mid, high);

        merge(nums, low, mid, high);
        return count;
    }

    int countPairs(int[] nums, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) nums[i] > 2L * nums[right]) {
                right++;
            }
            count += right - (mid + 1);
        }
        return count;
    }

    void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low, j = mid + 1, k = 0;

        while (i <= mid && j <= high) {
            if (nums[i] <= nums[j]) temp[k++] = nums[i++];
            else temp[k++] = nums[j++];
        }

        while (i <= mid) temp[k++] = nums[i++];
        while (j <= high) temp[k++] = nums[j++];

        for (int x = 0; x < temp.length; x++) {
            nums[low + x] = temp[x];
        }
    }
}
