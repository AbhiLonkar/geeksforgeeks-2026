public class LcMath_UglyNumberIIIScratch {
    public static int GCD(long dividend, long divisor) {
        while (dividend % divisor != 0) {
            long remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        return (int) divisor;
    }

    public static int LCM(int n1, int n2) {
        return (n1 * n2) / GCD(n1, n2);
    }

    private static long count(long x, int a, int b, int c) {
        return x / a + x / b + x / c
                - x / lcm(a, b) - x / lcm(b, c) - x / lcm(a, c)
                + x / lcm(a, lcm(b, c));
    }

    // ! Why do we need lcm?
    // * We need lcm to remove duplicate multiples of ab, ac, bc which changes the count in general
    // ex. to find 8th num for 2,3,5. So 4 numbers from 2, 2 from 3 and 5 from 1 so total count = 4+2+1 = 6
    // But there's a duplicate - 6 which is lcm of 2 & 3, so we need to remove 6 from the count.
    private static long lcm(long x, long y) {
        return x / GCD(x, y) * y;
    }

    // ? Approach 1 - So lets try to find if a number is divisible by a or b or c
    public static int nthUglyNumber(int n, int a, int b, int c) {
        long left = 1, right = 2_000_000_000; // Search range
        while (left < right) {
            long mid = left + (right - left) / 2;
            if (count(mid, a, b, c) < n) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return (int) left;
    }
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(8, 2, 5, 6));
    }
}