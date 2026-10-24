package geeksforgeeks._01_mathematics.factorials;

public class _01_Factorial {
    public static int factorial_Calculator(int num){
        //      Time complexity O(n)
        //      Space complexity O(1)
        int factorial = 1;
        while(num>1){
            factorial = factorial*num;
            num=num-1;
        }
        return factorial;
    }

    public static int f(int n){
        int f = 1;
        while (n>1){
            f = f*n;
            n = n-1;
        }
        return f;
    }

    public static void main(String[] args) {
        System.out.println(f(3));
    }
}
