package leetcode._01_arrays;

import java.util.*;

public class _05_FindDifferenceOfTwoArrays_2215 {
    // TODO - Given 2 arrays, we have return a list whose first entry is list of elements from arr1 which aren't present in arr2
    // TODO - and second entry is list of elements from arr2 which aren't present in arr1.

    // ? Approach 1 - Create a hashset which stores all the unique elements from the respective arrays.
    // ? Then check if the element is present in the second array or not, if it isn't then add it to the arrayList
    public static void findDifference(int[] arr1, int[] arr2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>(2);
        for (int i : arr1) {
            hs1.add(i);
        }
        for (int j : arr2) {
            hs2.add(j);
        }
        HashSet<Integer> d1 = new HashSet<>(hs1);
        d1.removeAll(hs2); // Remove all set2 elements from d1.
        HashSet<Integer> d2 = new HashSet<>(hs2);
        d2.removeAll(hs1); // Remove all set1 elements from d2.
        result.add(new ArrayList<>(d1));
        result.add(new ArrayList<>(d2));
        System.out.println(result);

    }


    public static void main(String[] args) {
        findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6});
    }

}
