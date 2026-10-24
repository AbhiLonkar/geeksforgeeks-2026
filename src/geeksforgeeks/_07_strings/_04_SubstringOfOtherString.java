package geeksforgeeks._07_strings;

public class _04_SubstringOfOtherString {
    // TODO - Given 2 strings we have to tell where the second string is a subsequence of the first string
    // ex. s1 = ABC - {'', A, B, C, AB, AC, BC, ABC} & s2 = AC then AC is a subsequence so return true

    // ? Approach - Check for the first character of s2 in s1, if it is present we find out at which position it is present
    // ? Then we search the second character of s2 in s1 from this position
    // ? Keep on doing this till we keep finding that character in s1 from that respective starting point.
    public static int isPresent(String str, char c, int startPoint) {
        for (int i = startPoint; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }

    public static boolean substringOfOtherString(String s1, String s2) {
        // Lets divide this problem
        // 1. Try to find the first occurence of char in s1
        int startPoint = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (isPresent(s1, s2.charAt(i), startPoint) != -1) {
                // Find the index of s2.charAt(i) in s1
                // Then we move the search point forward by 1 position
                // We keep on doing this till we've reached end of s2
                startPoint = isPresent(s1, s2.charAt(i), startPoint) + 1;
            } else {
                // If in the search there doesn't exist s2.charAt(i) in s1 then we return false
                return false;
            }
        }
        return true;
    }

    // ? Approach - Using 2 pointers.
    // ? So we'll check for s1[i] == s2[j] if it is then we move forward in both the strings
    // ? If s1[i] != s2[j] then we move forward in s1 till we reach s1 end
    // * Time - O(s1 len + s2 len) Space - O(1)
    public static boolean substringOfOtherStringTwoPointer(String s1, String s2) {
        int j = 0;
        for (int i = 0; i < s1.length() && j < s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }
        return j == s2.length();
    }

    public static void main(String[] args) {
        System.out.println(substringOfOtherStringTwoPointer("bdadhc", "bhcz"));
    }
}
