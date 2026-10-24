package leetcode._12_math;

public class _03_ClosestPrimePalindrome_866 {
//    Approach - 1. Check if the number greater than n is prime or not
//    2. If it is then check if it's a palindrome
//    3. Return that number
    public static boolean isPrime(int n){
        boolean isPrime = n != 1 && n != 0;
        if(n==2 || n==3){
            return true;
        }
        else if(n%2==0 || n%3==0){
            return false;
        }
        else {
            for(int i = 5; i<=Math.sqrt(n);i=i+6){
                if(n%i==0 || n%(i+2)==0){
                    isPrime = false;
                    break;
                }
            }
        }
        return isPrime;
    }

    public static boolean isPalindrome(int n){
        if(n<=9){
            return true;
        }
        int reverse = 0;
        int tempNum = n;
        while(tempNum>0){
            reverse = reverse*10 + tempNum%10;
            tempNum = tempNum/10;
        }
        return reverse==n;
    }

    public static int ClosestPP(int n){
        while (true) {
            if (isPalindrome(n) && isPrime(n)) {
                return n;
            }
            if (n > 10000000 && n < 100000000) {
                n = 100000000;
            }
            ++n;
        }
    }

    public static void main(String[] args) {
        System.out.println(ClosestPP(9989900));
    }

}
