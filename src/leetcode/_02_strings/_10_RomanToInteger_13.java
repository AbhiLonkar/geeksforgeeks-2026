package leetcode._02_strings;

import java.util.HashMap;

public class _10_RomanToInteger_13 {
    // TODO - Given a roman string we have to find the numerical equivalent
    // ex. III => 3
    // ex. LVIII => 58
    // ex. MCMXCIV => 1994

    public static int romanToInteger(String str) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        int res = 0;
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        for (int i = 0; i < str.length(); i++) {
            int currCharVal = str.charAt(i);
            int nextCharVal = i < str.length() - 1 ? romanMap.get(str.charAt(i + 1)) : 0;
            if ((currCharVal == 'I' && (nextCharVal == 'V' || nextCharVal == 'X')) ||
                    (currCharVal == 'X' && (nextCharVal == 'L' || nextCharVal == 'C')) ||
                    (currCharVal == 'C' && (nextCharVal == 'D' || nextCharVal == 'M'))) {
                int getVal = nextCharVal - currCharVal;
                res += getVal;
                i++;

            } else {
                int getVal = romanMap.get(str.charAt(i));
                res += getVal;
            }
        }
        return res;
    }


    // ? Substraction happens in case of I, X, C
    // ? Approach 2 - Here we'll use switch statement and write better conditions
    // ? Use the facts - Romans are written in increasing order from left to right
    // ? Only exception is when we want to substract previous val from current val
    public static int getIntVal(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static int romanToIntegerOptimized(String s) {
        int result = 0;
        int i, j;
        // Looping until second pointer lies in string s
        for (i = 0, j = 1; j < s.length(); i++, j++) {
            int currCharVal = getIntVal(s.charAt(i));
            int nextCharVal = getIntVal(s.charAt(j));
            // ! Romans are written in increasing order from left to right, if they're not it means we need to substract
            if (currCharVal < nextCharVal) {
                result -= currCharVal;
            } else {
                result += currCharVal;
            }
        }
        // Adding the last character value
        result += getIntVal(s.charAt(i));
        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInteger("LCM"));
    }
}
