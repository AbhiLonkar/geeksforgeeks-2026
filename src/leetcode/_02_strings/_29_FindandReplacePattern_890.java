package leetcode._02_strings;

import java.util.*;

public class _29_FindandReplacePattern_890 {
    // TODO - Given a list of strings words and a string pattern, return a list of words[i] that match pattern
    // ex. words = ["abc","deq","mee","aqq","dkd","ccc"], pattern = "abb" o/p -> ["mee", "aqq"]

    // ? Approach - Check for every string in words if it is a permutation of pattern if it is then we add it to the output array
    // ? So first write a function isPermutation which checks whether a word is a permutation of the pattern

    // ? First lets try to solve it using a hashmap
    public static boolean isPermutation(String word, String pattern) {
        HashMap<Character, Character> wordToPattern = new HashMap<>();
        HashMap<Character, Character> patternToWord = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char wToP = word.charAt(i);
            char pToW = pattern.charAt(i);
            if (wordToPattern.getOrDefault(wToP, pToW) != pToW || patternToWord.getOrDefault(pToW, wToP) != wToP) {
                return false;
            }
            wordToPattern.put(wToP, pToW);
            patternToWord.put(pToW, wToP);
        }
        return true;
    }

    public static List<String> findList(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for (String word : words) {
            if (isPermutation(word, pattern)) {
                res.add(word);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findList(new String[] {"abc","deq","mee","aqq","dkd","ccc"}, "abb"));
    }
}
