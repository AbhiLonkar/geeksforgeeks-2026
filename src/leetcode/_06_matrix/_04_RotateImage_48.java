package leetcode._06_matrix;

import java.util.Arrays;

public class _04_RotateImage_48 {
    // TODO We are given an m x n matrix we have to rotate the same matrix by 90 degrees
    //  ex  [[1 2 3]
    //       [4,5,6]
    //       [7,8,9]]
    //  ans  [[7 4 1]
    //        [8 5 2]
    //        [9 6 3]]

    // ? Approach - Find the transpose of the said matrix and then mirror it on the y axis
    public static int[][] rotateImage(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // When doing swapping inplace we'll only go above the diagonal of the matrix
        for (int i = 0; i<rows; i++){
            // i -> 0, j -> 1,2 (first row)
            // i -> 1, j -> 2 (second row)
            // i -> 2, j -> No loop entry (there's no elements above diagonal for 3rd row)
            for (int j = i+1; j<cols; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int rowIdx = 0; rowIdx < rows; rowIdx++){
            int left = 0, right = cols-1;
            while (left < right){
                int temp = matrix[rowIdx][left];
                matrix[rowIdx][left] = matrix[rowIdx][right];
                matrix[rowIdx][right] = temp;
                left++;
                right--;
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rotateImage(new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}})));;
    }
}
