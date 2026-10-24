package geeksforgeeks._01_mathematics.primes;

public class _02_PrimeNumber {
    public static String Prime_Number_Check(int num){
        boolean isPrime = true;

        if(num==1){
            isPrime = false;
        } else if ( num==2 || num==3 ) {
            isPrime = true;
        } else if (num%2 == 0 || num%3==0 ) {
            isPrime = false;
        } else {
            for(int i=5; i<=Math.sqrt(num); i=i+6){
                // The sqrt condition comes because let's say you have 2 factors of a number(num = a*b),
                // one of the numbers should be greater than sqrt of num and the other more than sqrt of num,
                // if both are greater than which isn't possible same goes for both being smaller.
                // If n has any factors other than 1 and n, at least one of these factors must be
                // less than or equal to the square root of n.
                // the sqrt condition is imp and prime numbers greater than 3 are of the form 6k ± 1 where k=1,2,3...
                // i = i+6 helps skip over numbers that are divisible by 2 or 3

                if (num % i == 0 || num % (i + 2) == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            return ("The number "+num+" is a prime number");
        }
        else {
            return ("The number "+num+" is a not prime number");
        }

    }
    public static void main(String[] args) {
        System.out.println(Prime_Number_Check(1221));
    }
}

//        if(num<=1){
//            isPrime = false;
//        }
//        else {
//            for(int i=2;i<num;i++){  //Time complexity O(n)
//                if(num%i == 0){
//                    isPrime = false;
//                }
//            }
//        }


//        if(num<=1){
//            isPrime = false;
//        }
//        else{
//            for(int i =2; i<Math.sqrt(num); i++){  // Time complexity of O(sqrt(num))
//                if(num%i==0){
//                    isPrime = false;
//                }
//            }
//        }