package leetcode._02_strings;

import java.util.ArrayList;

public class _20_ReverseWordsInStringIII_557 {
    // TODO - Given a string we have to reverse individual words in it
    // ex. Input: s = "Let's take LeetCode contest"
    //     Output: "s'teL ekat edoCteeL tsetnoc"

    // ? Approach - Split the words put them in an array
    // ? Call reverse function on each of these array elements
    // ? Join these elements together with space in between

    public static String reverse(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i>=0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    public static String reverseWords(String s){
        String[] ls = s.split("\\s+");
        for (int i = 0; i<ls.length; i++){
            ls[i] = reverse(ls[i]);
        }
        String res = String.join(" ", ls);
        return res;
    }

    public static void main(String[] args) {
        System.out.println((reverseWords("Let's take LeetCode contest")));
    }
}
