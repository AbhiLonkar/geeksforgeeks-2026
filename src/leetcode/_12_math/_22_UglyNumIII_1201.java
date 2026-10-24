package leetcode._12_math;

import java.util.ArrayList;

public class _22_UglyNumIII_1201 {
    // TODO - Given n, a, b, c we have to return the nth number which is divisible by a or b or c
    // ex. n = 8, a=2, b=5, c=6
    // So the array of numbers which are divisible by a or b or c is - [2,4,5,6,8,10,12,14,15,16,18,20,22,24]
    // The nth number in the above array is 14

    // GCD - The logic for gcd is that until the remainder becomes 0 we keep dividing the divisor from the previous operation with the remainder
    // And the dividend which returns the remainder 0 is our gcd
    // ex. 24 and 36
    // First division - 36/24 gives remainder 12
    // Now since the remainder isn't 0 we perform divisor/remainder - 24/12 = 0
    // So the gcd is 12

    public static long GCD(long dividend, long divisor) {
        while (dividend % divisor != 0) {
            long remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return divisor;
    }

    public static long LCM(long n1, long n2) {
        return (n1 * n2) / GCD(n1, n2);
    }

    public static long count(long rangeCap, long n1, long n2, long n3) {
        long count = rangeCap / n1 + rangeCap / n2 + rangeCap / n3 - rangeCap / LCM(n1, n2) - rangeCap / LCM(n2, n3) - rangeCap / LCM(n1, n3) + rangeCap / LCM(n1, LCM(n2, n3));
        return count;
    }

    public static int nthUglyNumber(int n, int a, int b, int c) {
        long start = 1;
        long end = 2000000000;
        while (start < end) {
            long mid = start + (end - start) / 2;
            if (count(mid, a, b, c) < n) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return (int) start;
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(3,2,3,5));
    }
}
