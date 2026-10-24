package geeksforgeeks._07_strings.pattern_searching;

public class _01_PatternSearchingNaive {
    // TODO - Given a string and a target string we have to find the occurence index of target in the string.
    // ex. s1 -> "ABCDAEW" target -> "AEW" o/p -> 4. Target string AEW starts at index 4 in s1.
    // ex. "AAAAA" target - "AAA" o/p -> 0 1 2. Target string AAA appears at index 0 1 2

    // ? Approach - Find the first character of target in s1. Form a substring in s1 starting from the find point to the length of the target string
    // ? If the substring and the target string match we print the index and move the search point forward by 1 position.

    // TODO Sub problem 1 - Find the occurence of first character of target in s1.
    // TODO Sub problem 2 - Find all the occurence of first character of target in s1.
    // TODO Sub problem 3 - Form a substring starting from the idx of the first character of target in s1 to target.length().

    // * Time - O(s1.length * target.length)
    public static void patternSearch(String s1, String target) {
        for (int i = 0; i < s1.length(); i++) {
            // ? i + target.length() - 1 -> Because the substring we're forming should exist between the s1's constraints
            // ? - 1 because we're using 0 indexing and target.length doesn't rely on 0 indexing but whole length
            if (s1.charAt(i) == target.charAt(0) && i + target.length() - 1 < s1.length()) {
                // ? Forms substring from i to i + target.length - 1
                String sub = s1.substring(i, i + target.length());
                if (sub.equals(target)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        patternSearch("mississippi", "issip");
    }
}
