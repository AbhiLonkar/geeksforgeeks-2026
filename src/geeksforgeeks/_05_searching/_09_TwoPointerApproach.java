package geeksforgeeks._05_searching;

import java.util.HashMap;

public class _09_TwoPointerApproach {
    // TODO - Given a sorted integer array and a target print the pair who when added together equal target
    // ! Note - Array is sorted
    // ex. {10,20,30,40,50} target = 90, so 40 + 50 = 90, output is 40, 50

    // ? Approach 1 - Using double for loop, iterate from the first element check for every other element which when added together equal target
    // * Time complexity = O(n2) and Space complexity = O(1)
    public static void twoPointerApproach(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }
    }

    public static void twoPointerApproachHashMap(int[] arr, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (numsMap.containsKey(diff)) {
                System.out.println(arr[i] + ", " + diff);
            } else {
                numsMap.put(arr[i], i);
            }
        }
    }

    public static void twoPointerApproachOptimized(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                System.out.println(arr[start] + ", " + arr[end]);
                break;
            } else if (sum > target) {
                end = end - 1;
            } else {
                start = start + 1;
            }
        }
    }

    public static void main(String[] args) {
        twoPointerApproachOptimized(new int[]{10, 20, 30, 40, 50}, 90);
        twoPointerApproachOptimized(new int[]{2, 3, 8, 11}, 14);
    }
}
