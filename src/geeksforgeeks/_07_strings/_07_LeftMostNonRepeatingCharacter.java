package geeksforgeeks._07_strings;

// ! Important tip - Whenever dealing with count for strings always try to make count array with indices as ASCII values

import java.util.Arrays;

public class _07_LeftMostNonRepeatingCharacter {
    // TODO - Given a string we have to find the character which DOES NOT appear more than 1 time and it should as much on the leftside of the string as possible
    // TODO Return the index of the character
    // ex. geeksforgeeks, f is the leftmost character which DOES NOT appear more than once
    // ex. abbdd, a is the leftmost non repeating character
    // ex. apple, a is the leftmost non repeating character

    // ? Approach - Double for loop to check occurence of each character
    // * Time - O(n2) Space - O(1)
    public static int leftMostNonRepeating(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isRepeating = false;
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return i;
            }
        }
        return -1;
    }

    // ? Using an integer array to store character count
    public static int leftMostNonRepeatingOptimized(String str) {
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            int charPos = str.charAt(i);
            count[charPos]++;
        }
        for (int i = 0; i < str.length(); i++) {
            int charPos = str.charAt(i);
            if (count[charPos] == 1) {
                return i;
            }
        }
        return -1;
    }

    // ? Using a negative array. What we'll do is that we'll store the index of the character in the array when it was encountered first time
    // ? When it was encountered second time we make the value at the index(char ascii val) as -2.
    // ? We then traverse the array we'll the find the minimum value which is greater than equal to 0
    // ! Note -1 means not encountered and -2 means encountered more than once.
    //
    public static int leftMostNonRepeatingCharacterOptimized2(String str) {
        int[] charCount = new int[256];
        Arrays.fill(charCount, -1);
        for (int i = 0; i < str.length(); i++) {
            int charAsciiPos = str.charAt(i);
            if (charCount[charAsciiPos] == -1) {
                // We're storing the index of the character from the string into the array at the character's ascii pos
                charCount[charAsciiPos] = i;
            } else {
                charCount[charAsciiPos] = -2;
            }
        }
        int min = Integer.MAX_VALUE;
        for (int j : charCount) {
            if (j >= 0) {
                min = Math.min(min, j);
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }


    public static void main(String[] args) {
        System.out.println(leftMostNonRepeatingCharacterOptimized2("peppapig"));
    }
}
