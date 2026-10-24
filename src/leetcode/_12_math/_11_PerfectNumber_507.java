package leetcode._12_math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _11_PerfectNumber_507 {
    // TODO - A number is said to be perfect when the sum of its divisors is equal to the number.
    // The number itself shouldn't be considered in the sum.
    // ex. 28 - 1,2,4,7,14 their sum is 28 so true
    // ex. 8 - 1,2,4 their sum is 7 so false

    // ? First try to find the divisors of a number
    public static boolean isPerfectNumber(int n){
        int divisorSum = 1;
        for (int i = 2; i<Math.sqrt(n); i++ ){
            if (n%i==0){
                divisorSum = divisorSum + i + n/i;
            }
        }
        return divisorSum == n;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(19));
    }
}
