package leetcode._02_strings;

public class _11_IsSubsequence_392 {
    // TODO - Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
    // ex. s = "ace", t = "abcde" -> true "ace" is a subsequence of "abcde" while "aec" is not
    // ex. s = "axc", t = "ahbgdc" -> false

    // ? Approach - Let's try to find the first occurence of the first character of s in t
    // ? After getting the index we'll search for the first occurence of the second character of s in t and so on
    // ? If we find all then true else false

    public static boolean isSubsequence(String target, String str) {
        int n1 = target.length(), n2 = str.length();
        int t = 0, s = 0;
        while (t<n1 && s <n2){
            if (str.charAt(s) == target.charAt(t)){
                t++;
            }
            s++;
        }
        return t == n1;
    }


    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
    }
}
