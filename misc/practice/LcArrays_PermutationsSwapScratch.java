import java.util.ArrayList;
import java.util.List;

public class LcArrays_PermutationsSwapScratch {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); // To store all permutations
        generatePermutations(0, nums, result); // Start recursive function
        return result;
    }

    private static void generatePermutations(int startIndex, int[] nums, List<List<Integer>> result) {
        // Base case: If startIndex reaches the length of the array, we have a complete permutation
        if (startIndex == nums.length) {
            List<Integer> currentPermutation = new ArrayList<>();
            for (int num : nums) {
                currentPermutation.add(num);
            }
            result.add(new ArrayList<>(currentPermutation)); // Add current permutation to the result
            return;
        }

        // Recursive case: Explore all permutations
        for (int i = startIndex; i < nums.length; i++) {
            swapElements(nums, i, startIndex); // Place nums[i] at the startIndex
            generatePermutations(startIndex + 1, nums, result); // Recurse for the next index, we do this step so that we can add an element at the next position
            swapElements(nums, i, startIndex); // Backtrack to undo the swap and retain the original array, because we're calling our recursive function without any temporary array
        }
    }

    private static void swapElements(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}