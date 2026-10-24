package leetcode._02_strings;

public class _17_FindTheDifference_389 {
    // TODO - Given 2 strings s & t, t is formed by shuffling letters of s and adding an extra letter
    // TODO - Find that extra letter

    // ? We'll create a count array for s, then we'll traverse t and for every occurrence we'll decrement countArray value,
    // ? but first we'll check if its greater than 0, then we'll decrement the value but if its already 0 we'll return the curr Char in t

    public static char findTheDifference(String s, String t){
        int[] countsArray = new int[26];
        for (char ch: s.toCharArray()){
            int currCharPos = ch-'a';
            countsArray[currCharPos]++;
        }
        for (char ch: t.toCharArray()){
            int currCharPos = ch-'a';
            if (countsArray[currCharPos]>0){
                countsArray[currCharPos]--;
            }
            else {
                return ch;
            }
        }
        return 'x';
    }

    // ? Using the xor property,
    // ? We know that same numbers cancel each other we'll use that fact to find the extra letter
    public static char findTheDifferenceXOR(String s, String t){
        char extraChar = 0;
        for (char ch: s.toCharArray()){
            extraChar ^= ch;
        }
        for (char ch: t.toCharArray()){
            extraChar ^= ch;
        }
        return extraChar;
    }
    public static void main(String[] args) {
        System.out.println(findTheDifferenceXOR("abcde", "dafbce"));
    }
}
