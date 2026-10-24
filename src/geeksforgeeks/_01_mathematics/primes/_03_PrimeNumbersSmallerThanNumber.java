package geeksforgeeks._01_mathematics.primes;

import java.util.Arrays;
public class _03_PrimeNumbersSmallerThanNumber {
    public static boolean[] sieveOfEratosthenes(int n) {
        // Create a boolean array and initialize all entries as true
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime numbers
        isPrime[0] = false;
        isPrime[1] = false;

        // Start marking from the first prime number, which is 2
        for (int p = 2; p * p <= n; p++) { //This loop identifies prime numbers up to the square root of n.
            // If isPrime[p] is still true, then p is a prime number
            if (isPrime[p]) {
                // Mark all multiples of p as false
                for (int i = p * p; i <= n; i += p) { // This loop marks multiples of the current prime number p as non-prime.
                    isPrime[i] = false;
                }
            }
        }

        return isPrime;
    }



    public static void main(String[] args) {
        int n = 30; // Find all primes up to 30
        boolean[] isPrime = sieveOfEratosthenes(n);

        // Print the prime numbers
        System.out.println("Prime numbers up to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
