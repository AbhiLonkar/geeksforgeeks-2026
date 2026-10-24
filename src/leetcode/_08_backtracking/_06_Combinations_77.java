package leetcode._08_backtracking;

import java.util.ArrayList;
import java.util.List;

public class _06_Combinations_77 {
    // TODO - Given two numbers n & k n denotes range from [1,n] where both inclusive and k denotes the length of the combination
    // ex. n = 4 -> [1,2,3,4] k = 2
    // o/p -> [1,2], [1,3], [1,4], [2,3], [2,4], [3,4]

    // ex. n = 5 -> [1,2,3,4,5] k = 3
    // o/p -> [1,2,3], [1,2,4], [1,2,5], [1,3,4], [1,3,5], [1,4,5], [2,3,4], [2,3,5], [3,4,5]

    // ! Constraints - 1 <= n <= 20 & 1 <= k <= n
    public static List<List<Integer>> combinations(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        generateCombinations(res, n, k, new ArrayList<>(), 1);
        return res;
    }

    public static void generateCombinations(List<List<Integer>> res, int n, int k, List<Integer> currList, int currNum) {
        if (currList.size() == k) {
            res.add(new ArrayList<>(currList));
            return;
        }
        // We're using i to iterate through the numbers, ex. [1,2,3,4,5]
        for (int i = currNum; i<=n; i++){
            currList.add(i);
            // Add next number to the currList
            generateCombinations(res, n, k, currList, i+1);
            // remove the last number from the currList
            currList.remove(currList.size()-1);
        }
        // When i reaches end ie i becomes > n we start with a new value of i in the for loop


    }

    public static void main(String[] args) {
        System.out.println(combinations(4, 2));
    }
}
