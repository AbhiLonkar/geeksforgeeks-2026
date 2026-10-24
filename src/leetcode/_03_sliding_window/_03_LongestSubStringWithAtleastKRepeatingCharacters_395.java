package leetcode._03_sliding_window;

import java.util.HashMap;

public class _03_LongestSubStringWithAtleastKRepeatingCharacters_395 {
    // TODO - Given a string s and integer k we have to find the longest substring which has at least k repeating characters in it.
    // ex. s = "aaabb" k = 3, so "aaa" is the longest substring which has 3 repeating characters
    // ex. s = "ababbc" k = 2, so "ababb" is the longest substring which has at least 2 repeating characters in "a" & "b"
    // ! Constraints -
    // ! 1 <= s.length <= 10^4
    // ! s consists of only lowercase English letters.
    // ! 1 <= k <= 105


    // ? Approach - 1st lets try to count all occurences of characters using hashmap
    public static void longestSubString(String s) {
        int k = 2;
        HashMap<Character, Integer> countsMap = new HashMap<>();
        for (Character ch : s.toCharArray()) {
            countsMap.put(ch, countsMap.getOrDefault(ch, 0) + 1);
        }
        countsMap.entrySet().removeIf(entry -> entry.getValue() < k);
        int res = 0;
        int currLen = 0;
        for (int i = 0; i < s.length(); i++) {
            if (countsMap.containsKey(s.charAt(i))) {
                currLen++;
                res = Math.max(res, currLen);
                countsMap.put(s.charAt(i), countsMap.get(s.charAt(i)) - 1);
                if (countsMap.containsKey(s.charAt(i)) && countsMap.get(s.charAt(i)) == 0) {
                    countsMap.remove(s.charAt(i));
                }
            } else {
                currLen = 0;
            }
        }
        System.out.println(res);
    }

    // ? Approach 2
    public static void longestSub(String s, int k) {
        int maxLen = 0;
        int n = s.length();

        // Consider substrings with 1 to 26 unique characters
        for (int targetUnique = 1; targetUnique <= 26; targetUnique++) {
            int[] freq = new int[26]; // Frequency array for characters
            int left = 0, right = 0;
            int uniqueCount = 0; // Number of unique chars in window
            int atLeastKCount = 0; // Count of chars that appear at least k times

            while (right < n) {
                // Expand the window
                if (freq[s.charAt(right) - 'a'] == 0) {
                    uniqueCount++; // New unique character
                }
                freq[s.charAt(right) - 'a']++;
                if (freq[s.charAt(right) - 'a'] == k) {
                    atLeastKCount++; // This character now meets the k requirement
                }
                right++; // Move right pointer

                // Shrink the window if unique characters exceed target
                while (uniqueCount > targetUnique) {
                    if (freq[s.charAt(left) - 'a'] == k) {
                        atLeastKCount--; // Removing a valid k-character
                    }
                    freq[s.charAt(left) - 'a']--;
                    if (freq[s.charAt(left) - 'a'] == 0) {
                        uniqueCount--; // Character removed completely
                    }
                    left++; // Move left pointer
                }

                // If all unique characters in window meet k times, update maxLen
                if (uniqueCount == atLeastKCount) {
                    maxLen = Math.max(maxLen, right - left);
                }
            }
        }
        System.out.println(maxLen);
    }

    public static void main(String[] args) {
        longestSub("aaabb", 3);
    }
}


