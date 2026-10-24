package leetcode._02_strings;

import java.util.HashMap;
import java.util.HashSet;

public class _24_LongestSubstringWithoutRepeatingCharacters_3 {
    // TODO - Given a string we have to find out the length of the longest substring which does not have repeating characters.
    // ex. s = "abcabcbb" longest substring = abc so len = 3
    // ex. s = "pwwkew" longest substring = wke so len = 3

    // ? Approach - We'll use a hashmap, in this we'll store the char and whether we've encountered the char
    // ? Initially it'll be false, when we start traversing through the string, we'll check if we've encountered the element or not
    // ? If we haven't we extend the length of the current substring and update result length if it does.
    // ? If we encounter the same character again, we start a new substring starting with this character
    public static HashMap<Character, Boolean> createMap(String str) {
        HashMap<Character, Boolean> encounterMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            encounterMap.put(c, false);
        }
        return encounterMap;
    }

    public static int longestSubstringLen(String str) {
        HashMap<Character, Boolean> encounterMap = createMap(str);
        int res = 0;
        for (int i = 0; i < str.length(); i++) {
            int currLen = 1;
            Character beginningChar = str.charAt(i);
            encounterMap.put(beginningChar, true);
            for (int j = i + 1; j < str.length(); j++) {
                Character currChar = str.charAt(j);
                if (encounterMap.get(currChar)) {
                    // reset the map to false
                    encounterMap.forEach((k, v) -> encounterMap.put(k, false));
                    break;
                } else {
                    currLen++;
                    encounterMap.put(currChar, true);
                }
            }
            res = Math.max(res, currLen);
        }
        return res;
    }

    // ! Still time is more
    public static int longestSubstringSlidingWindow(String str) {
        HashMap<Character, Boolean> encounterMap = createMap(str);
        int i1 = 0, i2 = 0;
        int resLen = 0, currLen = 0;
        while (i2 < str.length()) {
            char currChar = str.charAt(i2);
            if (!encounterMap.get(currChar)) {
                currLen++;
                i2++;
                resLen = Math.max(resLen, currLen);
                encounterMap.put(currChar, true);
            } else {
                encounterMap.forEach((k, v) -> encounterMap.put(k, false));
                currLen = 0;
                i1++;
                i2 = i1;
            }
        }
        return resLen;
    }

    // ? New
    public static int longestSubstringOptimized(String str){
        HashSet<Character> charSet = new HashSet<>();
        int res = 0, i1 = 0;
        for (int i2 = 0; i2<str.length(); i2++){
            while(charSet.contains(str.charAt(i2))){
                i1++;
                charSet.remove(str.charAt(i2));
            }
            charSet.add(str.charAt(i2));
            res = Math.max(res, i2-i1+1);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstringSlidingWindow("pwwkew"));
        System.out.println((0.712 + 1.520 +  3.140 + 4.120)/4);
    }
}
