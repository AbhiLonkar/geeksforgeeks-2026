package leetcode._02_strings;

import com.sun.source.tree.BreakTree;

import java.util.Arrays;

public class _22_LongestCommonPrefix_14 {
    // TODO - Given a string array we have to find a prefix that is present in all the words of the array
    // ex. [flower, flight, flow] o/p -> fl
    // ex. ["dog","racecar","car"] o/p -> ""
    // ex. [gloat, float, toat,] o/p -> "oat"

    // ? Approach - We'll iterate through the array, and the words at the same time
    // ! Wrong code
    public static String longestCommonPrefix(String[] words) {
        int n = words.length;
        if (n == 1) {
            return words[0];
        }
        // How about we find the smallest string in the words array
        String smolString = words[0];
        for (int i = 1; i < n; i++) {
            if (words[i].length() < smolString.length()) {
                smolString = words[i];
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < smolString.length(); i++) {
            boolean isPresent = true;
            for (String s : words) {
                if (s.charAt(i) == smolString.charAt(i)) {
                    sb.append(s.charAt(i));
                } else {
                    if (sb.length() >= smolString.length() / 2) {
                        return sb.toString();
                    } else {
                        sb = new StringBuilder();
                    }
                }
            }
        }
        return "";
    }

    public static String longestCommonPrefixOpt(String[] words) {
        StringBuilder sb = new StringBuilder();
        String ref = words[0];
        // Iterating through ref string
        for (int i = 0; i < ref.length(); i++) {
            // Iterating through words of the words array
            for (String word : words) {
                // If we've already reached the end of the curr word being processed means we've reached the smallest string and no longer need to check other strings
                // Because, this smallest string, is the longest possible prefix in all the other words
                if (i == word.length() || word.charAt(i) != ref.charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(ref.charAt(i));
        }
        return sb.toString();
    }

    // Approach 2 - Just comparing the smallest and longest string
    public static String longestCommonPrefixII(String[] words){
        StringBuilder sb = new StringBuilder();
        Arrays.sort(words, (a, b)->Integer.compare(a.length(), b.length()));
        String smallest = words[0];
        String largest = words[words.length-1];
        for (int i = 0; i<smallest.length(); i++){
            if (smallest.charAt(i) != largest.charAt(i)){
                return sb.toString();
            }
            sb.append(smallest.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        longestCommonPrefixII(new String[]{"float", "gloat", "toat", "oat" });
    }
}
