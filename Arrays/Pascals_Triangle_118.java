/*
LeetCode Problem: 118 - Pascal's Triangle
Difficulty: Easy
Topic: Arrays / Dynamic Programming

Problem Statement:
Given an integer numRows, return the first numRows of Pascal's triangle.

Approach:
- Build triangle row by row
- First and last element of each row is 1
- Inner elements are sum of two elements from previous row

Time Complexity: O(n^2)
Space Complexity: O(n^2)
*/

import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                // first or last element
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> prev = result.get(i - 1);
                    row.add(prev.get(j - 1) + prev.get(j));
                }
            }

            result.add(row);
        }

        return result;
    }
}
