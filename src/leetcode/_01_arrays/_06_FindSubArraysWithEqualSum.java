package leetcode._01_arrays;

import java.util.HashMap;

public class _06_FindSubArraysWithEqualSum {
    // TODO - Given an integer array, determine if there exists 2 sub-arrays of length 2 with equal sum
    // ex. {4,2,3,4,4,1} So 2 sub-arrays {4,2} & {2,4} both have sum equal to 6
    // return true if exists else false
    public static boolean SubArraysWithEqualSum(int[] arr){
        // ? Create a hashmap which stores the sum and then for each i and i+1 combo check if sum already exists in the hashmap
        // ? If it does exist then return true
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < arr.length-1; i++) {
            int sum = arr[i] + arr[i+1];
            if (numsMap.containsKey(sum)){
                return true;
            }
            else {
                numsMap.put(sum, i);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(SubArraysWithEqualSum(new int[] {4,2,4}));
    }
}
