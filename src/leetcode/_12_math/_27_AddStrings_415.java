package leetcode._12_math;

public class _27_AddStrings_415 {
    // TODO - Given 2 numbers in the form of strings we have to add them and return result in the form of a string as well
    // ex. "111" "222" -> "333"
    // ex. "12" "123" -> "135"
    // ex. "89" "11" -> "100"

    public static StringBuilder addString(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        for (int i1 = n1 - 1, i2 = n2 - 1; i1 >= 0 || i2 >= 0; i1--, i2--) {
            int s1Num = i1 >= 0 ? s1.charAt(i1) - '0' : 0;
            int s2Num = i2 >= 0 ? s2.charAt(i2) - '0' : 0;
            int addition = carry + s1Num + s2Num;
            if (addition > 9) {
                carry = addition / 10;
                addition = addition % 10;
            } else {
                carry = 0;
            }
            ans.insert(0, addition);
        }
        if (carry != 0) {
            ans.insert(0, carry);
        }
        return ans;
    }

    // * Cleaner code
    public static String addStringOptimized(String s1, String s2) {
        int i1 = s1.length() - 1;
        int i2 = s2.length() - 1;
        int carry = 0;
        StringBuilder ans = new StringBuilder();
        while (i1 >= 0 || i2 >= 0 || carry > 0) {
            int s1Num = i1 >= 0 ? s1.charAt(i1) - '0' : 0;
            int s2Num = i2 >= 0 ? s2.charAt(i2) - '0' : 0;
            int addition = s1Num + s2Num + carry;
            ans.append(addition%10);
            carry = addition/10;
            i1--;
            i2--;
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(199 + 332345);
        System.out.println(addStringOptimized("199", "332345"));
    }
}
