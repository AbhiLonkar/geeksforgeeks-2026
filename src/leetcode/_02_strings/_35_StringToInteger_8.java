package leetcode._02_strings;

public class _35_StringToInteger_8 {
    // TODO - Given a string of size upto 200 we have to convert this string into an integer
    //  The string may contain whitespaces, leading zeros or letters(a-z)

    // ? Approach Let's try to solve for normal numeric strings
    public static int stringToInteger(String str) {
        if (str == null || str.isEmpty()){
            return 0;
        }
        long res = 0;
        int start = 0;
        int n = str.length();
        boolean isMinus = false;
        while (start < n && str.charAt(start) == ' ') {
            start++;
        }
        if (start < n && (str.charAt(start)=='-' || str.charAt(start) == '+')){
            isMinus = str.charAt(start) == '-';
            start++;
        }
        while (start < n && Character.isDigit(str.charAt(start))){
            int currDigit = str.charAt(start) - '0';
            res = res * 10 + currDigit;
            if (!isMinus && res > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            else if (isMinus && res >= (long) Integer.MAX_VALUE + 1){
                return Integer.MIN_VALUE;
            }
            start++;
        }
        return (int) (isMinus ? -1 * res : res);
    }

    public static void main(String[] args) {
        System.out.println(stringToInteger(" "));
    }
}
