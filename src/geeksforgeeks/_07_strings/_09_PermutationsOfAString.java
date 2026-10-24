package geeksforgeeks._07_strings;

public class _09_PermutationsOfAString {
    // TODO - Given a string we have to print all the permutations of it
    // ex. "ABC" -> ABC, ACB, BAC, BCA, CAB, CBA
    // Number of permutations generated -> n!

    // ? Approach - Using a for loop we'll choose each character in the string
    // ? For every character chosen we'll add it to the answer
    // ? Now we have a part on its left and a part on its right, we then join these 2 parts
    // ? Call recursively on this remaining part, we then choose each character of this remaining part
    // ? Again for every character chosen we'll add it to the answer, and form remaining part string
    // ? When the length of the remaining part of the string becomes 0 means we have added all the characters from the string to the answer.
    // ? Then we move on to the next character in the og for loop

    // ex. "AB"
    // for i = 0, ans = "", currentChar = "A", remaining string = "B", ans = ans+currentChar = "A"
    //           Next recursive call on remaining string ans = "A", currentChar = "B", remaining string = "", ans = ans+currentChar = "AB"
    //           Since remaining string length = 0, we print ans -> "AB"
    // for i = 1, ans = "", currentChar = "B", remaining string = "A", ans = ans+currentChar = "B"
    //           Next recursive call on remaining string ans = "B", currentChar = "A", remaining string = "", ans = ans+currentChar = "BA"
    //           Since remaining string length = 0, we print ans -> "BA"


    public static void printPermutations(String s1, String ans){
        if (s1.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i<s1.length(); i++){
            char currentChar = s1.charAt(i);
            String leftToChar = s1.substring(0, i);
            String rightToChar = s1.substring(i+1);
            String remainingString = leftToChar + rightToChar;
            printPermutations(remainingString, ans+currentChar);
        }
    }

    public static void main(String[] args) {
        printPermutations("ABC", "");
    }
}
