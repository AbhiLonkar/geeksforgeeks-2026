package leetcode._01_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class _39_IntersectionTwoArraysII_350 {
    // TODO Given 2 unsorted integer array, we have to return an array which consists of all the elements in arr1 and arr2
    // ! Each element in the result must appear as many times as it shows in both arrays

    // * Extra questions - What if the given array is already sorted? How would you optimize your algorithm?
    // * What if nums1's size is small compared to nums2's size? Which algorithm is better?
    // * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

    // ? Let's try to solve it without sorting array
    // ? Used a hashmap to store the count of elements from arr1, decremented the count when encountered that element in arr2
    // ? And add it to the result array. If the count becomes 0 for a given element then we remove it from the hashmap
    public static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> countsMap = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : arr1) {
            countsMap.put(i, countsMap.getOrDefault(i, 0) + 1);
        }
        for (int i : arr2) {
            if (countsMap.containsKey(i)) {
                result.add(i);
                countsMap.put(i, countsMap.get(i) - 1);
                if (countsMap.get(i) == 0) {
                    countsMap.remove(i);
                }
            }
        }
        return result;
    }

    public static ArrayList<Integer> intersectionTwoPointers(int[] arr1, int[] arr2) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int l = 0, r = 0;
        while (l < arr1.length && r < arr2.length) {
            if (arr1[l] == arr2[r]) {
                result.add(arr1[l]);
                l++;
                r++;
            } else if (arr1[l] > arr2[r]) {
                r++;
            } else if (arr1[l] < arr2[r]) {
                l++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(intersectionTwoPointers(new int[]{1,2,2,1}, new int[]{2,2}));
    }
}
