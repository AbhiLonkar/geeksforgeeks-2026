package leetcode._01_arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;

public class _44_FindDisappearedNumbers_448 {
    // TODO - Given an natural number array of size n, it's supposed to have numbers from 1 to n both inclusive, but some numbers are missing
    // TODO - We need to find these missing numbers
    // ex. [4,3,2,7,8,2,3,1] o/p -> [5,6]
    // ex. [1,1] o/p -> 2

    // ? Approach - We'll put all these numbers in a hashSet then we'll iterate from 1 to n in a finder fxn if we find a missing number we add it to the result Array list
    // * Subproblem 1 - Add all array elements to hashSet
    // * Subproblem 2 - Search the hashSet from 1 to n
    // * Subproblem 3 - Add missing elements from hs
    // * Time - O(n) Space - O(n)
    public static ArrayList<Integer> missingNum(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for (int j : arr) {
            hs.add(j);
        }
        for (int i = 1; i<arr.length+1; i++){
            if (!hs.contains(i)){
                res.add(i);
            }
        }
        return res;
    }

    // ? Approach 2 - Mark element at Abs(el) - 1 position as negative, if its already negative no need to change
    // * Time - O(1) Space - O(n)
    public static ArrayList<Integer> missingNumOpt(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();
        for (int i: arr){
            int idx = Math.abs(i) - 1;
            if (arr[idx]>0){
                arr[idx] = -arr[idx];
            }
        }
        for (int i = 0; i<arr.length; i++){
            if (arr[i]>0){
                res.add(i+1);
            }
        }
        return res;
    };


    public static void main(String[] args) {
        System.out.println(missingNum(new int[] {1,1}));
    }
}
