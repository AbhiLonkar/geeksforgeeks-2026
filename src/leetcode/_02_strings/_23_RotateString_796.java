package leetcode._02_strings;

import java.util.Arrays;

public class _23_RotateString_796 {
    // TODO - Given a string s and a goal return true if after rotating s, it becomes equal to goal
    public static boolean isValid(String s, String goal){
        if (s.length() != goal.length()){
            return false;
        }
        if (s.equals(goal)){
            return true;
        }
        char[] tempString = s.toCharArray();
        rotate(tempString);
        while (!Arrays.equals(tempString, s.toCharArray())){
            if (Arrays.equals(tempString, goal.toCharArray())){
                return true;
            }
            rotate(tempString);
        }
        return false;
    }
    public static void rotate(char[] ch){
        char temp = ch[0];
        for (int i = 1; i<ch.length; i++){
            ch[i-1] = ch[i];
        }
        ch[ch.length-1] = temp;
    }

    public static boolean isValidOpt(String s, String goal){
        return s.length() == goal.length() && (s+s).contains(goal);
    }

    public static void main(String[] args) {
        System.out.println(isValid("abcde", "abced"));
    }
}
