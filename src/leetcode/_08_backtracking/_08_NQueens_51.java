package leetcode._08_backtracking;

import java.util.*;

public class _08_NQueens_51 {
    // TODO - Given an integer n, representing an n x n chessboard we have to put queens in such a way that none of the queens can attack each other
    //  n = 4, o/p -> [[".Q..","...Q","Q...","..Q."],["..Q.","Q...","...Q",".Q.."]]

    // n = 4
    // Output:
    // [
    //   [".Q..",  // Row 0 → Queen at column 1
    //    "...Q",  // Row 1 → Queen at column 3
    //    "Q...",  // Row 2 → Queen at column 0
    //    "..Q."], // Row 3 → Queen at column 2
    //
    //   ["..Q.",  // Row 0 → Queen at column 2
    //    "Q...",  // Row 1 → Queen at column 0
    //    "...Q",  // Row 2 → Queen at column 3
    //    ".Q.."]  // Row 3 → Queen at column 1
    // ]
    //
    // * First Solution (visualized as a 2D board):
    // [
    //   [., Q, ., .],
    //   [., ., ., Q],
    //   [Q, ., ., .],
    //   [., ., Q, .]
    // ]

    public static List<List<String>> placeQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char[][] board = new char[n][n];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }
        HashSet<Integer> presentInCol = new HashSet<>();
        HashSet<Integer> presentAtPosDiagonal = new HashSet<>();
        HashSet<Integer> presentAtNegDiagonal = new HashSet<>();
        backtrack(0, n, res, board, presentInCol, presentAtPosDiagonal, presentAtNegDiagonal);
        return res;
    }

    public static void backtrack(int row, int n, List<List<String>> res, char[][] board, HashSet<Integer> presentInCol, HashSet<Integer> presentAtPosDiagonal, HashSet<Integer> presentAtNegDiagonal) {
        if (row >= n) {
            res.add(generateBoard(board));
            return;
        }
        // Iterating through cols
        for (int col = 0; col < n; col++) {
            int posDiagonalIdx = row + col;
            int negDiagonalIdx = row - col;
            if (presentInCol.contains(col) || presentAtPosDiagonal.contains(posDiagonalIdx) || presentAtNegDiagonal.contains(negDiagonalIdx)) {
                // If placement of the queen violates the must be present only once for each column, or diagonal attack is possible then try next position
                continue;
            }
            presentInCol.add(col);
            presentAtPosDiagonal.add(posDiagonalIdx);
            presentAtNegDiagonal.add(negDiagonalIdx);
            board[row][col] = 'Q';
            backtrack(row + 1, n, res, board, presentInCol, presentAtPosDiagonal, presentAtNegDiagonal);
            presentInCol.remove(col);
            presentAtPosDiagonal.remove(posDiagonalIdx);
            presentAtNegDiagonal.remove(negDiagonalIdx);
            board[row][col] = '.';
        }
    }

    public static List<String> generateBoard(char[][] board) {
        List<String> correctBoard = new ArrayList<>();
        for (char[] row : board) {
            correctBoard.add(new String(row));
        }
        return correctBoard;
    }

    public static void main(String[] args) {
        List<List<String>> solutions = placeQueens(4);
        for (List<String> sol : solutions) {
            for (String row : sol) {
                System.out.println(row);
            }
            System.out.println("----");
        }
    }
}
