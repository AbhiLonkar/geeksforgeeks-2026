package leetcode._02_strings;

import java.util.*;

public class _34_GroupAnagrams_49 {
    // TODO - Given an array of words we have to group the words that are anagrams together
    //  ex. strs = ["eat","tea","tan","ate","nat","bat"] o/p -> [["bat"],["nat","tan"],["ate","eat","tea"]]

    public static String sortWord(String s) {
        char[] sArray = s.toCharArray();
        Arrays.sort(sArray);
        return new String(sArray);
    }

    public static List<List<String>> groupAnagram(String[] words) {
        HashMap<String, List<String>> anagramMap = new HashMap<>();
        for (String word : words) {
            String sortedStr = sortWord(word);
            anagramMap.computeIfAbsent(sortedStr, initializeWith -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(anagramMap.values());
    }

    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagram(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));

    }

}
