package leetcode._06_matrix;

import java.util.*;

public class _06_SudokuSolver_37 {
    // TODO - Given an unsolved matrix representing a sudoku board we have to solve this sudoku
    //  The rules are -
    //  1. Each of the digits 1-9 must occur exactly once in each row.
    //  2. Each of the digits 1-9 must occur exactly once in each column.
    //  3. Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.

    public static char[][] sudokuSolver(char[][] board) {
        HashSet<String> presentInCol = new HashSet<>();
        HashSet<String> presentInRow = new HashSet<>();
        HashSet<String> presentInSubMatrix = new HashSet<>();
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char ch = board[row][col];
                if (ch != '.') {
                    String colKey = ch + " in col " + col;
                    String rowKey = ch + " in row " + row;
                    String boxKey = ch + " in box " + (row / 3) + "-" + (col / 3);
                    presentInCol.add(colKey);
                    presentInRow.add(rowKey);
                    presentInSubMatrix.add(boxKey);
                }
            }
        }
        backtrack(0, 0, board, presentInCol, presentInRow, presentInSubMatrix);
        return board;
    }

    public static boolean backtrack(int row, int col, char[][] board, HashSet<String> presentInCol, HashSet<String> presentInRow, HashSet<String> presentInSubMatrix) {
        // means board is completely solved
        if (row == 9) {
            return true;
        }
        // If all columns for a particular row solved then move on to the next row
        if (col == 9) {
            return backtrack(row + 1, 0, board, presentInCol, presentInRow, presentInSubMatrix);
        }
        // We only need to fill cols having '.', meaning empty cells
        // If we encounter a number cell move on to the next cell
        if (board[row][col] != '.') {
            return backtrack(row, col + 1, board, presentInCol, presentInRow, presentInSubMatrix);
        }
        for (char possibleNum = '1'; possibleNum <= '9'; possibleNum++) {
            String colKey = possibleNum + " in col " + col;
            String rowKey = possibleNum + " in row " + row;
            String boxKey = possibleNum + " in box " + (row / 3) + "-" + (col / 3);
            if (presentInCol.contains(colKey) || presentInRow.contains(rowKey) || presentInSubMatrix.contains(boxKey)) {
                continue;
            }
            presentInCol.add(colKey);
            presentInRow.add(rowKey);
            presentInSubMatrix.add(boxKey);
            board[row][col] = possibleNum;

            if (backtrack(row, col + 1, board, presentInCol, presentInRow, presentInSubMatrix)) {
                return true;
            }

            presentInCol.remove(colKey);
            presentInRow.remove(rowKey);
            presentInSubMatrix.remove(boxKey);
            board[row][col] = '.';

        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        char[][] solvedBoard = sudokuSolver(board);
        for (char[] row : solvedBoard) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
