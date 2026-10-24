package leetcode._01_arrays;

import java.util.Arrays;
import java.util.HashMap;

public class _46_DivideArrayEqualParts_2206 {
    // TODO - Given an array of size n we have to check whether its posible to put its elements in pairs
    //  a pair contains 2 elements and they're equal

    // ? Approach - Put all the elements and their counts in a hashmap
    // ? Iterate through the hashmap, if we encounter an entry that has odd count we return false else we return true
    public static boolean divideArrayEqualParts(int[] arr) {
        HashMap<Integer, Integer> countsMap = new HashMap<>();
        for (int i: arr){
            countsMap.put(i, countsMap.getOrDefault(i, 0)+1);
        }
        for (Integer value: countsMap.values()){
            if (value%2!=0){
                return false;
            }
        }
        return true;
    }

    // ? Approach 2 - Sort the array and just compare the adjacent elements, if they aren't equal return false
    public static boolean divideArrayEqualPartsOptimized(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i<n; i+=2){
            if (arr[i] != arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(divideArrayEqualPartsOptimized(new int[] {1,1,1,2}));
    }
}
