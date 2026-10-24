package leetcode._08_backtracking;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_CombinationSumPart2_40 {
    // TODO - Given an integer array and a target we have to return the combinations of array elements that add upto the target
    // ! Each number in candidates may only be used once in the combination. Meaning we don't get to use the same number more than once if it isn't already present
    // ! Contrainst
    //  1 <= candidates.length <= 100
    //  1 <= candidates[i] <= 50
    //  1 <= target <= 30

    // ex. candidates = [10,1,2,7,6,1,5], target = 8
    // o/p -> [1,2,5], [1,6,1], [2,6], [1,7]

    // ex. candidates = [2,5,2,1,2], target = 5
    // o/p -> [5], [2,2,1]

    public static List<List<Integer>> combinationSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        generateCombinations(res, arr, new ArrayList<>(), 0, target);
        return res;
    }

    public static void generateCombinations(List<List<Integer>> res, int[] arr, List<Integer> currComb, int start, int target) {
        if (target == 0) {
            res.add(new ArrayList<>(currComb));
            return;
        }
        if (target < 0 || start == arr.length) {
            return;
        }
        for (int i = start; i < arr.length; i++) {
            // Means we're at the first iteration and the later part is to skip using the same number to generate said combinations
            // ex. [1,1,1,1,2] t = 5 -> [1,1,1,2] generated from index 0 == [1,1,1,2] generated from index 1
            if (i == start || arr[i] != arr[i - 1]) {
                currComb.add(arr[i]);
                generateCombinations(res, arr, currComb, i + 1, target - arr[i]);
                currComb.remove(currComb.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
    }

}
