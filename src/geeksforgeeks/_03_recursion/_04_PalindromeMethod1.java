package geeksforgeeks._03_recursion;

import java.util.Objects;

public class _04_PalindromeMethod1 {
    static StringBuilder reverseStr = new StringBuilder();
    public static StringBuilder ReversedString(String str, int len){
        if(len==0){
            return reverseStr;
        }
        reverseStr.append(str.charAt(len-1));
        return ReversedString(str, len-1);
    }
    public static boolean Check(String s){
        ReversedString(s, s.length());
        return Objects.equals(s, reverseStr.toString());
    }
    public static void main(String[] args) {
        System.out.println(Check("1234321"));
    }
}
