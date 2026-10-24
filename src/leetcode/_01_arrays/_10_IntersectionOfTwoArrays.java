package leetcode._01_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class _10_IntersectionOfTwoArrays {
    // TODO - Given 2 integer arrays we have to return result array which contains elements that are present in both the arrays
    // ex. {1,2,3,4} & {1,3,4} o/p = {1,3,4};

    // ? Using hashset
    public static int[] intersectionArray(int[] arr1, int[] arr2) {
        HashSet<Integer> hs1 = new HashSet<>();
        for (int i : arr1) {
            hs1.add(i);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for (int i : arr2) {
            if (hs1.contains(i)) {
                resultSet.add(i);
            }
        }
        int[] res = new int[resultSet.size()];
        int j = 0;
        for (int i : resultSet) {
            res[j] = i;
            j++;
        }
        return res;
    }

    // ? Using binary search and hashset
    public static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    public static int[] intersectionArrayOptimized(int[] arr1, int[] arr2) {
        Arrays.sort(arr2);
        HashSet<Integer> hs1 = new HashSet<>();
        for (int i : arr1) {
            hs1.add(i);
        }
        HashSet<Integer> resultSet = new HashSet<>();
        for (int i : hs1) {
            if (binarySearch(arr2, i)) {
                resultSet.add(i);
            }
        }
        int[] res = new int[resultSet.size()];
        int j = 0;
        for (int i : resultSet) {
            res[j] = i;
            j++;
        }
        return res;
    }


    public static void main(String[] args) {
        int[] res = intersectionArrayOptimized(new int[]{1, 2}, new int[]{1, 1});
        for (int i : res) {
            System.out.println(i);
        }
    }
}
