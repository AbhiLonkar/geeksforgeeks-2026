package leetcode._12_math;

public class _05_DoubleReversal {
    public static boolean isSameAfterReversals(int num) {
        int firstReversal = Reversal(num);
        int secondReversal = Reversal(firstReversal);
        return num == secondReversal;
    }
    public static int Reversal(int n){
        int res = 0;
        while(n>0){
            int remainder = n%10;
            res = res*10 + remainder;
            n=n/10;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(123450));
    }
}
