/*
LeetCode Problem: 7 - Reverse Integer
Difficulty: Medium
Topic: Math

Problem Statement:
Given a 32-bit signed integer x, reverse digits of an integer.
Return 0 if the reversed integer overflows.

Approach:
- Extract digits using modulo (% 10)
- Build the reversed number
- Check for overflow before multiplication

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x = x / 10;

            // Overflow check
            if (rev > Integer.MAX_VALUE / 10 ||
                rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit;
        }
        return rev;
    }
}
