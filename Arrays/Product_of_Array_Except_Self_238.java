/*
LeetCode Problem: 238 - Product of Array Except Self
Difficulty: Medium
Topic: Arrays / Prefix-Suffix Product

Approach:
- Build prefix products in result array
- Traverse from right and multiply suffix product
- No division used

Time Complexity: O(n)
Space Complexity: O(1) (excluding output)
*/

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] = ans[i] * right;
            right *= nums[i];
        }

        return ans;
    }
}
