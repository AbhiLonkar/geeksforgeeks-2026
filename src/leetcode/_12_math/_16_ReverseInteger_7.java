package leetcode._12_math;

public class _16_ReverseInteger_7 {
    public static int ReverseInteger(int n) {
        // V1. Went with the traditional approach of reversing a number
        // Made sure if the number is negative to add minus sign at the end
        // But many unnecessary memory usage.

        int temp = Math.abs(n);
        int res = 0;
        while (temp > 0) {
            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int remainder = temp % 10;
            res = res * 10 + remainder;
            temp = temp / 10;
        }
        if (n < 0) {
            return -1 * res;
        }
        return res;
    }

    // Optimizations - Can eliminate minus condition if I just iterate until number becomes zero
    // Division & Modulo has no effect on the sign of a number
    public static int ReverseIntegerOptimized(int n) {
        int res = 0;
        while (n != 0) {
            if (res < Integer.MIN_VALUE / 10 || res > Integer.MAX_VALUE / 10) {
                return 0;
            }
            int remainder = n % 10;
            res = res * 10 + remainder;
            n = n / 10;
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(ReverseInteger(-120));
        System.out.println(ReverseIntegerOptimized(-123));
    }
}

