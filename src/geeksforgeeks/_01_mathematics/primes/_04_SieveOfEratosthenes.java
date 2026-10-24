package geeksforgeeks._01_mathematics.primes;

import java.util.Arrays;


public class _04_SieveOfEratosthenes {
    public static boolean[] sieveOfEratosthenes(int num){
        // used for finding prime numbers up to a number
        boolean[] isPrime = new boolean[num+1];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        //Outer loop checks if the boolean value of the number(index itself) is true or false;
        //We start from 2 because it's the lowest prime number
        //We go up to sqrt because of the number factors must be less than or equal to its square root
        //And so we check for each index value (2,3,4,5,...)

        for(int p=2; p<=Math.sqrt(num);p++){
            //Checks if true or false value is present at index p
            //if yes then go inside
            if(isPrime[p]){
                //Marks all the multiples of the prime number as false
                //We start from p*p because the previous numbers have already been marked as false
                //eg 6 marked false by 2 before checking with 3, 15 marked false by 3 before checking with 5 and so on
                //we go up to the last number and increment i with p (p^2, p^2+p,  p^2+2p, p^2+3p and so on)

                for(int i=p*p; i<=num; i+=p){
                    isPrime[i] = false;
                }
            }
        }
        return isPrime;

    }
    public static void main(String[] args) {
        boolean[] displayPrimes = sieveOfEratosthenes(2);
        for(int i=2; i<displayPrimes.length; i++){
            if(displayPrimes[i]){
                System.out.println(displayPrimes[i]);
            }
        }
    }
}
