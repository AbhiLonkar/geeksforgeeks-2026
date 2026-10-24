package geeksforgeeks._03_recursion;

public class _07_PrintNTo1Recursion {
    public static void Decrement_Printer(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Decrement_Printer(n-1);
    }
    public static void main(String[] args) {
        Decrement_Printer(5);
    }
}
