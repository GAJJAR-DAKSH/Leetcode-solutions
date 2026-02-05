/*
LeetCode Problem: 3798 - Largest Even String
Difficulty: Easy
Topic: Strings / Greedy

Problem Statement:
Given a string s consisting of digits, return the largest even string
that can be formed as a prefix of s. If no such string exists, return "".

Approach:
- Find the last occurrence of an even digit ('2' in this problem)
- Return the substring from start to that index
- If no even digit exists, return empty string

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public String largestEven(String s) {
        StringBuilder result = new StringBuilder();
        int lastTwo = -1;

        // Find last occurrence of '2'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '2') {
                lastTwo = i;
            }
        }

        if (lastTwo == -1) {
            return "";
        }

        for (int i = 0; i <= lastTwo; i++) {
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}
