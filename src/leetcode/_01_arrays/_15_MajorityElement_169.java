package leetcode._01_arrays;

import java.util.Arrays;
import java.util.HashMap;

public class _15_MajorityElement_169 {
    // TODO - Given an integer array find the element which occurs the most time.
    // ex. [1,1,1,2,2,4,4,4,4] = 4

    // ? Idea - Use a hashmap to store the count of the elements, return the element with the highest count
    // * Time complexity is O(n) because we're traversing the array once, then again traversing the hashmap. So O(n) + O(n) = O(n)
    // * Space complexity is also O(n) because we're using extra space due to HashMap.
    public static int MajorityElement(int[] arr) {
        int n = arr.length / 2;
        HashMap<Integer, Integer> elementCount = new HashMap<Integer, Integer>();
        for (int i : arr) {
            if (elementCount.containsKey(i)) {
                // Increment the count
                elementCount.put(i, elementCount.get(i) + 1);
            } else {
                elementCount.put(i, 1);
            }
            if (elementCount.get(i) > n) {
                return i;
            }
        }
        return 0;

        // Find the key with the largest value in the map
        // Better implementation in the above section
//        int max = arr[0];
//        for (int i : elementCount.keySet()) {
//            if (elementCount.get(i) > elementCount.get(max)) {
//                max = i;
//            }
//        }
//        return max;
    }

    // * Let's try to improve the code in O(n) time and O(1) space
    // * Hint - The majority element is the one which occurs more than len/2 times, and there'll be always 1 such element

    // * Facing problem when encountered a new element set the resCount as the position of the next unique element
    // * For each unique element I also need to check whether the resCount exceeds len/2 if it does, simply return
    // * Not optimized as much because the sorting algo increases both the time & space complexity but helped improve my understanding
    // ! Sort time cmp = O(NLogN) and space = O(N)
    public static int MajorityElementOptimized(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        int halfLen = (int) Math.ceil((float) n / 2);
        int currEl = 0;
        int resCount = 1;
        for (int i = 1; i < n; i++) {
            // * Code for repeating element
            if (arr[currEl] == arr[i]) {
                resCount++;
                if (resCount >= halfLen) {
                    return arr[currEl];
                }
            } else {
                currEl = i;
                resCount = 1;
            }
        }
        return arr[currEl];
    }

    // * Optimized version Moore Voting algo.
    // * The basic idea behind this is that for every occurrence of non-majority element, there must be more occurence of majority element
    // * ex. 10 red balls and 5 blue balls, for every 1 blue ball there's 2 red balls and so on.

    // * Consider a game, a person walks in, his chances of winning increase, he walks in again, his chances increase, second person walks in
    // * the first person chances decrease, again second person walks in, first person's chances decrease
    // * the next person who walks in will have a chance of winning, we continue this until we reach the end of the array.
    public static int MajorityElementMV(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (int num : nums) {
            if (count == 0) {
                // When the count becomes zero, there's no occurence of the element, so new element takes control
                candidate = num;
                count++;
            } else {
                // If we have the same element increment the count
                if (num == candidate) {
                    count++;
                }
                // When found a new element decrement the current candidate's count
                else {
                    count--;
                }
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        System.out.println(MajorityElementMV(new int[]{1, 3, 4, 2, 4, 7}));
    }
}
