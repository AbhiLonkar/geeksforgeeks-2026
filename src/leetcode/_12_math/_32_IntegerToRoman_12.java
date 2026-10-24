package leetcode._12_math;

public class _32_IntegerToRoman_12 {
    // TODO - Given an integer we have to convert it into roman
    // ex. 27 -> "XXVII"
    // ex. 3749 -> "MMMDCCXLIX" -> 1000 + 1000 + 1000 + 500 + 100 + 100 + 40 + 9

    public static String integerToRoman(int n) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (n >= values[i]) {
                sb.append(symbols[i]);
                n -= values[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(integerToRoman(3749));
        ;
    }
}
