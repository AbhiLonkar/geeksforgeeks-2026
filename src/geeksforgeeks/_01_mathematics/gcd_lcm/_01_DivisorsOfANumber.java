package geeksforgeeks._01_mathematics.gcd_lcm;

public class _01_DivisorsOfANumber {
    public static void Divisors(int num) {
        for (int i = 1; i <= Math.sqrt(num); i++) {               // Square root is inclusive
            if (num % i == 0) {
                System.out.println(i);
            }
        }
//        Incrementing loop from sqrt of num
        for (int i = (int) Math.sqrt(num) + 1; i <= num; i++) {      // Square root is exclusive and the number itself is inclusive
            if (num % i == 0) {
                System.out.println(i);
            }
        }

//        Decrementing loop from sqrt of num
//        for(int i=(int) Math.sqrt(num);i>=1;i--){
//            if(num%i==0){
//                System.out.println(num/i);
//            }
//        }

    }

    public static void main(String[] args) {
        Divisors(16);
    }
}
