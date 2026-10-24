package leetcode._12_math;

public class _31_TrailingZeroesFactorial_172 {
    // TODO - Given a number we have to find the number of trailing zeros in its factorial

    // ? Brute approach - Find the factorial and count the number of trailing zeros
    // ? The time complexity will be O(N) length of the number
    // ? There will be integer overflow with this approach - since we're dealing with n <= 10^4
    public static int findFactorial(int n){
        if (n == 1){
            return 1;
        }
        return n * findFactorial(n-1);
    }

    public static int numberOfTrailingZeros(int n){
        n = findFactorial(n);
        int count = 0;
        while (n%10==0){
            n = n/10;
            count++;
        }
        return count;
    }

    // So we mustn't resolve to factorial calculations
    // How to solve - Observed that the count of zero depends on how many times 5 occurs in its factorial representation
    // ex. 6 -> 6*5*4*3*2*1 -> 720 -> 1 zero 1 time 5
    // ex. 10 -> (5*2)*9*8*7*6*5*4*3*2*1 -> 3628800 -> 2 trailing 0 & 2 times 5

    // * So this problem can be solved by simply counting the number of 5 occurrences
    public static int trailingZeroesFactorial(int n){
        int count = 0;
        for (int i = 5; i<=n; i=i*5){
            count += n/i;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(trailingZeroesFactorial(20));
    }
}
