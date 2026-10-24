package leetcode._04_binary_search;

public class _08_Search2dSortedMatrixPart2_240 {
    // TODO Given a matrix and a target element we have to return true if the target element is present in the matrix else false
    // Matrix properties - Integers in each row are sorted from left to right & integers for each column are sorted from top to bottom

    // ? Approach - Think of it this way, what are the best positions that can help us in taking advantages of the current matrix properties
    // [
    //   [1,2,3,10]
    //   [4,5,6,12]
    //   [7,8,9,14]
    // ]

    // Lets try at 0,0 can we decide whether to search in row or column? No we can't because if target is > mat[0][0] it can be present in either row or column
    // Lets try at bottom right corner, again no, because if target < mat[bottom][right] corner then the target can be present in either row or column
    // Lets try at middle, same problem if target>mat[mid][mid], target can be present either in bottom column or right row
    // * The best approach would be to check for top corner or bottom corner
    // Lets try for top corner
    // If mat[top][left] > target -> The target might be present in row but definitely not in the current column so we check in left column
    // If mat[top][left] < target -> The target might be present in column but definitely not in current row so we check in next row
    // ! Watch this vid if stuck - https://youtu.be/9ZbB397jU4k?si=1ilzEkOMkFnj5In8

    public static boolean matBinSearch(int[][] matrix, int target) {
        int n = matrix.length;
        int row = 0;
        int col = matrix[row].length - 1;
        while (row < n && col >= 0) {
            int suspect = matrix[row][col];
            if (suspect == target) {
                return true;
            } else if (suspect > target) {
                col--;
            } else {
                row++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(matBinSearch(new int[][]{{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}}, 20));
    }

}
