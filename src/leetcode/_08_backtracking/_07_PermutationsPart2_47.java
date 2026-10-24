package leetcode._08_backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _07_PermutationsPart2_47 {
    // TODO - Given a list of integers that may contain duplicates we have to return the permutations of said list
    // ex. [1,1,2] -> [1,1,2], [1,2,1], [2,1,1]

    // ? Approach - We'll create a hashmap to store the numbers and their respective counts to handle the problem of duplicate numbers
    public static void permute(int[] arr) {
        int n = arr.length;
        List<List<Integer>> res = new ArrayList<>();
        HashMap<Integer, Integer> countsMap = new HashMap<>();
        for (int i : arr) {
            countsMap.put(i, countsMap.getOrDefault(i, 0) + 1);
        }
        generatePermutations(countsMap, res, new ArrayList<>(), n);
        System.out.println(res);
    }

    public static void generatePermutations(HashMap<Integer, Integer> countsMap, List<List<Integer>> res, List<Integer> currPerm, int n) {
        // * If current permutation is complete, add a copy to the result
        if (currPerm.size() == n) {
            res.add(new ArrayList<>(currPerm));
            return;
        }
        // * Iterate over each unique number in the map
        for (int i : countsMap.keySet()) {
            // * Only use the number if it still has remaining count
            if (countsMap.get(i) > 0) {

                // * Choose the number: decrease its count and add it to current permutation
                countsMap.put(i, countsMap.get(i) - 1);
                currPerm.add(i);

                // * Recurse to build the next part of the permutation
                generatePermutations(countsMap, res, currPerm, n);

                // * Backtrack: remove the last added number and restore its count
                currPerm.remove(currPerm.size() - 1);
                countsMap.put(i, countsMap.get(i) + 1);
            }
        }
    }

    public static void main(String[] args) {
        permute(new int[]{1, 1, 2});
    }
}
