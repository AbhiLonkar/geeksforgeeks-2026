package geeksforgeeks._01_mathematics.primes;

import java.util.ArrayList;

import static geeksforgeeks._01_mathematics.primes._02_PrimeNumber.Prime_Number_Check;

public class _01_PrimeFactors {

    public static void allPrimeFactors(int num) {
        if (num <= 1) {
            return;
        } else if (num == 2 || num == 3) {
            System.out.println(num);
        }
        /* Check if number divisible by 2 */
        while (num % 2 == 0) {
            System.out.println(2);
            num = num / 2;
        }
        /* Check if number divisible by 3 */
        while (num % 3 == 0) {
            System.out.println(3);
            num = num / 3;
        }

        for (int i = 5; i * i <= num; i = i + 6) {            //Time complexity O(n*log(n)), Finding powers of factors
            while (num % i == 0) {
                System.out.println(i);
                num = num / i;
            }
            while (num % (i + 2) == 0) {
                System.out.println(i);
                num = num / (i + 2);
            }
        }

        if (num > 1) {
            System.out.println(num);
        }


        //    Function to check number prime or not
//        public static boolean PrimeCheck(int num){
//            boolean isPrime = true;
//            if(num==2 || num==3){
//                isPrime = true;
//            }
//            else if(num%2==0 || num%3==0){
//                isPrime = false;
//            }else {
//                for(int i = 2; i<Math.sqrt(num); i++){
//                    if(num%i==0){
//                        isPrime = false;
//                        break;
//                    }
//                }
//            }
//            return isPrime;
//        }
//
//
//        for(int i=2;i<num;i++){
//            if(PrimeCheck(i)){
//                int x = i;
//                while (num%x==0){
//                    System.out.println(i);
//                    x=x*i; //Using this to check divisibility by multiples of i
//                }
//            }
//        }


    }

    public static void main(String[] args) {
        allPrimeFactors(45);
    }
}
