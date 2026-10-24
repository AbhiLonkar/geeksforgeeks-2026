package leetcode._02_strings;

public class _07_ReverseVowels_345 {
    // TODO - Given a string s, reverse only all the vowels in the string and return it
    // ex. s1 = "IceCreAm" the vowels are [I, e, e, A] so reversing we get -> [A, e, e, I] -> "AceCreIm"
    // ex. s2 = "leetcode" the vowels are [e,e,o,e] so reversing we get -> [e,o,e,e] -> "leotcede"

    // ? Approach - We'll keep 2 pointers, find the left vowel, find the right vowel swap them repeat the process until left and right have crossed each other
    public static boolean isVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'  || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }

    public static void swapChar(StringBuilder s1, int i1, int i2){
        char c = s1.charAt(i1);
        s1.setCharAt(i1, s1.charAt(i2));
        s1.setCharAt(i2, c);
    }


    public static String reverseVowel(String s1) {
        int left = 0, right = s1.length()-1;
        StringBuilder sb = new StringBuilder(s1);
        while (left<=right){
            if (!isVowel(s1.charAt(left))) {
                left++;
            }
            else if (!isVowel(s1.charAt(right))){
                right--;
            }
            else if (isVowel(s1.charAt(left)) && isVowel(s1.charAt(right))) {
                swapChar(sb, left, right);
                left++;
                right--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowel("program"));
    }
}
