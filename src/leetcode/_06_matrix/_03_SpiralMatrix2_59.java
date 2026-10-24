package leetcode._06_matrix;

public class _03_SpiralMatrix2_59 {
    // TODO Given an integer n, we have to fill a matrix in spiral order with elements from 1 to n2

    public static int[][] spiralMatrix(int n) {
        int[][] res = new int[n][n];
        int val = 1;
        int left = 0, right = n - 1;
        int top = 0, bottom = n - 1;
        while (left <= right && top <= bottom){
            // * fill from left to right for same top (same row diff cols)
            for (int col = left; col <= right; col++){
                res[left][col] = val;
                val++;
            }
            top+=1;
            // * fill from top to bottom for same right
            for (int row = top; row <= bottom; row++){
                res[row][right] = val;
                val++;
            }
            right-=1;
            // * fill from right to left for same bottom
            for (int col = right; col >= left; col--){
                res[bottom][col] = val;
                val++;
            }
            bottom-=1;
            // fill from bottom to top for same left
            for (int row = bottom; row >= top; row--){
                res[row][left] = val;
                val++;
            }
            left+=1;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
