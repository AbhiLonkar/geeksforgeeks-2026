package leetcode._02_strings;

import java.util.*;
public class _27_NumberOfMatchingSubsequence_792 {
    // TODO - Given a target string array and s, we have to find how many targets are present in str

    // ? Approach - We'll iterate through each target string in target array
    // ? Also use a helper fxn to determine whether a target is a subsequence of s
    // ? We'll increment the count for every target in s

    // * Subproblem 1 - Write a function to determine subsequence or not
    public static boolean isSubsequence(String target, String s){
        int t = 0, i = 0;
        int m = target.length(), n = s.length();
        while (t<m && i<n){
            if (s.charAt(i) == target.charAt(t)){
                t++;
            }
            i++;
        }
        return t == m;
    }

    public static int countMatchingSubsequence(String s, String[] words){
        int count = 0;
        for (String target: words){
            if(isSubsequence(target, s)){
                count++;
            }
        }
        return count;
    }

    // ? Approach 2
    public int numMatchingSubsequenceOptimized(String s, String[] words) {

        Map<String,Integer> map = new HashMap<>();
        for(String str:words){
            map.put(str,map.getOrDefault(str,0)+1);
        }

        int ans = 0;
        // string to search in
        char[] ch = s.toCharArray();

        for(String str:map.keySet()){
            // target string
            if(isSubsequence(str, s)) {
                ans+=map.get(str);
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        System.out.println(countMatchingSubsequence("abcde", new String[] {"a","bb","acd","ace"}));
    }
}
