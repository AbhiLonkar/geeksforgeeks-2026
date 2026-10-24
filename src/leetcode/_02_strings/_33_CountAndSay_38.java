package leetcode._02_strings;

import java.util.ArrayList;
import java.util.List;

public class _33_CountAndSay_38 {
    // TODO - Given a number n we have to return the run length encoding of that number
    //  RLE is a way of representing the frequency of a digit followed by that digit itself
    //  Also countAndSay(1) = "1" (Base case)
    //  ex. n = 5
    //  countAndSay(5) -> countAndSay(4) -> countAndSay(3) -> countAndSay(2) -> countAndSay(1) ==> 1
    //  countAndSay(2) is represent as "11" meaning frequency of 1 is 1
    //  countAndSay(3) is represented as "21" meaning frequency of 1 is 2
    //  countAndSay(4) is represented as "1211" meaning frequency of 2 is 1 and 1 is 1
    //  countAndSay(5) is represented as "111221" meaning frequency of 1 is 1, 2 is 1 and 1 is 2

    // ! Note - We only count frequencies for a continuous number
    // ex. 1121 isn't 3112 (counting all occurences of 1 at once) but 211211

    // ? Approach - We'll start generating countAndSay for every number starting from 2 and pass this to generate the countAndSay for the next number
    public static String countAndSay(int n) {
        String s = "1";
        // Generating countSayStrings for each number upto n and using the same string to generate the **next** countandsay
        for (int i = 1; i < n; i++) {
            s = generateCountAndSay(s);
        }
        // The last string holding the count and say for n
        return s;
    }

    public static String generateCountAndSay(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        // To iterate through string and get the frequency of a continuous digit pattern
        int i = 1;
        while (i < s.length()) {
            // If adjacent characters are same increment the count
            if (s.charAt(i - 1) == s.charAt(i)) {
                count++;
            }
            // If adjacent characters are different then append the count first followed by the corresponding character
            else {
                sb.append(count);
                sb.append(s.charAt(i - 1));
                // Reseting the count for the new number continous pattern
                count = 1;
            }
            i++;
        }
        // After completing the loop, adding the count for the last character and the last character itself.
        sb.append(count);
        sb.append(s.charAt(i - 1));
        return sb.toString();
    }

    public static String stringHash(String s, int k) {
        StringBuilder sb = new StringBuilder();
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i<s.length(); i+=k){
            substrings.add(s.substring(i, i + k));
        }
        for (String subStr: substrings){
            int sum = 0;
            for (int i = 0; i<subStr.length(); i++){
                int currCharAscii = subStr.charAt(i) - 'a';
                sum += currCharAscii;
            }
            int rem = sum%26;
            char hashedChar = (char) (rem + 'a');
            sb.append(hashedChar);
        }
        return sb.toString();
    }

    public static String stringHash2(String s, int k) {
        StringBuilder sb = new StringBuilder();
        List<String> substrings = new ArrayList<>();
        int n = s.length();
        for (int j = 0; j<n; j+=k){
            int sum = 0;
            for (int i = j; i<j+k; i++){
                sum += s.charAt(i);
            }
            int rem = sum%26;
            sb.append((char) (rem + 'a'));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(5));
        System.out.println(stringHash2("abcd", 2));
    }

}
