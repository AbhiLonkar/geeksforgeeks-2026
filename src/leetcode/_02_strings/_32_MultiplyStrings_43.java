package leetcode._02_strings;

public class _32_MultiplyStrings_43 {
    // TODO - Given 2 numeric strings, we have to multiply them and return the result in the form of a string
    // ex. num1 = "123", num2 = "456" o/p -> "56088"
    // ex. num1 = "2" num2 = "3" o/p -> "6"

    // ? Approach - Let's first try to extract the numeric values from the strings
    public static String multiplyStrings(String n1, String n2) {
        int l1 = n1.length();
        int l2 = n2.length();
        int[] multiplicationResult = new int[l1 + l2];
        for (int i = l1-1; i>=0; i--){
            for (int j = l2-1; j>=0; j--){
                int d1 = n1.charAt(i) - '0';
                int d2 = n2.charAt(j) - '0';
                int unitsPlace = i + j + 1;
                int carryPos = i + j;

                int mul = d1 * d2;

                int sum = mul + multiplicationResult[unitsPlace];
                multiplicationResult[unitsPlace] = sum % 10;
                multiplicationResult[carryPos] += sum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int digit: multiplicationResult){
            // if the stringbuilder is empty we cannot add leading zeros because if we do our result will look like "002312"
            // But we can add 0's in between ex 5010
            if (!(sb.isEmpty() && digit == 0)){
                sb.append(digit);
            }
        }

        return sb.isEmpty() ? "0" : sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(multiplyStrings("12", "11"));
    }

}
