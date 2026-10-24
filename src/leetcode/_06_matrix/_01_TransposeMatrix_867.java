package leetcode._06_matrix;

import java.util.Arrays;

public class _01_TransposeMatrix_867 {
    // TODO - Given a m x n matrix we have to return its transposed matrix
    // Transpose means switching the rows with the columns
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // if input matrix is 2 rows and 3 cols the transposed matrix will be 3 rows and 2 cols
        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(transpose(new int[][]{{1, 2, 3}, {4, 5, 6}})));
    }
}
