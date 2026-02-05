/*
LeetCode Problem: 50 - Pow(x, n)
Difficulty: Medium
Topic: Math / Binary Exponentiation

Problem Statement:
Implement pow(x, n), which calculates x raised to the power n (x^n).

Approach:
- Use binary exponentiation
- Convert n to long to handle Integer.MIN_VALUE
- If n is negative, invert x and make n positive
- Repeatedly square x and reduce exponent

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public double myPow(double x, int n) {
        long power = n;     // use long to avoid overflow
        double result = 1.0;

        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        while (power > 0) {
            if (power % 2 == 1) {
                result *= x;
            }
            x *= x;
            power /= 2;
        }

        return result;
    }
}
