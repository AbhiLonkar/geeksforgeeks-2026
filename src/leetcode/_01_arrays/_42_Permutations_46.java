package leetcode._01_arrays;

import java.util.*;

public class _42_Permutations_46 {

    public static List<List<Integer>> resultList = new ArrayList<>();
    public static List<Integer> currPermutationList = new ArrayList<>();
    public static boolean[] visited;
    public static int[] elements;

    public static List<List<Integer>> generatePermute(int[] nums) {
        elements = nums;
        visited = new boolean[nums.length];
        backtrack(0);
        return resultList;
    }

    public static void backtrack(int idx) {
        if (idx == elements.length) {
            resultList.add(new ArrayList<>(currPermutationList));
            return;
        }
        for (int i = 0; i < elements.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                currPermutationList.add(elements[i]);
                backtrack(idx + 1);
                currPermutationList.remove(currPermutationList.size() - 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(generatePermute(new int[]{1, 2}));
    }
}
