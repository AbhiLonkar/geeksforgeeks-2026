package leetcode._12_math;

import java.util.*;

public class _23_UglyNumber_264 {
    // TODO - Given n, a, b, c we have to find the nth number whose prime factors are only 2 or 3 or 5
    // * Meaning 2 3 and 5 must divide it
    // ex. n = 10, ugly numbers are [1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 14, 15, 16] so the 10th ugly number is 12

    // ? Approach 1 - We'll set a dividend and a counter, dividend will increment when its divisible by any of the divisors
    // ? If at any point counter == n we return the dividend
    // ! TLE for below approach
    public static int nthUglyNumber(int n) {
        if (n == 1) {
            return 1;
        }
        int dividend = 2;
        int counter = 1;
        while (true) {
            int tempDividend = dividend;
            // keep halving the dividend until it is no longer divisible by 2.
            while (tempDividend % 2 == 0) { // divisible by 2
                tempDividend = tempDividend / 2;
            }
            while (tempDividend % 3 == 0) {
                tempDividend = tempDividend / 3;
            }
            while (tempDividend % 5 == 0) {
                tempDividend = tempDividend / 5;
            }
            if (tempDividend == 1) {
                counter++;
                if (counter == n) {
                    return dividend;
                }
            }
            dividend++;
        }
    }

    // ? Approach 2 - Let's try the sieve approach.
    // ? We use 3 pointers, each of these pointer represent multiple of 2, 3 and 5
    // ? So when we multiply element at pos i with 2 or 3 or 5 we pick the least the result we got after multiply
    // ? And whichever factor product that least multiple we move its pointer forward by 1 position
    // ? Also, when two pointers produce the same result - 2*3 and 3*2 - then we move both 2 and 3 pointers forward

    public static int nthUglyNumberSieve(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        // Initially the pointers will be at first element
        // The pointers indicate to multiply by what
        int i2 = 0; // Multiply by 2
        int i3 = 0; // Multiply by 3
        int i5 = 0; // Multiply by 5
        for (int i = 1; i < n; i++) {
            // Find the minimum ugly num and putting it at ith position
            // * We use minimum because the nextUglyNum should be inserted in an increasing order
            int nextUglyNum = Math.min(arr[i2] * 2, Math.min(arr[i3] * 3, arr[i5] * 5));
            arr[i] = nextUglyNum;
            // Moving the pointers
            // ! if chain because there can exist a nextUglyNum which is a multiple of more than 1 pointer and factor so we need to move both pointers
            // If the nextUglyNum we got is a multiple of 2 and element at i2 pointer we move i2 pointer
            if (nextUglyNum == arr[i2] * 2) {
                i2++;
            }
            // If the nextUglyNum we got is a multiple of 3 and element at i3 pointer we move i3 pointer
            if (nextUglyNum == arr[i3] * 3) {
                i3++;
            }
            // If the nextUglyNum we got is a multiple of 5 and element at i5 pointer we move i5 pointer
            if (nextUglyNum == arr[i5] * 5) {
                i5++;
            }
        }
        return arr[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumberSieve(1300));
    }

}
