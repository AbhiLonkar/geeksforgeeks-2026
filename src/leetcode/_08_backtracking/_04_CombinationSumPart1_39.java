package leetcode._08_backtracking;

import java.util.ArrayList;
import java.util.List;

public class _04_CombinationSumPart1_39 {
    // TODO - Given a distinct integer array and target, we have to return a list of elements who when added together equal target
    // ! Note the element can be used any number of times

    // ex. [2,3,6,7] target = 7 -> [2,2,3] [7]
    // ex. [2,3,5] target = 8 -> [3,5] [2,3,3], [2,2,2,2]

    // ? Approach - We'll iterate through the array, since we're allowed to use same element more than once we'll set up a condition where we reuse that element and a second case where we don't use it
    // ? For every element chosen we'll subtract it from the target
    // ? Base case - if target becomes 0 means we've found the element combinations and we add it to the result and return
    // ? if target becomes negative we return
    // ? When we come back from the recursive call, we remove the element that was added and keep adding the next elements

    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        generateCombinations(res, arr, 0, target, new ArrayList<>());
        return res;
    }

    public static void generateCombinations(List<List<Integer>> res, int[] arr, int start, int target, List<Integer> currCombinations) {
        int n = arr.length;
        if (start >= n || target == 0) {
            res.add(new ArrayList<>(currCombinations));
            return;
        } else if (target < 0) {
            return;
        }
        for (int i = start; i<n; i++){
            currCombinations.add(arr[i]);
            generateCombinations(res, arr, i, target-arr[i], currCombinations);
            currCombinations.remove(currCombinations.size()-1);
        }
//        currCombinations.add(arr[i]);
//        generateCombinations(res, arr, i, target - arr[i], currCombinations);
//        currCombinations.remove(currCombinations.size() - 1);
//        generateCombinations(res, arr, i + 1, target, currCombinations);

    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

}
