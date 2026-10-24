package geeksforgeeks._07_strings;

import java.util.ArrayList;

public class _08_ReverseWordsInString {
    // TODO - Given a sentence string we have to reverse the order of the words in the string
    // ex. "Welcome to gfg" -> "gfg to Welcome"
    // ex. "Hello World" -> "World Hello"

    // ? Approach - Create an array list store individual words in it.
    // ? Iterate from the end add each word to a string builder and return the string builder
    // * Time - O(n) for string & array traversal, Space = O(n) For array & stringbuilder
    public static void reverseSentence(String str) {
        ArrayList<String> strArray = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            // Form the full string using the characters
            if (str.charAt(i) != ' ') {
                sb.append(str.charAt(i));
            }
            // If we've reached string end or space we add the string builder to the array
            // and reset the string builder
            if (str.charAt(i) == ' ' || i == str.length() - 1) {
                strArray.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        for (int i = strArray.size() - 1; i >= 0; i--) {
            sb.append(strArray.get(i));
            if (i != 0) {
                sb.append(' ');
            }
        }
        System.out.println(sb);
    }

    // ? Approach - We create a character array, we keep track of start & end of a word
    // ? We reverse this word using start and end array indices
    public static void reverseSentenceOptimized(String str) {
        char[] chArray = str.toCharArray();
        int start = 0;
        for (int end = 0; end < chArray.length; end++) {
            if (chArray[end] == ' ') {
                reverseWord(chArray, start, end - 1);
                start = end + 1;
            }
        }
        reverseWord(chArray, start, chArray.length - 1);
        reverseWord(chArray, 0, chArray.length - 1);
        String res = new String(chArray);
        System.out.println(res);
    }

    public static void reverseWord(char[] chArray, int start, int end) {
        while (start < end) {
            char temp = chArray[end];
            chArray[end] = chArray[start];
            chArray[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        reverseSentenceOptimized("Today is a good day");
    }
}
