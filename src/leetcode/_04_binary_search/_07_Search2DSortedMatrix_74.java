package leetcode._04_binary_search;

import java.awt.print.PrinterGraphics;
import java.util.ArrayList;
import java.util.List;

public class _07_Search2DSortedMatrix_74 {
    // TODO - Given a 2d matrix and target, each array in this matrix is sorted in a non decreasing order
    //  We have to determine whether the target is present in the matrix or not
    // ex. matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3 o/p -> true
    // ex. matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13 o/p -> false

    // ! The first element of each array of this matrix is greater than the last element of the previous array

    // ? Approach 1 - Would be to flatten the 2d matrix and do binary search in it
    // * Time - Flattening O(n2) and Searching O(logN)
    public static boolean binarySearch(int[][] arr, int target) {
        List<Integer> flattenedArr = new ArrayList<>();
        for (int[] i : arr) {
            for (int k : i) {
                flattenedArr.add(k);
            }
        }
        int start = 0;
        int end = flattenedArr.size();
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (flattenedArr.get(mid) == target) {
                return true;
            } else if (flattenedArr.get(mid) > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    // ? Approach 2 - How can we use the hint about first element being greater than last element of the previous array
    // Compare the target with the last and first element of each array?
    public static boolean binSearch(int[][] arr, int target) {
        for (int[] eachArr : arr) {
            int currLen = eachArr.length;
            if (eachArr[0] <= target && target <= eachArr[currLen - 1]) {
                int start = 0;
                int end = eachArr.length - 1;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (eachArr[mid] == target) {
                        return true;
                    } else if (eachArr[mid] > target) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        }
        return false;
    }

    public static boolean bin(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static boolean binSearchOpt(int[][] arr, int target) {
        if (arr.length == 0 || arr[0].length == 0) {
            return false;
        }
        int totalRows = arr.length;
        int totalCols = arr[0].length;

        int start = 0;
        int end = totalRows * totalCols - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int currRowIdx = mid / totalCols;
            int colOfCurrRowIdx = mid % totalCols;
            int suspect = arr[currRowIdx][colOfCurrRowIdx];
            if (suspect == target) {
                return true;
            } else if (suspect > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        System.out.println(binSearchOpt(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23,30,34,60}}, 3));
        System.out.println(binSearchOpt(new int[][]{{1}, {3}, {5}}, 5));
        System.out.println(binSearch(new int[][]{{1}}, 1));
    }

}
