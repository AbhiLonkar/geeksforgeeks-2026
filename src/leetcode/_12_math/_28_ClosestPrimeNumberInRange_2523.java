package leetcode._12_math;

import java.util.ArrayList;
import java.util.Arrays;

public class _28_ClosestPrimeNumberInRange_2523 {
    // TODO - Given two positive integers left and right, find the two integers num1 and num2 such that:
    // left <= num1 < num2 <= right. Inclusive both points
    // num1 and num2 are both prime numbers.
    // num2 - num1 is the minimum amongst all other pairs satisfying the above conditions.
    // ex. left = 10, right = 19 Output: [11,13]
    // Explanation: The prime numbers between 10 and 19 are 11, 13, 17, and 19.
    // The closest gap between any pair is 2, which can be achieved by [11,13] or [17,19].
    // Since 11 is smaller than 17, we return the first pair.

    // ? Approach - Lets try using a isPrime method, when we find a prime number we add it to the currRes array, we find the nextPrimeNum
    // ? When found we add it to the currRes, we check the diff between currRes elements and res elements if its smaller then we update res
    // ? If its equal we run a tie breaker and check which has the smaller currElement;

    public static int[] closestPrimeNumInRange(int left, int right) {
        int[] res = {-1, -1};
        int lastPrime = -1;
        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                if (lastPrime != -1) {
                    if (res[0] == -1) {
                        res[0] = lastPrime;
                        res[1] = i;
                    } else if (res[1] - res[0] > i - lastPrime) {
                        res[0] = lastPrime;
                        res[1] = i;
                    }
                }
                lastPrime = i;
            }
        }
        return res;
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // ! Newer optimized version
    // ? We'll be using a sieve to keep track of the primes in the range 2 to right
    // ? Then we'll form a prime numbers array using this seive
    // ? We'll iterate through this sieve, we'll only check the difference between consecutive elements since only consecutive elements can produce the minimum difference
    // ? We'll store the corresponding numbers that produced this minimum difference

    public static boolean[] generateSieve(int range) {
        boolean[] isPrime = new boolean[range + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i <= Math.sqrt(range); i++) {
            if (isPrime[i]) {
                for (int mul = i * i; mul <= range; mul += i) {
                    isPrime[mul] = false;
                }
            }
        }
        return isPrime;
    }

    public static int[] closestPrimeNumberInRangeOptimized(int left, int right) {
        boolean[] sieve = generateSieve(right);
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (sieve[i]) {
                primes.add(i);
            }
        }
        int minDiff = Integer.MAX_VALUE, num1 = -1, num2 = -1;
        for (int i = 1; i<primes.size(); i++){
            int currDiff = primes.get(i) - primes.get(i-1);
            if (currDiff < minDiff){
                minDiff = currDiff;
                num1 = primes.get(i-1);
                num2 = primes.get(i);
            }
        }
        return new int[] {num1, num2};
    }


    public static void main(String[] args) {
        int[] res = closestPrimeNumberInRangeOptimized(5, 15);
        for (int i: res){
            System.out.println(i);
        }
    }
}
