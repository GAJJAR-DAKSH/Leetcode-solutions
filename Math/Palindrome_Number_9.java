/*
LeetCode Problem: 9 - Palindrome Number
Difficulty: Easy
Topic: Math

Problem Statement:
Given an integer x, return true if x is a palindrome,
and false otherwise.

Approach:
- Negative numbers are not palindromes
- Numbers ending with 0 (except 0 itself) are not palindromes
- Reverse only half of the number to avoid overflow
- Compare the first half and reversed second half

Time Complexity: O(log10(n))
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            int lastDigit = x % 10;
            reversedHalf = reversedHalf * 10 + lastDigit;
            x = x / 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}
