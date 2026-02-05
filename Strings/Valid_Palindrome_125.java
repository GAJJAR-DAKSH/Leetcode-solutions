/*
LeetCode Problem: 125 - Valid Palindrome
Difficulty: Easy
Topic: Strings / Two Pointers

Problem Statement:
Given a string s, determine if it is a palindrome,
considering only alphanumeric characters and ignoring cases.

Approach:
- Use two pointers (left and right)
- Skip non-alphanumeric characters
- Compare characters in lowercase
- Move pointers inward

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {

            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
