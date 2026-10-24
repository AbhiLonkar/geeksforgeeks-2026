package geeksforgeeks._03_recursion;

public class _08_Recursion {
    public static void f1(int n){
        if(n==0){
            return;
        }
        f1(n-1);
//        System.out.println(n);
        f1(n-1);
    }
    public static void main(String[] args) {
        f1(3);
        System.out.println(1%2);
    }
}
