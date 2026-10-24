package geeksforgeeks._01_mathematics.digits;

public class _06_SumOfDigits {
    public static int sumCalculator(int num){
//        int sum = 0;
//        while(num>0){
//           int last_digit = num%10;
//            System.out.println("last digit ="+last_digit);
//           num = num/10;
//            System.out.println("num ="+num);
//           sum = sum + last_digit;
//            System.out.println("sum = "+sum);
//        }
//        return sum;
        int sum = 0;
        while(num>0) {
            int lastDigit = num%10; // --> gives remainder
            sum = sum+lastDigit;
            num = num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumCalculator(123));
    }
}
