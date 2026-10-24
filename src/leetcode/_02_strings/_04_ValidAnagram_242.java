package leetcode._02_strings;

public class _04_ValidAnagram_242 {
    // TODO - Given 2 strings s1 and s2 return true if s2 is an angram of s1
    // ex. s1 = "anagram" s2 = "nagaram" o/p -> true
    // ex. s1 = "rat" s2 = "car" o/p -> false

    // ? Approach - Keep track of the count of the characters, for every occurence of ch in s1 increment its count in the array
    // ? And for every occurrence of ch in s2 decrement the count
    // ? If at the end we get a zero array it means its a anagram else it isn't.
    // ? If two strings have different lengths then they aren't anagrams anyways

    public static boolean isAnagram(String s1, String s2){
        int[] count = new int[26];
        if (s1.length() != s2.length()){
            return false;
        }
        for (int i = 0; i<s1.length(); i++){
            int s1CharIdx = s1.charAt(i) - 'a';
            count[s1CharIdx]++;
            int s2CharIdx = s2.charAt(i) - 'a';
            count[s2CharIdx]--;
        }
        for (int i: count){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isAnagram("damage", "musket"));
    }

}
