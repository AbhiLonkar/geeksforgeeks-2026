package leetcode._01_arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _45_FindMissingAndRepeatedValues_2965 {
    // TODO Given a matrix of size n^2, we have to find the missing number and the repeating number of this matrix's integer array's
    //  The arrays of this matrix will have values from 1 to n2 where n is the matrix size
    // ex. Matrix = [[1,2],[3,3]] So this is a 2x2 matric so the arrays can have elements [1,2,3,4]
    // We notice that the first array doesn't have repeating elements also both the numbers are in the range 1-4 so we check next array
    // Over here we notice that 3 is repeating and 4 is absent so we return them

    // ? Let's try to flatten this grid
    // ? Using a hashmap
    public static void findMissingAndRepeatingValues(int[][] matrix){
        int[] res = new int[2];
        HashMap<Integer, Integer> countsMap = new HashMap<>();
        int n = matrix.length * matrix.length;
        ArrayList<Integer> allElements = new ArrayList<>();
//        brute approach
//        for (int[] a: matrix){
//            for (int j : a) {
//                allElements.add(j);
//            }
//        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        for (int i = 0; i<rows*columns; i++){
            int currRow = i / columns; // Denotes the current row of the matrix we're on
            int currCol = i % columns; // Denotes a particular column within that row
            allElements.add(matrix[currRow][currCol]);
        }
        System.out.println(allElements);
        for (Integer el : allElements) {
            countsMap.put(el, countsMap.getOrDefault(el, 0) + 1);
            if (countsMap.get(el) > 1) {
                res[0] = el;
            }
        }
        for (int i = 1; i<=n; i++){
            if (!countsMap.containsKey(i)){
                res[1] = i;
                break;
            }
        }
    }

    // Still taking more time
    public static int[] findMissingValOptimized(int[][] matrix){
        int[] res = new int[2];
        int rows = matrix.length;
        int columns = matrix[0].length;
        int n = rows*columns;
        int[] allElements = new int[n];
        for (int i = 0; i<rows*columns; i++){
            int currRow = i / columns;
            int currCol = i % columns;
            allElements[i] = matrix[currRow][currCol];
        }
        Arrays.sort(allElements); // Converts to nlogn runtime
        int totalSum = n * (n+1)/2;
        int rollingSum = 0;
        for (int i = 0; i<allElements.length-1; i++){
            if (allElements[i] == allElements[i+1]){
                res[0] = allElements[i];
            }
        }
        for (int i: allElements){
            rollingSum+=i;
        }
        res[1] = totalSum - rollingSum + res[0];
        return res;
    }

    // Leetcode approach - Just store the counts of matrix elements then run a loop to check at which i(1 to n+1) are the conditions met
    public static int[] findMissingVal(int[][] matrix){
        int[] res = new int[2];
        int n = matrix.length;
        int[] countsArray = new int[n*n+1];
        int cols = matrix[0].length;
        for (int i = 0; i<(n*n); i++){
            int row = i / cols;
            int col = i % cols;
            countsArray[matrix[row][col]]++;
        }
        for (int currNum = 1; currNum < countsArray.length; currNum++){
            if (countsArray[currNum] == 2){
                res[0] = currNum;
            }
            else if (countsArray[currNum] == 0){
                res[1] = currNum;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = findMissingVal(new int[][] {{1,3}, {2,2}});
        for (int i: res){
            System.out.println(i);
        }
    }

}
