package leetcode._08_backtracking;

import java.util.ArrayList;
import java.util.List;

public class _01_GenerateParenthesis_22 {
    // TODO - Given an integer n we have to generate n pair of valid parenthesis
    // ex. if n = 3, we have to use 3 parenthesis pairs in such a way that we generate all the valid combinations of parenthesis
    // o/p -> ["((()))","(()())","(())()","()(())","()()()"]

    // ? Approach - We'll solve this using backtracking
    // ? Keep a track of the number of open and close parenthesis you have inserted to generate a valid parenthesis
    // ? You can add n number of open and close parenthesis. ex. n = 3 means we'll have 3 open and 3 close parenthesis

    // * Conditions
    // 1. When openCount < n we can add open parenthesis and increment openCount
    // 2. When closeCount < openCount we can add close parenthesis and increment closeCount
    // 3. When openCount == closeCount == n we can add the generated parenthesis to the result array

    public static void backtrack(List<String> res, StringBuilder sb, int openCount, int closeCount, int n){
        if (openCount == closeCount && openCount == n){
            res.add(sb.toString());
            return;
        }
        if (openCount < n){
            sb.append("(");
            // We added an open brace so we need to incremenet openCount
            backtrack(res, sb, openCount+1, closeCount, n);
            sb.deleteCharAt(sb.length()-1);
        }
        if (closeCount < openCount){
            sb.append(")");
            // We added a close brace so we need to incremenet closeCount
            backtrack(res, sb, openCount, closeCount+1, n);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void generateParenthesis(int n){
        List<String> res = new ArrayList<>();
        backtrack(res, new StringBuilder(), 0, 0, n);
        System.out.println(res);
    }

    public static void main(String[] args) {
        generateParenthesis(3);
    }
}
