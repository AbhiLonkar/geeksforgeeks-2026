package leetcode._02_strings;

public class _03_LengthOfLastWord_58 {
    // TODO - Given a string sentence we have to return the length of the last word.
    // ex. Hello World - length of last word is 5
    // ex. "   fly me   to   the moon  " - length of last word is 4

    // ? Approach - We'll keep 2 pointers, i1 & i2, i2 will start from the string end, we'll keep decrementing i2 till we find a letter
    // ? Once we find a letter we'll start a new pointer i1 from this i2, we'll keep decrementing i1 till we find a space,
    // ? then we simply calculate i2 - i1 + 1, and thats the length of the last word

    public static int lengthOfLastWord(String s1) {
        if (s1.length() == 1) {
            return 1;
        }
        int i2 = s1.length() - 1;
        while (s1.charAt(i2) == ' ') {
            i2--;
        }
        int i1 = i2;
        while (i1 > 0 && s1.charAt(i1 - 1) != ' ') {
            i1--;
        }
        return i2 - i1 + 1;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("day"));
    }

}
