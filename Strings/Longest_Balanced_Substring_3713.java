/*
LeetCode Problem: 3713 - Longest Balanced Substring
Difficulty: Medium
Topic: Strings / Frequency Counting

Approach:
- Try every starting index
- Maintain character frequency
- Track distinct characters and max frequency
- Balanced condition:
    distinct * maxFreq == length of substring

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {

            int[] freq = new int[26];
            int distinct = 0;
            int maxFreq = 0;

            for (int j = i; j < n; j++) {

                int idx = s.charAt(j) - 'a';

                freq[idx]++;
                if (freq[idx] == 1) distinct++;

                maxFreq = Math.max(maxFreq, freq[idx]);

                int len = j - i + 1;

                if (distinct * maxFreq == len) {
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        return maxLen;
    }
}
