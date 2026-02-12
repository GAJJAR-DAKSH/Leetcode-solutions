/*
LeetCode Problem: 79 - Word Search
Difficulty: Medium
Topic: Backtracking / DFS / Matrix

Approach:
- Try starting from every cell
- DFS in 4 directions
- Mark visited cells temporarily
- Restore after recursion

Time Complexity: O(m * n * 4^L)
Space Complexity: O(L)
*/

class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(char[][] board,String word,int i,int j,int index){

        if (index == word.length()) return true;

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length
                || board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean found =
                dfs(board, word, i + 1, j, index + 1) ||
                dfs(board, word, i - 1, j, index + 1) ||
                dfs(board, word, i, j + 1, index + 1) ||
                dfs(board, word, i, j - 1, index + 1);

        board[i][j] = temp;
        return found;
    }
}
