/*
LeetCode Problem: 56 - Merge Intervals
Difficulty: Medium
Topic: Arrays / Greedy / Sorting

Approach:
- Sort intervals by start time
- Compare with last merged interval
- Merge overlapping ranges

Time Complexity: O(n log n)
Space Complexity: O(n)
*/

import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) return new int[0][0];

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        result.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] last = result.get(result.size() - 1);
            int[] curr = intervals[i];

            if (curr[0] <= last[1]) {
                last[1] = Math.max(last[1], curr[1]);
            } else {
                result.add(curr);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}
