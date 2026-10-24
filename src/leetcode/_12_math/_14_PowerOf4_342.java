package leetcode._12_math;

public class _14_PowerOf4_342 {
    public static int fun(int n){
        if(n<4){
            return 1;
        }
        return 4*fun(n/4);
    }
    public static boolean isPower4(int n){
//        Approach 1 using iteration
//        while(n>=4){   // n = 64, n/4=16 & r = 0, n/4 = 4 & r = 0, n/4 = 1.
//                       n = 20, n/4 = 5 & r = 0, n/4 = 1 but 5%4 = 1 so no power
//            if(n%4!=0){
//                return false;
//            }
//            n=n/4;
//        }
//        return n==1;

//        Approach 2
        if(n<=0){
            return false;
        }
        return fun(n)==n;
    }
    public static void main(String[] args) {
        int trial = 44*256;
        System.out.println(isPower4(trial));
    }
}
