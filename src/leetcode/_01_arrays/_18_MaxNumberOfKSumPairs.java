package leetcode._01_arrays;

import java.util.Arrays;
import java.util.HashMap;

// ! What I learnt? Hashmap methods, Two pointer approach

public class _18_MaxNumberOfKSumPairs {
    // TODO - We're given an array and a sum, we have to find how many unique pairs of nums when added form this sum are possible
    // TODO - Once we've found 1 unique pair, the two nums from this pair are removed from this array

    // ? Idea - Use hashMap to count the occurrence of each element of that array.
    public static HashMap<Integer, Integer> ElementCounter(int[] arr) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        return countMap;
    }

    // ! HardCore Approach

    // eg - {1,2,3,4,5} sum = 5, possible pairs = {1, 4} & {2, 3} remaining array = {5} & count = 2;
    // ? I think to solve this we can use the same approach we used in the Two Sum problem
    // ? First select an element, then calculate its difference with sum and check whether this difference is present in the hash map
    // ? If it's present we just remove this pair and increment the count.

    // * Facing a problem, how do I remove the elements from the numsMap which formed the sum
    public static int Counter(int[] arr, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int pairCount = 0;
        // ? 1st. Think about getting the count of each and every element in the array & store it as a value for that element.
        // ! This code is redundant because when we iterate through the array to find the difference we can add the new element and count over there
        for (int num : arr) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) + 1);
            } else {
                countMap.put(num, 1);
            }
        }
        // ? Now you have the count of each element of the array in hashmap
        // ? Now start searching for pairs which form the sum
        // ? When found the pair decrement the count of both of those elements
        // ? When the count reaches 0 no longer consider those elements
        for (Integer numKey : countMap.keySet()) {
            int diffKey = k - numKey;
            if (countMap.containsKey(diffKey) && countMap.get(numKey) > 0 && countMap.get(diffKey) > 0) {
                // form a pair
                // * Case 1 - When both the numbers are same
                if (numKey == diffKey) {
                    // * Finding the max number of pairs possible
                    pairCount += countMap.get(numKey) / 2;
                    countMap.put(numKey, countMap.get(numKey) % 2);
                }
                // * Case 2 - When both nums are different
                else {
                    int maxPairPossible = Math.min(countMap.get(numKey), countMap.get(diffKey));
                    pairCount += maxPairPossible;
                    countMap.put(numKey, countMap.get(numKey) - maxPairPossible);
                    countMap.put(diffKey, countMap.get(diffKey) - maxPairPossible);
                }
            }
        }
        return pairCount;
    }

    // ! HardCore Approach End

    // * Optimized version of hardcore approach based on two sum
    public static int HashOptimizedCounter(int[] arr, int k) {
        HashMap<Integer, Integer> countsMap = new HashMap<>();
        int count = 0;
        for (int num : arr) {
            int diff = k - num;
            if (countsMap.containsKey(diff)) {
                count++;
                if (countsMap.get(diff) == 1) {
                    countsMap.remove(diff);
                } else {
                    countsMap.put(diff, countsMap.get(diff) - 1);
                }
            }
            else {
                countsMap.put(num, countsMap.getOrDefault(num, 0) + 1);
            }

        }
        return count;
    }

    // * Two Pointer Approach

    // ? Idea - Sort the array, put a pointer on the left side and one on the right
    // ? 3 Cases Possible
    // ? Sum is possible by adding these two elements, simply increment the count.
    // ? Sum is greater, so move the left pointer to the right by 1 position
    // ? Sum is smaller, so move the right pointer to the left by 1 position

    public static int CounterTwoPointer(int[] arr, int k) {
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == k) {
                count++;
                start++;
                end--;
            } else if (sum > k) {
                end--;
            } else {
                start++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println(HashOptimizedCounter(new int[]{3,1,3,4,3}, 6));
    }

}


