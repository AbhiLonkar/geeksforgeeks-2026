package leetcode._02_strings;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class _12_ValidParenthesis_20 {
    // TODO - Given a parenthesis string, we have to find whether the parenthesis are valid.
    // TODO - A parenthesis is valid if it is opened and closed properly
    // ex. [({})] - is valid
    // ex. [(]) - invalid

    // ? Approach - We'll keep track of the available bracket using stack
    // ? When we encounter a bracket we check if it exists at the first position, if it does then we remove that bracket
    // ? Else we add the bracket to the top of the stack

    // The code seems to be running slower
    public static boolean isValidParenthesis(String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                // Assume that I encountered a closing bracket but the stack is empty then I simply return false
                if (st.isEmpty()) {
                    return false;
                }
                if (ch == ')' && st.peek() == '(' || ch == ']' && st.peek() == '[' || ch == '}' && st.peek() == '{') {
                    st.pop();
                }
                // If the top of the stack opening bracket doesn't match the ch means we've found a mismatch
                // Why? ex. {([)]} is invalid because at 2 pos we pushed [ but when a closing bracket is encountered it isn't ] so we return false
                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValidParenthesis("()[]{}"));
    }

}


//char[] stack = new char[s.length()];
//int curr = -1;
//        for(char ch : s.toCharArray()) {
//        if (ch == '(' || ch == '{' || ch == '[') {
//stack[++curr] = ch;
//            } else {
//                    if (curr == -1) return false;
//        if (ch == ')' && stack[curr] != '(') return false;
//        if (ch == '}' && stack[curr] != '{') return false;
//        if (ch == ']' && stack[curr] != '[') return false;
//        --curr;
//            }
//                    }
//                    return curr == -1;