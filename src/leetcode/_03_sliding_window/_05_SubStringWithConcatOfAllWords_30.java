package leetcode._03_sliding_window;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _05_SubStringWithConcatOfAllWords_30 {
    // TODO - We're given a words array where all the elements are of the same length & a string s, we have find at what places are the
    //  permutations of words elements are present in the string s
    //  ex. s = "barfoothefoobarman", words = ["foo","bar"], "foobar" & "barfoo" are present at indexes [0,9]

    // ? Approach - We'll create a count hashmap to store words's elements and their counts
    // ? We'll have to create a window of size words[0].length * words.length. And slide this window over the string forming a substring
    // ? Now with the substring we'll divide it into chunks of size words[0].length and check whether all the chunks are present in the countsMap
    // ? If they are we add the starting index of the window to the result list
    public static List<Integer> findIndex(String s, String[] words) {
        int wordLen = words[0].length();
        int n = words.length;
        int windowLen = wordLen * n;
        HashMap<String, Integer> countsMap = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (String word : words) {
            countsMap.put(word, countsMap.getOrDefault(word, 1) + 1);
        }
        for (int i = 0; i <= s.length() - windowLen; i++) {
            String windowString = s.substring(i, i + windowLen);
            HashMap<String, Integer> substringCountMap = new HashMap<>();
            for (int j = 0; j <= windowString.length() - wordLen; j += wordLen) {
                String subWindowString = windowString.substring(j, j + wordLen);
                substringCountMap.put(subWindowString, substringCountMap.getOrDefault(subWindowString, 1) + 1);
            }
            if (substringCountMap.equals(countsMap)){
                res.add(i);
            }
            else {
                substringCountMap.clear();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(findIndex("barfoothefoobarman", new String[]{"foo", "bar"}));
    }
}
