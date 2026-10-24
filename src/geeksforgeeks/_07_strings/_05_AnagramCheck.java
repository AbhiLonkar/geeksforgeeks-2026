package geeksforgeeks._07_strings;

import java.util.Arrays;

public class _05_AnagramCheck {
    // TODO - Given 2 strings we have to determine whether they're anagrams or not.

    // ? Approach - Use a count array to store count of occurences of s1 characters
    // ? Iterate through s2 and for every occurence of s2 character we decrement its count in count array
    // ? And at the end if the count array remains 0 we return true
    public static boolean anagramCheck(String s1, String s2){
        int[] count = new int[26];
        for (int i = 0; i<s1.length(); i++){
            int charPos1 = s1.charAt(i) - 'a';
            int charPos2 = s2.charAt(i) - 'a';
            count[charPos1]++;
            count[charPos2]--;
        }
        for (int i: count){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println((anagramCheck("book", "book")));
    }
}
