package geeksforgeeks._03_recursion;

public class _06_Print1ToNRecursion {
    public static void Increment_Printer(int n){
        if(n==0){
            return;
        }
        Increment_Printer(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Increment_Printer(5);
    }
}
