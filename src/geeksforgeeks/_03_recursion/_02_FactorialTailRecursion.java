package geeksforgeeks._03_recursion;

public class _02_FactorialTailRecursion {
    public static int Factorial(int n){
        if(n==1){
            return 1;
        }
        return n*Factorial(n-1);
    }
    public static int TailFactorial(int n, int k){
        if(n==1 || n==0){
            return k;
        }
        return TailFactorial(n-1, n*k);

    }
    public static void main(String[] args) {
        System.out.println(TailFactorial(20, 1));
        System.out.println(Factorial(10));
    }
}
