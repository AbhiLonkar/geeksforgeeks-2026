package leetcode._01_arrays;

import java.util.HashMap;

public class _03_ContainsDuplicateII_219 {
    // TODO Given an integer array, return true if there exits two indices (i, j) where arr[i] = arr[j] and abs(i-j) <= k
    // ex. [1,2,3,1], k = 3 so i = 0, j = 3 arr[0] = arr[3] & abs(0-3) = 3 <= 3

    // ? Use a double for loop starting with ith element and check the given conditions for next elements
    public static boolean ContainsDuplicateII(int[] arr, int k) {
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && Math.abs(i - j) <= k) {
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    // ? Using hashmap, first we add the element to the hashmap, the key is the element and the value is the index.
    // ? If we encounter an element equal to the element already present in the map, we check if the difference criteria is met.
    // ? If it meets then we return true else if the difference is larger than k we set the index in the hashmap to the current index i
    // ? Repeat the process till array end.
    public static boolean ContainsDuplicateIIHashMap(int[] arr, int k) {
        HashMap<Integer, Integer> nums = new HashMap<>();
        boolean flag = false;
        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // if the current element already exists in the map
            if (nums.containsKey(arr[i])) {
                // check if difference condition is met for the value of i
                if (Math.abs(nums.get(arr[i]) - i) <= k) {
                    flag = true;
                    break;
                }
                // if the difference condition isn't met then update the value of current element
                else if (Math.abs(nums.get(arr[i]) - i) > k) {
                    nums.put(arr[i], i);
                }
            }
            // if element doesn't exist in the map add it
            else {
                nums.put(arr[i], i);
            }
        }
        return flag;
    }

    // ? What's the significance of k here? k-1 can be thought of as the number of elements between i & j
    // ex - [1,2,3,1], k = 2, over here when the first condition of equality is met for i = 0 and j = 3 we can see that there's k-1
    // ie 3-1 = 2 elements between i & j
    // ex. [1,0,1,1], k = 1, again here i = 2, j = 3, k - 1 = 1-1 = 0. So 0 elements between i & j
    // So could this mean that the size of the subarray should be equal to k + 1?
    // ! To write below
    public static void ContainsDuplicateIISW(int[] arr, int k) {
        // ex - [1,2,2,1,3,1] k = 2

    }

    public static void main(String[] args) {
        System.out.println(ContainsDuplicateIIHashMap(new int[]{1, 2, 3, 1}, 3));
    }
}
