package leetcode._12_math;

public class _20_SumOfNumberAndItsReverse_2443 {
    // TODO Given a number return true if the number can be expressed as a sum of any positive integer & its reverse
    // Sample size is small ie < 10^5 so checking each number & it's palindrome ought to do it.
    public static boolean Check(int n){
        if(n==0){
            return true;
        }
        for(int i = 1; i<n; i++){
            if(n == (i + ReverseNum(i))){
                return true;
            }
        }
        return false;
    }
    public static int ReverseNum(int n){
        int res = 0;
        while(n>0){
            int remainder = n%10;
            res = res*10 + remainder;
            n/=10;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Check(8));
    }
}
