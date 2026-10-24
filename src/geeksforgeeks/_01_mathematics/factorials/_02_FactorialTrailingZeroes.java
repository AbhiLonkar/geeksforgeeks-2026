package geeksforgeeks._01_mathematics.factorials;

// Find the trailing zeros of a numbers factorial
public class _02_FactorialTrailingZeroes {
    public static int trailing_Zeroes(int num){
        int count = 0;
        for(int i=5; i<=num; i=i*5){
            count = count + num/i;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(trailing_Zeroes(5));
    }
}
