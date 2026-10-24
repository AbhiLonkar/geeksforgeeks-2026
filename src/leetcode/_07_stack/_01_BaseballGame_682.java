package leetcode._07_stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _01_BaseballGame_682 {
    // TODO - Given a string array, we only have the following entries in it
    // "Integer" -> Add it to the result array. A new entry.
    // "C" -> Remove the previous score
    // "D" -> Double the previous score and add it
    // "+" -> Add a new score which is sum of the previous 2 scores

    public static int baseballGame(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for (String s : arr) {
            if (s.equals("D")) {
                int d = st.peek() * 2;
                st.push(d);
            } else if (s.equals("C")) {
                st.pop();
            } else if (s.equals("+")) {
                int sum = st.peek() + st.get(st.size() - 2);
                st.push(sum);
            } else {
                st.push(Integer.valueOf(s));
            }
        }
        int score = 0;
        for (int i : st) {
            score += i;
        }
        return score;
    }

    public static void main(String[] args) {
        System.out.println(baseballGame(new String[]{"1","C"}));
    }

}
