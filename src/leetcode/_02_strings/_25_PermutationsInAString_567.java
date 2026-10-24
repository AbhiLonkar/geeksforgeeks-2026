package leetcode._02_strings;

import java.util.*;

public class _25_PermutationsInAString_567 {
    // TODO - Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
    // ex. s1 = "ab" s2 = "eidbaooo" so true
    // ? Approach 1 - This problem can be divided into 2 subproblems.
    // * Subproblem 1 - Form an array consisting of all permutations of s1
    // * Subproblem 2 - Pattern recognization, we'll then search all these permutations in s1 using pattern recognition
    // ! TLE
    public static List<String> permutations = new ArrayList<>();

    public static void generatePermutations(String str, String ans) {
        if (str.isEmpty()) {
            permutations.add(ans);
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String leftToChar = str.substring(0, i);
            String rightToChar = str.substring(i + 1);
            generatePermutations(leftToChar + rightToChar, ans + currChar);
        }
    }

    // i1 to iterate through s2 and i2 to iterate through target
    public static boolean isPresent(String s1, String s2) {
        generatePermutations(s1, "");
        for (String target : permutations) {
            int i1 = 0;
            while (i1 <= s2.length() - target.length()) {
                int i2;
                for (i2 = 0; i2 < target.length(); i2++) {
                    if (target.charAt(i2) != s2.charAt(i1 + i2)) {
                        break;
                    }
                }
                if (i2 == target.length()) {
                    return true;
                }
                i1++;
            }
        }
        return false;
    }

    // ? Approach 2 - If one string is a permutation of another string then they must have same character frequencies
    // * Subproblem 1 - lets try to form a count array for s1
    public static int[] generateCountArr(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            int currCharIdx = str.charAt(i) - 'a';
            count[currCharIdx]++;
        }
        return count;
    }

    // * Subproblem 2 - We'll iterate through s2 in a window of size s1.length();
    // * In this window for every occurrence of ch of s1 we'll check in countArray, if count is greater than 1 we decrement it and move the start pointer forward
    // * if the condition of count>1 is met we keep on moving start to the end of window
    // * If the start pointer has crossed the end pointer means we've found a match return true
    // * else keep moving the start forward by 1 position and end forward by start + s1.length() positions
    // ! Still time & space is more
    public static boolean isPermute(String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()) {
            return true;
        }
        int[] count = generateCountArr(s1);
        int[] temp = new int[26];
        System.arraycopy(count, 0, temp, 0, 26);
        int windowStart = 0;
        int start = windowStart;
        int end = s1.length() - 1;
        while (start < s2.length() && start <= end) {
            int currCharIdx = s2.charAt(start) - 'a';
            if (temp[currCharIdx] > 0) {
                temp[currCharIdx]--;
                start++;
            }
            // Start a new window
            else {
                temp = count.clone();
                windowStart++;
                start = windowStart;
                end = start + s1.length() - 1;
            }
            if (start > end) {
                return true;
            }
        }
        return false;
    }

    // ? Optimized Method - Form 2 count arrays for the strings, form a window of size s1.length in s2.
    // ? Populate the count array with all character from s1 & s2 in the range 0 to s1.length
    // ? If both the arrays match means s1 permutation is present in s2.
    // ? If it isn't form a new window in s2 from s1.length to s2.length
    // ? We add a character to the right of the window and remove a character from the left at the same time
    // ! We're sliding a window in s2, remove on left and add on right

    public static boolean isAMatch(int[] arr1, int[] arr2) {
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPermuteOptimized(String s1, String s2) {
        if (s1.isEmpty() && s2.isEmpty()){
            return true;
        }
        if (s1.length() > s2.length()){
            return false;
        }
        int[] s1Count = new int[26];
        int[] s2Count = new int[26];
        // Populate both the countArrays for size s1.length
        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }
        // If both the arrays are equal means a permutation exists
        if (isAMatch(s1Count, s2Count)){
            return true;
        }
        // We'll slide the window in s2 for the characters after s1.length
        for (int i = s1.length(); i<s2.length(); i++){
            // ex. s2 = "cbadebac" s1 = "dea", s1Count = [1,0,0,1,1,0,0,...,0]
            // 1st iteration - rightCharIdx = 3 [d], leftCharIdx = s1.length-s1.length = 0 [c]
            //                 Add d remove c from s2 count -> [b,a,d] -> [1,1,0,1,0,0,..,0]
            // 2nd iteration - rightCharIdx = 4 [e], leftCharIdx = 1 [b]
            //                 Add e remove b from s2 count -> [a,d,e] which in s2Cunt equals -> [1,0,0,1,1,0,....,0]
            // * So at this point s2Count becomes equal to s1Count so we return true
            int rightCharIdx = s2.charAt(i) - 'a';
            s2Count[rightCharIdx]++;
            int leftCharIdx = s2.charAt(i - s1.length()) - 'a';
            s2Count[leftCharIdx]--;
            if (isAMatch(s1Count, s2Count)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPermute("adc", "dcda"));
    }
}
