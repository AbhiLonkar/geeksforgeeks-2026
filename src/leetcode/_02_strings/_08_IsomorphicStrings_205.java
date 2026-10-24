package leetcode._02_strings;

import java.util.HashMap;

public class _08_IsomorphicStrings_205 {
    // TODO - Given 2 strings s1 & s2 we have to return true if all the character in s2 can be mapped in s1.
    // TODO - No character should have a double mapping
    // ex. egg, add -> e=a, g=d So true
    // ex. paper, title -> p=t,a=i, p=t, e=l, r=e
    // ex. foo, bar -> f=b but o cannot be mapped to a or r since there's only 1 occurence of each
    // ! Note - Both the strings have same length

    // ? Approach - We'll keep a hashmap of the character c1 from s1 as key and character c2 from s2 as value
    // ? Iterating through the string if c1 isn't present in map we'll add it to the map with c2 as its value
    // ? If we again encounter c1 we'll make sure c2 matches to the currVal stored in c1 key, if it does keep moving forward in the string
    // ? else return true

    public static boolean isIsomorphic(String s1, String s2){
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Boolean> isUsed = new HashMap<>();
        for (int i = 0; i<s1.length(); i++){
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            if (map.containsKey(c1)){
                if (map.get(c1) != c2){
                    return false;
                }
            }
            else {
                if (isUsed.containsKey(c2)){
                    return false;
                }
                else {
                    map.put(c1, c2);
                    isUsed.put(c2, true);
                }
            }
        }
        return true;
    }

    public static boolean isIsomorphicOptimized(String s1, String s2){
        int[] arr1 = new int[128];
        int[] arr2 = new int[128];
        for (int i = 0; i<s1.length(); i++){
            char s1Char = s1.charAt(i);
            int s1CharPos = s1.charAt(i);
            char s2Char = s2.charAt(i);
            int s2CharPos = s2.charAt(i);
            if (arr1[s1CharPos] == 0){
                arr1[s1CharPos] = s2Char;
            }
            if (arr2[s2CharPos] == 0){
                arr2[s2CharPos] = s1Char;
            }
            if (arr1[s1CharPos] != s2Char || arr2[s2CharPos] != s1Char){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isIsomorphicOptimized("eem", "aqq"));
    }
}