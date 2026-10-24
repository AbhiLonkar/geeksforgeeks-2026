package geeksforgeeks._03_recursion;

public class _03_NthFibNum {
    public static int FibNum(int num){
        if (num == 0){
            return 0;
        }
        if (num==1){
            return 1;
        }
        return FibNum(num-1) + FibNum(num-2);
    }

    public static void main(String[] args) {
        System.out.println(FibNum(10));
    }
}
