/*
LeetCode Problem: 1653 - Minimum Deletions to Make String Balanced
Difficulty: Medium
Topic: Strings / Greedy

Problem Statement:
Given a string s consisting only of characters 'a' and 'b',
return the minimum number of deletions needed so that there is
no occurrence of 'b' before 'a'.

Approach:
- Traverse the string once
- Count number of 'b's seen so far
- For each 'a', choose min:
    1) delete this 'a'  -> deletions + 1
    2) delete all previous 'b's -> bCount
- Track minimum deletions

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int minimumDeletions(String s) {
        int bCount = 0;
        int deletions = 0;

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                bCount++;
            } else { // c == 'a'
                deletions = Math.min(deletions + 1, bCount);
            }
        }

        return deletions;
    }
}
