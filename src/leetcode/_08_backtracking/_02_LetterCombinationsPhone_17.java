package leetcode._08_backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _02_LetterCombinationsPhone_17 {
    // TODO - Given a digit string, we have to generate a string array which represents the possible string generations from said digits
    // ex. "23" {2: "abc", 3: "def"} -> ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"]
    // ex. "2" -> ["a", "b", "c"]
    // ex. "234" {2: abc, 3: def, 4: ghi} -> [adg, adh, adi, aeg, aeh, aei, afg, afh, afi,.....]

    // ? Approach - We'll create a hashmap to store the digit and its corresponding value
    // ? After that we'll use a backtracking algo to add & delete letters corresponding to a particular digit

    public static List<String> letterCombinations(String digits){
        HashMap<Character, String> hm = new HashMap<>();
        if (digits.isEmpty()){
            return new ArrayList<>();
        }
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");
        List<String> res = new ArrayList<>();
        backtrack(res, hm, digits, 0, new StringBuilder());
        return res;
    }
    public static void backtrack(List<String> res, HashMap<Character, String> hm, String digits, int i, StringBuilder sb){
        if (sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }
        String mappedString = hm.get(digits.charAt(i));
        for (char ch: mappedString.toCharArray()){
            sb.append(ch);
            backtrack(res, hm, digits, i+1, sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

}
