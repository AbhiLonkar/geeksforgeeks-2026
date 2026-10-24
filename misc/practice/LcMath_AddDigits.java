public class LcMath_AddDigits {
    // Keep adding the digits of the number until the result has only 1 digit
    // To find if a number has only 1 digit - num/10 = 0
    // repeatedly adding lastdigit = num%10 res += lastdigit
    public static int addDigits(int n){
        int sum = 0;
        while(n!=0){
            int lastDigit = n%10;
            sum+=lastDigit;
            n=n/10;
        }
        if (sum/10!=0){
            return addDigits(sum);
        }
        return sum;
    }
    public static void main(String[] args) {

    }
}
