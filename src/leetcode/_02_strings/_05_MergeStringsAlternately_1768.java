package leetcode._02_strings;

public class _05_MergeStringsAlternately_1768 {
    // TODO - Given 2 strings we have merge these two alternatively
    // ex. s1 = "ABC", s2 = "XYZ" o/p -> "AXBYCZ"
    // ex. s1 = "ABC", s2 = "LMNOP" o/p -> "ALBMCNOP"

    // ? Approach - We'll keep 2 pointers to iterate through both the strings
    // ? We'll use a stringbuilder to store these alternative s1.charAt(i1) & s2.charAt(i2)

    public static String mergeStrings(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int i1 = 0, i2 = 0;
        // Lets try to write it for equal length strings first
        while (i1 < s1.length() || i2<s2.length()){
            if (i1<s1.length()){
                sb.append(s1.charAt(i1));
                i1++;
            }
            if (i2<s2.length()){
                sb.append(s2.charAt(i2));
                i2++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeStrings("ABC", "LMNOP"));
    }
}
