package leetcode._01_arrays;

import java.util.*;

public class _53_ThreeSumClosest_16 {
    // TODO - Given an integer array we have to find a triplet sum that is closest to the target sum
    // TODO - If the sum is equal to target we need to return it
    // ex. {-1,2,1,-4} target=1 then -1+2+1 = 2 which is closest to target 1

    // ? Approach 1 - Triple for loop form a tripet for every starting with i then j and k
    // ? Find the absolute difference between target and this triplet sum, and check if its closer than the result
    // ? If it is then update the result
    // * O(n^3) Solution and no extra space
    public static int threeSumClosest(int[] arr, int target) {
        int closestSum = arr[0] + arr[1] + arr[2];
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int currTripletSum = arr[i] + arr[j] + arr[k];
                    if (currTripletSum == target) {
                        return currTripletSum;
                    }
                    if (Math.abs(currTripletSum - target) < Math.abs(closestSum - target)) {
                        closestSum = currTripletSum;
                    }
                }
            }
        }
        return closestSum;
    }

    public static int threeSumClosestOptimized(int[] arr, int target) {
        Arrays.sort(arr);
        int closestSum = arr[0] + arr[1] + arr[2];
        for (int i = 0; i < arr.length - 2; i++) {
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int left = i + 1;
            int right = arr.length - 1;
            // Why not <=, because we don't to consider the same element at both left and right positions
            while (left < right){
                int currTripletSum = arr[i] + arr[left] + arr[right];
                if (currTripletSum == target) {
                    return currTripletSum;
                }
                if (Math.abs(currTripletSum - target) < Math.abs(closestSum - target)) {
                    closestSum = currTripletSum;
                }
                if (currTripletSum > target) {
                    right--;
                }
                else {
                    left++;
                }
            }
        }
        return closestSum;
    }

    public static void main(String[] args) {
        System.out.println(threeSumClosestOptimized(new int[]{4, 0, 5, -5, 3, 3, 0, -4, -5}, -2));
    }


}
