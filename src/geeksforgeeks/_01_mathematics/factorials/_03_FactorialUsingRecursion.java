package geeksforgeeks._01_mathematics.factorials;

public class _03_FactorialUsingRecursion {
    public static int factorial(int num){
        //      Time complexity O(n)
        //      Space complexity O(n)
        if (num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
