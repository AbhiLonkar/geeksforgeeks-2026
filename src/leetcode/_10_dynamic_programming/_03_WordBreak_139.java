package leetcode._10_dynamic_programming;

import java.util.*;

public class _03_WordBreak_139 {

    // TODO - Given a string s and a dictionary we have to return true if the string s can be segmented into words from the dictionary
    // ex. s = "leetcode" dict = {"leet", "code"} -> true. s can be broken down into 2 separate substrings "leet" & "code"
    // ex. s = "leetcode" dict - {"leet"} -> false. s cannot be broken down as "code" still remains after removing leet
    // ex. s = "catsandog", wordDict = ["cats","dog","sand","and","cat"] -> false s cannot be broken down as "an" will still remain

    // TODO - This problem is tricky to understand, think of it this way
    //  Imagine the string s is a long paper words, and you have stickers(words from dictionary) you have to cover the entire string with these stickers
    //  You can use the stickers any number of times, but even after using up all the stickers the some part of the string still remains uncovered then we have to return false
    //  If the string is completely covered we return true

    // ! Wrong approach
    // ? Approach - Try to find the index of the dictionary word inside the input string, then remove the word from s using substring
    // Termination condition can be when input string becomes empty

    public static boolean wordBreak(String s, String[] dict) {
        for (int i = 0; i < dict.length; i++) {
            if (s.isEmpty()) {
                return true;
            }
            int targetIdx = s.indexOf(dict[i]);
            if (targetIdx != -1) {
                String left = s.substring(0, targetIdx);
                String right = s.substring(targetIdx + dict[i].length());
                s = left + right;
                i = -1;
            }
        }
        return false;
    }

    // ?
    public static boolean wordBreakDP(String s, List<String> wordDict) {
        int n = s.length();
        HashSet<String> hs = new HashSet<>(wordDict);
        boolean[] dp = new boolean[n + 1];
        dp[0] = true; // Signifying an empty string as its always valid
        // * Traversing & populating the dp array
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                // * dp[j] signifies whether the string can or was properly split upto j
                // * then we check if the substring from j to i is present in the dictionary
                // * if it is then the string upto i is properly breakable using words from the dictionary
                if (dp[j] && hs.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }


    public static void main(String[] args) {
        System.out.println(wordBreakDP("helloworld", Arrays.asList("hel", "wor", "ld", "lo")));
    }
}
