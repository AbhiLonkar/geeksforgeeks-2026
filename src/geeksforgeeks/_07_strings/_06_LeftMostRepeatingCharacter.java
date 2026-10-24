package geeksforgeeks._07_strings;

// ! Important tip - Whenever dealing with count for strings always try to make count array with indices as ASCII values

public class _06_LeftMostRepeatingCharacter {
    // TODO - Given a string we have to find the character which appears more than 1 time and it should as much on the leftside of the string as possible
    // TODO Return the index of the character
    // ex. geeksforgeeks, g is the leftmost character which repeats
    // e appears after g so it isn't considered
    // ex. abbdd, b is the leftmost repeating character

    // ? Approach - Double for loop
    // * Time - O(n2) and space O(1)
    public static int leftMostRepeatingCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return i;
                }
            }
        }
        return -1;
    }

    // * Time - O(n) and space O(256)
    public static int leftMostRepeatingCharacterArray(String str) {
        // Populate the array
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            int charPos = str.charAt(i);
            count[charPos]++;
        }
        for (int i = 0; i < str.length(); i++) {
            int currCharPos = str.charAt(i) - 'a';
            if (count[currCharPos] > 1) {
                return i;
            }
        }
        return -1;
    }

    // ? Using a boolean array we start traversing the string from the right keeping a track if we have already visited the character
    // ? On the first visit we mark its ascii position in the boolean array as true
    // ? When we encounter it again we update the result
    // * Time - O(n) Space O(256)
    public static int leftMostRepeatingCharacterBool(String str) {
        boolean[] isVisited = new boolean[256];
        int resIdx = Integer.MAX_VALUE;
        for (int i = str.length() - 1; i >= 0; i--) {
            int charPos = str.charAt(i);
            if (isVisited[charPos]) {
                resIdx = Math.min(resIdx, i);
            } else {
                isVisited[charPos] = true;
            }
        }
        return resIdx == Integer.MAX_VALUE ? -1 : resIdx;
    }

    public static void main(String[] args) {
        System.out.println(leftMostRepeatingCharacterBool("GEEKSFORGEEKS"));
    }
}
