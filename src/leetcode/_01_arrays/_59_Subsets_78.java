package leetcode._01_arrays;

import java.util.ArrayList;
import java.util.List;

public class _59_Subsets_78 {
    // TODO - Given an integer array we have to return a list of all the subsets of its elements
    // ex. [1,2,3] -> [1], [1,2], [1,2,3], [1,2], [1,3], [2], [2,3], [3]

    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        generateSubsets(res, arr, new ArrayList<>(), 0);
        return res;
    }

    public static void generateSubsets(List<List<Integer>> res, int[] arr, List<Integer> currSubset, int start) {
        int n = arr.length;
        if (start == n) {
            res.add(new ArrayList<>(currSubset));
            return;
        }
        // Add currElement
        currSubset.add(arr[start]);
        // Proceed to add next element
        generateSubsets(res, arr, currSubset, start + 1);
        // Remove the num added from the above step
        currSubset.remove(currSubset.size() - 1);
        generateSubsets(res, arr, currSubset, start + 1);
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = subsets(new int[]{1, 2, 3});
        System.out.println(ans);

    }
}
