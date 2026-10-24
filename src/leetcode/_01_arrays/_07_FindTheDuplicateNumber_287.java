package leetcode._01_arrays;

import java.util.HashMap;

// ! I'll come back soon
public class _07_FindTheDuplicateNumber_287 {
    // TODO - Given an unsorted integer array return the element which appears more than 1 time
    // All other elements occur only once

    // ? Approach - Double For loop, set a count for each i if count>1 break the loop and return
    // * Time complexity is O(n2)
    public static int findDuplicateNumber(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    // ? Let's try a hashmap
    // * Space complexity is O(n)
    public static int findDuplicateNumberHash(int[] arr) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (numsMap.containsKey(arr[i])) {
                return arr[i];
            } else {
                numsMap.put(arr[i], i);
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        System.out.println(findDuplicateNumber(new int[]{1, 3, 4, 4, 4, 2}));
        System.out.println(findDuplicateNumberHash(new int[]{1, 3, 4, 4, 4, 2}));
    }

}
