package leetcode._12_math;

public class _21_UglyNum {
    // The problem asks you tell if the given number is ugly or not.
    // A number is ugly iff it's factors are - 2, 3 & 5
    // 6 = 2x3, 15 = 3x5, 30, 2x3x5 ugly
    // 7 = 1x7 not ugly

    // Approach First check if the number is a multiple of 2, 3 or 5 then repeatedly divide the num by 2, 3 and 5 if its divisible
    // and at the end if we get 1 it means that it was divisible
    public static boolean UglyNum(int n) {
        if (n == 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }
        while (n % 3 == 0) {
            n = n / 3;
        }
        while (n % 5 == 0) {
            n = n / 5;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        System.out.println(UglyNum(30));
    }
}
