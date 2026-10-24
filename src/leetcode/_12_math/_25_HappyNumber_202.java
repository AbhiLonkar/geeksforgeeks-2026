package leetcode._12_math;

import java.util.HashSet;
import java.util.Set;

public class _25_HappyNumber_202 {
    // TODO - Given a number we have to determine whether its happy or not
    // A number is happy if the sum of the square of its digits is 1
    // Note - We have to repeat this process till we get a single digit number
    // If this single digit number is 1 then we return true, if it isn't then we return false

    // Lets write a function to extract individual digits
    public static int generateSquareOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            sum += lastDigit * lastDigit;
            n = n / 10;
        }
        return sum;
    }

    public static boolean isHappyNumber(int res) {
        Set<Integer> seen = new HashSet<>();
        while (res != 1 && !seen.contains(res)) {
            seen.add(res);
            res = generateSquareOfDigits(res);
        }
        return res == 1;
    }

    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
    }

}
