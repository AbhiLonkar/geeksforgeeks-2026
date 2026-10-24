package leetcode._10_dynamic_programming;

import javax.swing.plaf.metal.MetalBorders;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _01_PascalTriangle_118 {
    // View the pascal's triangle here -> https://leetcode.com/problems/pascals-triangle/description/
    // 3 types of problems

    // ! 1. Given the row number and column number of pascal's triangle return the value present at that position
    // ? Approach - The formula to calculate the value at a given row and column is (row-1) C (col-1)
    // as n! / (r!) * (n-r)!

    public static long findValue(int row, int col) {
        long res = 1;
        // The trick to simplyfing the NCR formula
        for (int i = 0; i < col - 1; i++) {
            res = res * (row - 1 - i);
            res = res / (i + 1);
        }
        return res;
    }

    // ! 2. Given a row value return the complete row same as pascal triangle part 2

    // ! 3. Given a row value form a pascal's triangle upto that position

    // ? Approach - The state of the currRow in the pascal's triangle depends on the state of its upper row.
    // ? We need values from the upper row to form values for our current row
    // ? Also we see that for a given row, the length of row is same as the row number
    // ex. 3rd row has 3 entries and so on
    public static List<List<Integer>> generatePascalTriangle(int row) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));
        // Since we've added the first row we have to generate only row - 1 number of slabs now
        for (int i = 0; i < row - 1; i++) {
            List<Integer> upperRow = res.get(res.size() - 1);
            // A temp array to store upper row elements and adding 0 at the corner
            List<Integer> temp = new ArrayList<>();
            temp.add(0);
            temp.addAll(upperRow);
            temp.add(0);
            // Storing the current pascal triangle row
            List<Integer> currRow = new ArrayList<>();
            // The currRow will have the same size as temp
            // We start filling up, by fetching the adjacent values in the top row and adding them together
            for (int j = 1; j < temp.size(); j++) {
                currRow.add(temp.get(j - 1) + temp.get(j));
            }
            // Add the currRow to the result
            res.add(currRow);
        }
        return res;
    }

    public static List<List<Integer>> generatePascalTriangleWithoutTemp(int numRows) {
        int row = 1;
        List<List<Integer>> res = new ArrayList<>();
        res.add(List.of(1));
        while (row < numRows) {
            List<Integer> topRow = res.get(res.size() - 1);
            List<Integer> currRow = new ArrayList<>();
            for (int i = 0; i <= row; i++) {
                int leftElement = i > 0 ? topRow.get(i - 1) : 0;
                int rightElement = i < row ? topRow.get(i) : 0;
                currRow.add(leftElement + rightElement);
            }
            res.add(currRow);
            row++;
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(findValue(5, 3));
        System.out.println(generatePascalTriangleWithoutTemp(5));
    }
}
