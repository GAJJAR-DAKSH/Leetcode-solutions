/*
LeetCode Problem: 152 - Maximum Product Subarray
Difficulty: Medium
Topic: Arrays / Dynamic Programming

Approach:
- Track both max and min product ending at current index
- Negative numbers can flip max ↔ min
- Update global answer each step

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {

            int curr = nums[i];

            int tempMax = Math.max(curr,
                    Math.max(curr * max, curr * min));

            int tempMin = Math.min(curr,
                    Math.min(curr * max, curr * min));

            max = tempMax;
            min = tempMin;

            ans = Math.max(ans, max);
        }

        return ans;
    }
}
