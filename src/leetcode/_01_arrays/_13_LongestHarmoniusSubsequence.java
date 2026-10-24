package leetcode._01_arrays;

import java.util.HashMap;

public class _13_LongestHarmoniusSubsequence {
    // TODO - Given an integer array we have to find the length of the longest harmonious subsequence
    // TODO - A subsequence is said to be harmonious when diff between maxElement and minElement == 1.
    // ex. {1,3,2,2,5,2,3,7} hSub = {3,2,2,2,3} len = 5
    // Over here the max & min are 3,2 difference between the two is exactly 1.

    // ? We can use the count of elements, since we're not dealing with contiguous sub arrays
    // ? Find the count of k and k+1 if it does exist in the frequencyMap
    // ? Return the maximumCount that we get for a pair of k and k+1 element.

    public static int longestHarmoniusSubsequence(int[] arr){
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int i: arr){
            freqMap.put(i, freqMap.getOrDefault(i, 0)+1);
        }
        int maxLen = 0;
        for (int k: freqMap.keySet()){
            int currSum = 0;
            if (freqMap.containsKey(k+1)){
                currSum = freqMap.get(k) + freqMap.get(k+1);
            }
            maxLen = Math.max(maxLen, currSum);
        }
        return maxLen;
    }

    public static void main(String[] args) {
        System.out.println(longestHarmoniusSubsequence(new int[] {1,3,2,2,5,2,3,7}));
    }
}
