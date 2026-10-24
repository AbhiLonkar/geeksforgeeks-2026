package leetcode._02_strings;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _26_ReverseWordsInString_151 {
    // TODO - Given a string sentence we have to reverse the order of words in this sentence
    // ex. Today is a beautiful day -> day beautiful a is Today
    // ! Note the sentence may contain leading or trailing spaces, we need not consider them
    // ex. "  hello world  " -> world hello

    // ? Approach
    // * Subproblem 1 - Try to extract the last word of that sentence
    // * Subproblem 2 - Try to extract each word of that sentence
    // * Subproblem 3 - Add each word to string builder followed by space
    // * Subproblem 4 - Remove extra space if exists
    public static void reverseWords(String str) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> a = new ArrayList<>();
        int i2 = str.length() - 1;
        while (i2 >= 0) {
            // Find the endpoint of the word, we need to keep moving backwards till we find a non space character
            while (i2 >= 0 && str.charAt(i2) == ' ') {
                i2--;
            }
            if (i2 >= 0) {
                // Try to find the first empty space
                int i1 = i2;
                // Till we aren't to the string start and the previous character isn't an empty space we move i1 backwards
                // When we find empty space at left of i1 we stop
                // We've got the starting point, and the ending point in the form of i1 & i2
                while (i1 > 0 && str.charAt(i1 - 1) != ' ') {
                    i1--;
                }
                // Append the substring from i1 to i2
                // i2+1 because substring does endIdx-1
                sb.append(str, i1, i2 + 1);
                sb.append(" ");
                // Move the ending point to the space character as it's present on the left of i1 if i1 isn't at strings end
                i2 = i1 - 1;
            }
        }
        System.out.println(sb.toString().stripTrailing());
    }

    public static void main(String[] args) {
        reverseWords("  hello world  ");
    }
}
