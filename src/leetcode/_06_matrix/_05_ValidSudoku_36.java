package leetcode._06_matrix;

import java.util.HashSet;
import java.util.Set;

public class _05_ValidSudoku_36 {
    // TODO - Given a sudoku board we have to check these conditions and declare whether its valid or not
    //  1. Each row must contain the digits 1-9 without repetition.
    //  2. Each column must contain the digits 1-9 without repetition.
    //  3. Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

    // ? Approach - Lets try to code up for each condition

    public static boolean isValidSudoku(char[][] board) {
        // * Traversing the rows to check 1st condition
        for (char[] row : board) {
            HashSet<Character> rowSet = new HashSet<>();
            for (char i : row) {
                if (i != '.') {
                    if (rowSet.contains(i)) {
                        return false;
                    } else {
                        rowSet.add(i);
                    }
                }
            }
        }
        // * Traversing the cols to check 2nd condition
        for (int col = 0; col < 9; col++) {
            HashSet<Character> columnSet = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                char curr = board[row][col];
                if (curr != '.') {
                    if (columnSet.contains(curr)) {
                        return false;
                    } else {
                        columnSet.add(curr);
                    }
                }

            }
        }
        // * Traversing the 3 x 3 matrix to check 3rd condition
        // rowStart values are - 0, 3, 6
        for (int rowStart = 0; rowStart < 9; rowStart += 3) {
            // colStart values are - 0, 3, 6
            for (int colStart = 0; colStart < 9; colStart += 3) {
                HashSet<Character> matrixSet = new HashSet<>();
                // Entered the 3 x 3 matrix
                for (int i = 0; i < 3; i++) {
                    // i -> 0, 1, 2 (row of current 3 x 3 matrix)
                    for (int j = 0; j < 3; j++) {
                        // j -> 0, 1, 2 (col of current 3 x 3 matrix)
                        int currRowIdx = rowStart + i;
                        int currColIdx = colStart + j;
                        char curr = board[currRowIdx][currColIdx];
                        if (curr != '.') {
                            if (matrixSet.contains(curr)) {
                                return false;
                            } else {
                                matrixSet.add(curr);
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean isValidSudokuOpt(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int row = 0; row < 9; ++row) {
            for (int col = 0; col < 9; ++col) {
                char number = board[row][col];
                // for every number add in which row, which col, which sub matrix it is present
                if (number != '.') {
                    if (!seen.add(number + " in row " + row) ||
                            !seen.add(number + " in column " + col) ||
                            !seen.add(number + " in block " + row / 3 + "-" + col / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
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
//        char[][] board = {
//                {'8','3','.','.','7','.','.','.','.'},
//                {'6','.','.','1','9','5','.','.','.'},
//                {'.','9','8','.','.','.','.','6','.'},
//                {'8','.','.','.','6','.','.','.','3'},
//                {'4','.','.','8','.','3','.','.','1'},
//                {'7','.','.','.','2','.','.','.','6'},
//                {'.','6','.','.','.','.','2','8','.'},
//                {'.','.','.','4','1','9','.','.','5'},
//                {'.','.','.','.','8','.','.','7','9'}
//        };
        System.out.println(isValidSudokuOpt(board));
        System.out.println(1 + '0');
    }
}

