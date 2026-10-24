import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LcStrings_IsomorphicStrings {
    // TODO - Given 2 strings s1 & s2 we have to return true if all the character in s2 can be mapped in s1.
    // TODO - No character should have a double mapping
    // ex. egg, add -> e=a, g=d So true
    // ex. paper, title -> p=t,a=i, p=t, e=l, r=e
    // ex. foo, bar -> f=b but o cannot be mapped to a or r since there's only 1 occurence of each
    // ! Note - Both the strings have same length

    // ? Approach
    // * Subproblem 1 - Try to form a countsMap with the char as key and count as value
    // * Subproblem 2 - For every value of s2 occurrence in s1 we remove that value in both the hashMaps
    public static boolean isIsomorphic(String s1, String s2) {
        HashMap<Character, Integer> s1Count = new HashMap<>();
        HashMap<Character, Integer> s2Count = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char s1Char = s1.charAt(i);
            char s2Char = s2.charAt(i);
            if (!s1Count.containsKey(s1Char)) {
                s1Count.put(s1Char, 1);
            } else {
                s1Count.put(s1Char, s1Count.get(s1Char) + 1);
            }
            if (!s2Count.containsKey(s2Char)) {
                s2Count.put(s2Char, 1);
            } else {
                s2Count.put(s2Char, s2Count.get(s2Char) + 1);
            }
        }
        for (Character c : s2Count.keySet()) {
            int val = s2Count.get(c);
            if (s1Count.containsValue(val)) {
                s2Count.remove(c);
            }
            for (Map.Entry<Character, Integer> entry : s1Count.entrySet()) {
                if (entry.getValue().equals(val)) {
                    char s1Key = entry.getKey();
                    s1Count.remove(s1Key);
                }
            }
        }
        return s1Count.isEmpty() && s2Count.isEmpty();
    }

    // Lets try using countsArray
    public static int[] createCountArray(String s) {
        int[] res = new int[256];
        for (int i = 0; i < s.length(); i++) {
            int currCharIdx = s.charAt(i);
            res[currCharIdx]++;
        }
        return res;
    }

    public static int isPresent(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean isIsomorphicOptimized(String s1, String s2) {
        int[] s1Count = createCountArray(s1);
        int[] s2Count = createCountArray(s2);
        for (int i = 0; i < s2Count.length; i++) {
            int s1Idx = isPresent(s1Count, s2Count[i]);
            if (s1Idx != -1) {
                s1Count[s1Idx] = 0;
                s2Count[i] = 0;
            }
        }
        for (int i = 0; i<s1Count.length; i++){
            if (s1Count[i]!=s2Count[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphicOptimized("leet", "code"));
    }
}
