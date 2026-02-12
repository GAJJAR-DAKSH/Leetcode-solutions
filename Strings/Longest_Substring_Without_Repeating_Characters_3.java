/*
LeetCode Problem: 3 - Longest Substring Without Repeating Characters
Difficulty: Medium
Topic: Strings / Sliding Window

Approach:
- Use two pointers (left, right)
- Maintain a HashSet of current window characters
- Expand right pointer
- Shrink left pointer when duplicate appears

Time Complexity: O(n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
