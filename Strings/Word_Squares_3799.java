/*
LeetCode Problem: 3799 - Word Squares
Difficulty: Medium
Topic: Strings / Backtracking

Problem Statement:
Given an array of words, return all possible word squares.
A word square is a sequence of words where the kth row and kth column read the same string.

Approach:
- Try all ordered combinations of 4 distinct words
- Check corner constraints to validate square formation
- Store valid word squares
- Sort the result lexicographically

Time Complexity: O(n^4)
Space Complexity: O(ans)
*/

import java.util.*;

class Solution {
    public List<List<String>> wordSquares(String[] words) {
        List<List<String>> res = new ArrayList<>();
        int n = words.length;

        // Try every ordered combination of 4 distinct words
        for (int i = 0; i < n; i++) {          // top
            for (int j = 0; j < n; j++) {      // left
                if (j == i) continue;
                for (int k = 0; k < n; k++) {  // right
                    if (k == i || k == j) continue;
                    for (int l = 0; l < n; l++) { // bottom
                        if (l == i || l == j || l == k) continue;

                        String top = words[i];
                        String left = words[j];
                        String right = words[k];
                        String bottom = words[l];

                        // Check corner constraints
                        if (top.charAt(0) == left.charAt(0) &&
                            top.charAt(3) == right.charAt(0) &&
                            bottom.charAt(0) == left.charAt(3) &&
                            bottom.charAt(3) == right.charAt(3)) {

                            res.add(Arrays.asList(top, left, right, bottom));
                        }
                    }
                }
            }
        }

        // Sort lexicographically
        Collections.sort(res, (a, b) -> {
            for (int i = 0; i < 4; i++) {
                int cmp = a.get(i).compareTo(b.get(i));
                if (cmp != 0) return cmp;
            }
            return 0;
        });

        return res;
    }
}
