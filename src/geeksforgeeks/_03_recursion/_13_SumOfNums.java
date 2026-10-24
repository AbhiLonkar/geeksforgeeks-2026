package geeksforgeeks._03_recursion;

public class _13_SumOfNums {
    public static int Summer1(int n, int k){
        if(n==1){
            return k;
        }
        return Summer1(n-1, n+k);
    }
    public static int Summer2(int n){
        if(n==1){
            return 1;
        }
        return n + Summer2(n-1);
    }
    public static void main(String[] args) {
        System.out.println(Summer1(100, 1));
        System.out.println(Summer2(100));
    }
}
