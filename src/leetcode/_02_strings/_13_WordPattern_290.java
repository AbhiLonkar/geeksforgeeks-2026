package leetcode._02_strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public class _13_WordPattern_290 {
    // TODO Given 2 strings, we have to map every character from string 1 to every string separated by space in string 2
    // ex. s1 = abba s2 = dog cat cat dog, a-> dog and b -> cat
    // ex. s1 = xyz s2 = dog cat goat, x->dog y->cat z->goat
    // ex. s1 = aaaa s2 = dog cat dog cat, unmappable

    // ? Approach - Add each character from s1 into a hashset and each string from s2 into hashset 2
    // ? If the size of both of them are equal we return true else false
    // ! Wrong approach - ex. s1 = aba, s2 = cat cat cat dog
    public static boolean wordPattern(String s1, String s2) {
        HashSet<Character> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            hs1.add(s1.charAt(i));
        }
        for (String s : s2.split("\\s+")) {
            hs2.add(s);
            if (hs2.size() > hs1.size()) {
                return false;
            }
        }
        return hs1.size() == hs2.size();
    }

    public static boolean wordPatternOptimized(String s1, String s2) {
        String[] s2Array = s2.split(" ");
        // ? if the length of s1 and s2 array dont match means we have an extra character or word in s1 or s2 which cannot be mapped
        if (s1.length() != s2Array.length) {
            return false;
        }
        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char currChar = s1.charAt(i);
            String currWord = s2Array[i];
            // ? Check if the currChar or currWord keys are present in their respective maps and check if their values are already mapped
            // ? getOrDefault because with get if the currChar isn't present it gives null and using equality on it will give null pointer exception
            // ? If the new values clash with the old values means they are not properly matched
            if (!charToWord.getOrDefault(currChar, currWord).equals(currWord) || wordToChar.getOrDefault(currWord, currChar) != currChar) {
                return false;
            }
            // ? Putting the key and value that wasn't present in their respective maps
            charToWord.put(s1.charAt(i), s2Array[i]);
            wordToChar.put(s2Array[i], s1.charAt(i));
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(wordPatternOptimized("abba", "cat dog dog cat"));
    }

}
