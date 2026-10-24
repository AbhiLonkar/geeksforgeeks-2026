package leetcode._12_math;

import java.util.Arrays;

public class _18_SpecialNums {
    // In this we have to return how many numbers between l & r are not beautiful.
    // A number is said to be beautiful if it has exactly 2 divisors besides the number itself.
    // ex. 4 is beautiful because it has only 2 factors besides itself ie 1,2
    // ex. 7 & 6 aren't beautiful because factors - 1 & 1,2,3 besides the number itself.

    // Approach 1 - Let's directly divide the number each time and increment the count whenever we find a divisor.
    // If the countOfDivisors exceeds 2 while dividing we stop because we've determined it already is not special
    // Now only for the numbers which don't have the countOfDivisors != 2 we can add them into the result as not special numbers.
    // Time limit exceeded on the code - Since in the worst case of number 'r', if it's prime the algo will keep dividing until a number less than 'r'.
    // Time complexity - O(n2)
    public static int BeautifulPairs1(int l, int r) {
        int res = 0;
        int currNum;
        for (currNum = l; currNum <= r; currNum++) {
            int countOfDivisors = 0;
            for (int i = 1; i < currNum; i++) {
                if (currNum % i == 0) {
                    countOfDivisors++;
                }
                if (countOfDivisors > 2) {
                    break;
                }
            }
            if (countOfDivisors != 2) {
                res++;
            }
        }
        return res;

    }

    // Approach 2
    // Through observations discovered that in the provided range only those numbers were special which were squares of prime numbers.
    // ex. In the range - [4,10]
    // 4,5,6,7,8,9,10 - 4 special (2^2) & 9 special (3^2)
    // 25 will also be special because (5^2)
    public static int BeautifulPairs2(int l, int r) {
        int sqrtR = (int) Math.sqrt(r);
        boolean[] isPrimeSieve = new boolean[sqrtR + 1];
        Arrays.fill(isPrimeSieve, true);
        isPrimeSieve[0] = false;
        isPrimeSieve[1] = false;

        for (int index = 2; index <= sqrtR; index++) {
            if (isPrimeSieve[index]) {
                // Marking the multiples of index as false
                for (int mul = index * index; mul <= sqrtR; mul += index) {
                    isPrimeSieve[mul] = false;
                }
            }
        }
        // Outputting the sieve to check what it looks like.
//        for (int i = 2; i < isPrimeSieve.length; i++) {
//            if (isPrimeSieve[i]) {
//                System.out.println(i);
//            }
//        }
        // Find the prime numbers in the range - sqrt of l & sqrt of r
        // Why - Because the primes may have squares of themselves in the range l & r.
        // Then check if the square of that prime number exists in that range
        // If it exists then add it to the specialNums count. Because square of prime numbers are always special.

        int totalNumsInRange = r - l + 1;
        int specialCount = 0;
        int sqrtL = (int) Math.ceil(Math.sqrt(l));
        sqrtR = (int) Math.floor(Math.sqrt(r));
        for (int i = sqrtL; i <= sqrtR; i++) {
            if (isPrimeSieve[i]) {
                int sqPrime = i * i;
                if (sqPrime >= l && sqPrime <= r) {
                    specialCount++;
                }
            }
        }
        return totalNumsInRange - specialCount;
    }

    public static void main(String[] args) {
        System.out.println(BeautifulPairs2(5, 7));
        System.out.println(BeautifulPairs2(5392, 26050));
        System.out.println(BeautifulPairs2(10086764, 96508040));

    }
}
