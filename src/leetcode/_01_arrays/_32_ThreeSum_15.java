package leetcode._01_arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _32_ThreeSum_15 {
    // TODO - Given an integer array, return the triplets(x,y,z) in the form of an array which when added form 0.
    // ex. [-1,0,1,2,-1,-4] = [[-1,0,1], [-1,-1,2]]

    // ? Idea - Use a triple for loop
    // ! Duplicate triplets are being added
    public static List<List<Integer>> threeSumUsingFor(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        result.add(Arrays.asList(arr[i], arr[j], arr[k]));
                    }
                }
            }
        }
        return result;
    }

    // ? Idea - use a hashmap to add all the array elements into it
    // ? No duplicate entries will be present in the map with this approach then we can iterate through the map
    // ! Not possible to iterate through the map to find the triplet that meets the condition
    public static HashMap<Integer, Integer> generateCountMap(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i : arr) {
            if (countMap.containsKey(i)) {
                countMap.put(i, countMap.get(i) + 1);
            } else {
                countMap.put(i, 1);
            }
        }
        return countMap;
    }

    public static void threeSumHashMap(int[] arr) {
        HashMap<Integer, Integer> countsMap = generateCountMap(arr);

    }

    public static List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();

        // There must exist 2 more element after i to ensure we can form a triplet. That's why ending point is arr.length-2.
        for (int i = 0; i < arr.length - 2; i++) {
            // If we aren't at the starting point, and the current and the previous element are same we avoid forming a triplet with them
            // Skip duplicates for i
            if (i > 0 && arr[i - 1] == arr[i]) {
                continue;
            }
            int start = i + 1;
            int end = arr.length - 1;
            while (start < end) {
                int tripletSum = arr[i] + arr[start] + arr[end];
                if (tripletSum == 0) {
                    result.add(Arrays.asList(arr[i], arr[start], arr[end]));
                    // To find new combinations of numbers move the start and end by 1 position
                    start++;
                    end--;

                    // Skip duplicates for start and end pointer
                    // If we encounter something like this - {-4,-1,-1,0,1,2}, for i = 1 we'll form a triplet -
                    while (start < end && arr[start - 1] == arr[start]) {
                        start++;
                    }
                    while (start < end && arr[end + 1] == arr[end]) {
                        end--;
                    }

                } else if (tripletSum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-4, -1, -1, 0, 1, 2}));
    }
}
