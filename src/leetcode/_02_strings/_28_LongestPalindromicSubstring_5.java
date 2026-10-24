package leetcode._02_strings;

public class _28_LongestPalindromicSubstring_5 {
    // TODO - Given a string we have to find the length of the longest substring which is a palindrome
    // ex. s = "babad" -> longest palindromic sub = bab or aba which is length - 3
    // ex. s = "cbbd" -> bb -> length - 2
    // ! Constraints - 1 <= s.length <= 1000, and s is only digit and lowercase letters

    // ? Approach 1 - Double for loop, form a substring for each character
    // Write check palindrome fxn as well, if isPalindrome(s) find the length by i + j - 1, store maxLen, rewrite it if currLen exceeds maxLen

    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static String longestPalindromeSubstring(String s) {
        int maxLen = Integer.MIN_VALUE;
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (isPalindrome(s.substring(i, j + 1))) {
                    if ((j - i + 1) > maxLen) {
                        res = new StringBuilder(s.substring(i, j + 1));
                        maxLen = j - i + 1;
                    }
                }
            }
        }
        return res.toString();
    }

    // ? We'll iterate through the entire string, we know that palindromic string expand from the center
    // ? So lets keep two left and right adjacent pointers, when characters at both these pointer are same we can move these pointers backwards and forwards
    // ? Else the characters at left and right aren't same then we move the centre forward;
    public static String longestPalindromeSubStringOptimized(String s) {
        String longestSubstring = s.substring(0, 1);
        for (int centre = 0; centre < s.length(); centre++) {
            // Over here we're checking for odd length string, ex. racecar, but it will fail for even length string ex. abba
            // Why? for odd lengths, we check adjacent characters, cec in racecar when e is the centre
            longestSubstring = expandLeftAndRight(s, centre, centre, longestSubstring);
            // Over here we're checking for even length string, ex. abba, but it will fail for odd length string ex. racecar
            // Why? for even lengths, we check both the centred characters, bb in abba where both bb are at the centre
            longestSubstring = expandLeftAndRight(s, centre, centre + 1, longestSubstring);
        }
        return longestSubstring;
    }

    public static String expandLeftAndRight(String s, int l, int r, String longestSubstring) {
        while (l >= 0 && r <= s.length() - 1) {
            if (s.charAt(l) == s.charAt(r)) {
                // When the currSubString length exceeds the longestSubString len we overwrite it
                if (r - l + 1 > longestSubstring.length()) {
                    longestSubstring = s.substring(l, r + 1);
                }
            }
            l--;
            r++;
        }
        return longestSubstring;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindromeSubStringOptimized("baab"));
    }

}
