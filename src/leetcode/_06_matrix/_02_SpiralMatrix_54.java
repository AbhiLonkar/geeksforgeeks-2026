package leetcode._06_matrix;

import java.util.ArrayList;
import java.util.List;

public class _02_SpiralMatrix_54 {
    // TODO - Given an integer matrix of size m * n, we have to add its elements to the result array in such a way that it mimics a spiral
    // [ [ 1  2  3 ]
    //   [ 4  5  6 ]
    //   [ 7  8  9 ] ]

    // o/p -> [1,2,3,6,9,8,7,4,5]

    // ? Approach - We'll keep 4 pointers left, right & top and bottom
    // ? The left and right will represent the columns and top and bottom will represent the rows
    // ? Initially both right and bottom will point 1 unit outside the length


    // * Step 1 - Iterate from left to right for the same top and we'll move the top pointer downward
    // * Step 2 - Iterate from top to bottom for the same right - 1 and we'll move right pointer backward
    // * Step 3 - Iterate from right to left for the same bottom - 1 and we'll move bottom pointer upward
    // * Step 4 - Iterate from bottom bottom to top for the same left and we'll move left pointer forward

    public static List<Integer> spiral(int[][] matrix){
        int left = 0, right = matrix[0].length;
        int top = 0, bottom = matrix.length;
        List<Integer> res = new ArrayList<>();

        while (left < right && top < bottom){

            // * Step 1 - Left to right for same top
            for (int i = left; i<right; i++){
                res.add(matrix[top][i]);
            }
            // * Move top downward
            top += 1;

            // * Step 2 - Top to bottom for same right
            for (int i = top; i<bottom; i++){
                res.add(matrix[i][right-1]);
            }
            // * Move right backward
            right -= 1;

            if (!(left < right && top < bottom)){
                break;
            }

            // * Step 3 - Right to left for same bottom
            for (int i = right - 1; i>=left; i--){
                res.add(matrix[bottom-1][i]);
            }
            // * Move bottom upwards
            bottom -= 1;

            // * Step 4 - Bottom to top for same left
            for (int i = bottom - 1; i>=top; i--){
                res.add(matrix[i][left]);
            }
            // * Move left forward
            left += 1;
        }
        return res;

    }

    public static void main(String[] args) {
        System.out.println(spiral(new int[][] {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}}));
    }
}
