package leetcode._02_strings;

public class _06_GCDofString_1071 {
    // TODO -Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
    // Essentially we have to find the longest substring that is present in both s1 & s2

    // ? Approach - Let's iterate through both of them, for every occurence of the character in both we increase the count
    // ! Wrong approach
    public static String gcdStringWrong(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        char[] chArray = new char[26];
        for (char ch : s1.toCharArray()) {
            int pos = ch - 'A';
            chArray[pos]++;
        }
        for (char ch : s2.toCharArray()) {
            int pos = ch - 'A';
            if (chArray[pos] > 0) {
                chArray[pos]--;
            } else {
                return "";
            }
        }
        for (char ch : s2.toCharArray()) {
            int pos = ch - 'A';
            if (chArray[pos] > 0) {
                sb.append(ch);
                chArray[pos]--;
            }
        }
        return sb.toString();
    }

    public static String gcdString(String s1, String s2) {
        if (!(s1 + s2).equals(s2 + s1)) {
            return "";
        }
        int gcdLen = gcd(s1.length(), s2.length());
        return s1.substring(0, gcdLen);
    }

    public static int gcd(int dividend, int divisor){
        while (dividend % divisor != 0){
            int rem = dividend % divisor;
            dividend = divisor;
            divisor = rem;
        }
        return divisor;
    }

    public static void main(String[] args) {
        System.out.println(gcdString("ABABABAB", "ABAB"));

    }
}
