package leetcode._02_strings;

import java.util.HashMap;
import java.util.HashSet;

public class _15_SubstringsOfSize3WithDistinctCharacters_1876 {
    // TODO - Given a string we have to find how many substrings of size 3 have all distinct characters
    // TODO - Good substring is a string with all distinct characters
    // ex. s = "xyzzaz" Output: 1
    // There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz".
    // The only good substring of length 3 is "xyz".
    // s = "abcabc" -> substrings are abc, bca, cab, abc and all are good so output -> 4
    // ! Constraints 1 <= s.length <= 100
    // s consists of lowercase English letters.


    // ? Approach - We'll form a window of fixed size 3, we'll add the first 3 elements in a hashset, we move the window forward by 1 position
    // ? We remove the (i - k)th character from the hashset and add ith character if the hashset size remains 3 we increment the count by 1
    // ? Repeat the process till string end - 3
    // * Logic coming out to be wrong with this approach



    public static int count(String s){
        int count = 0;
        if (s.length()<3){
            return -1;
        }
        else {
            HashMap<Character, Integer> countsMap = new HashMap<>();
            for (int i = 0; i<s.length(); i++){
                if (countsMap.containsKey(s.charAt(i))){
                    countsMap.put(s.charAt(i), countsMap.get(s.charAt(i))-1);
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(count("aababcabc"));
    }

}
