package leetcode._02_strings;

public class _30_WordBreak_139 {
    // TODO - Given a string s and an array dictionary d we have to find if all the words in the dictionary are present in the string s
    //  Once a word is present we have to remove that word from the string

    // ? Approach - Lets use a sliding window we'll iterate through the dictionary
    // ? We'll try to find matches in s if a match occurs we'll remove that part of the string
    // ? If a match isn't possible we return false there itself

    public static void wordBreak(String s, String[] words){
        for (String w: words){
            int wordLen = w.length();
            for (int i = 0; i<wordLen; i++){

            }
        }
    }
    public static void main(String[] args) {

    }

}
