package geeksforgeeks._01_mathematics.digits;

public class _05_PalindromeNumber {
//    public static boolean palindrome_check(int num) {
//      Time complexity is theta(n)
//        int originalNumber = num;
//        int reverseNumber = 0;
//        while(num>0){
//            int last_digit = num%10;
//            reverseNumber = reverseNumber*10 + last_digit;
//            num = num/10;
//        }
//            return originalNumber == reverseNumber;
//        }

    public static boolean palindrome_check(int num) {
        int originalNumber = num;
        int reverseNumber = 0;

        while(num!=0){
            int lastDigit = num%10;
            reverseNumber = reverseNumber*10 + lastDigit;
            num=num/10;
        }
        return originalNumber==reverseNumber;
    }

    public static void main(String[] args) {
        System.out.println(palindrome_check(-313214));
    }
}
