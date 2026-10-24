package geeksforgeeks._01_mathematics.primes;

import java.util.Arrays;


public class _05_SieveOfEratosthenes2 {
    public static int sieveOfEratosthenes(int n){
        if(n==0 || n==1){
            return 0;
        }
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int p=2;p<=Math.sqrt(n);p++){
            if(isPrime[p]){
                for(int i=p*p; i<n;i+=p){
                    isPrime[i] = false;
                }
            }
        }

        int count = 0;
        for(int i=0;i<isPrime.length-1;i++){
            if(isPrime[i]){
                count++;
            }
        }
        for (boolean b : isPrime) {
            System.out.println(b);
        }
        System.out.println(count);
        return count;

    }
    public static void main(String[] args) {
        sieveOfEratosthenes(2);
    }
}
