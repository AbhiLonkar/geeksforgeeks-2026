package geeksforgeeks._07_strings;

import java.util.*;

public class _03_PalindromeCheck {
    // TODO - Given a string check whether if its a palindrome or not

    // ? Approach 1 - Let's create a reverse string from the og string, compare both of them, if they're the same return true else false.
    public static boolean palindromeCheck(String str) {
        StringBuilder reverseString = new StringBuilder();
//        StringBuilder reverseString = new StringBuilder(str);
//        reverseString.append(str);
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseString.append(str.charAt(i));
        }
        return str.contentEquals(reverseString);
    }

    // ? Approach 2 - Let's use recursion to compare the start and endpoint of a string
    // ? If they are equals we move both those points forward and backward respectively
    // ? We keep on doing this till both those pointers cross
    public static boolean palindromeCheckOptimized(String str) {
        int l = 0, r = str.length() - 1;
        while (l <= r) {
            if (str.charAt(l) == str.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(palindromeCheckOptimized(str));
    }
}
