package leetcode._02_strings;

public class _01_ValidPalindrome_125 {
    // TODO - Given a sentence we have to tell if the sentence is a palindrome or not
    // ex. s = "A man, a plan, a canal: Panama" o/p -> "amanaplanacanalpanama" is a palindrome so true

    // Easy part - Check if a string is palindrome or not
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            // if currCharacter isn't valid go forward
            if (!Character.isLetterOrDigit(str.charAt(start))) {
                start++;
            }
            // if currCharacter isn't valid go backward
            else if (!Character.isLetterOrDigit(str.charAt(end))) {
                end--;
            } else if (Character.toLowerCase(str.charAt(start)) == Character.toLowerCase(str.charAt(end))) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }


    // Difficult part - Converting a sentence into a valid string ie without symbols
    // there's also a method - Character.isLetterOrDigit(ch)
    public static String stringConverter(String str) {
        str = str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        char[] validCharacters = new char[36];
        for (int i = 0; i < 26; i++) {
            validCharacters[i] = (char) (i + 'a');
        }
        for (int i = 0; i < 10; i++) {
            validCharacters[26 + i] = (char) (i + '0');
        }
        for (int i = 0; i < str.length(); i++) {
            if (isPresent(validCharacters, str.charAt(i))) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static boolean isPresent(char[] chArray, char target) {
        for (char c : chArray) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(".,"));
    }

}
