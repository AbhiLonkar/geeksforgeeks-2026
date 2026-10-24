package leetcode._02_strings;

public class _09_FirstUniqueChar_387 {
    // TODO - Given a string we have to return the first character which doesn't repeat
    // ex. leetcode, l is the first non repeating character, o/p -> 0
    // ex. loveleetcode, v is the first non repeating character, o/p -> 2
    // ex. aabb, -1 since every character is repeating

    // ? Approach 1 - We'll use two for loops
    // * Time - O(n2) and space - O(1)
    public static char firstUniqueChar(String s){
        for (int i = 0; i<s.length(); i++){
            boolean isRepeating = false;
            for (int j = 0; j<s.length(); j++){
                if (j==i){
                    continue;
                }
                if (s.charAt(i) == s.charAt(j)){
                    isRepeating = true;
                    break;
                }
            }
            if (!isRepeating) {
                return s.charAt(i);
            }
        }
        return 'X';
    }

    // ? Approach 2 - We'll use a count array
    public static int firstUniqueCharOpt(String s){
        int[] count = new int[26];
        for (int i = 0; i<s.length(); i++){
            int currCharPos = s.charAt(i) - 'a';
            count[currCharPos]++;
        }
        for (int i = 0; i<s.length(); i++){
            int currCharPos = s.charAt(i) - 'a';
            if (count[currCharPos]==1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqueCharOpt("loveleetcode"));
    }
}
