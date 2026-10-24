package leetcode._12_math;

import java.util.ArrayList;
import java.util.Arrays;

public class _29_IsSumOfPowersOfThree_1780 {
    // TODO - Given a number return true if its a sum of powers of 3 else false
    // ! Note - The powers must be distinct
    // Last power ought to be 14 since we're dealing with a range of 1 <= n <= 10^7 and 3^15 is 14 mill but we need less than 10 mill
    // System.out.println((Math.pow(3, 15)));
    //  ex. 12 -> 3^1 + 3^2 = 12

    // ? Approach - First lets find the closest power
    // ! Right now we need to make sure that we don't use the same power
    // ! We'll keep track of the previous closest power
    public static int closestPower(int n, int previousClosestPower){
        int pow = 0;
        while (pow < previousClosestPower && Math.pow(3, pow) <= n){
            pow++;
        }
        return pow-1;
    }

    public static boolean checkPowersOfThree(int n){
        int previousClosestPower = 14;
        while (n > 0){
            int closestPow = closestPower(n, previousClosestPower);
            if (closestPow < 0) return false;
            previousClosestPower = closestPow - 1;
            n = n - (int) Math.pow(3, closestPow);
        }
        return n == 0;
    }


    public static void main(String[] args) {
        System.out.println(checkPowersOfThree(9));
    }
}
