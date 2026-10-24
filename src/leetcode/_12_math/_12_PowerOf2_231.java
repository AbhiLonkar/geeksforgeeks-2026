package leetcode._12_math;

public class _12_PowerOf2_231 {
    public static int fun(int n){
        if(n==1){
            return 1;
        }
        return 2*fun(n/2);
    }
    public static boolean Check(int n){
//        int ans = fun(n);
        if(n<=0){
            return false;
        }
        return fun(n)==n;
        // Using bitwise
//        int count = 0;
//        while(n>0){
//            n=n&(n-1);
//            count++;
//        }
//        return count==1;

    }
    public static void main(String[] args) {
        System.out.println(Check(0));
    }
}
