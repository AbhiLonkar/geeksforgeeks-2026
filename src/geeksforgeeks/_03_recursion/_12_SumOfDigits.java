package geeksforgeeks._03_recursion;

public class _12_SumOfDigits {
    // Using tail recursion
    public static int SumDigits1(int n, int acc){
        if(n==0){
            return acc;
        }
        return SumDigits1(n/10, acc=acc+n%10);
    }

    public static int SumDigits2(int n){
        if(n==0){
            return 0;
        }
        int sum = n%10;
        return sum + SumDigits2(n/10);
    }

    public static void main(String[] args) {
        System.out.println(SumDigits1(111234224,0));
        System.out.println(SumDigits2(111234224));
    }
}
