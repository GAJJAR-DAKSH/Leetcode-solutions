/*
LeetCode Problem: 121 - Best Time to Buy and Sell Stock
Difficulty: Easy
Topic: Arrays / Greedy

Problem Statement:
You are given an array prices where prices[i] is the price of a given stock
on the ith day.
Choose a single day to buy one stock and a different day in the future to sell.
Return the maximum profit you can achieve.

Approach:
- Track the minimum price so far
- At each step, calculate potential profit
- Update maximum profit accordingly

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;      // buy here
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}
