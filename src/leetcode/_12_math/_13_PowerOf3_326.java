package leetcode._12_math;

public class _13_PowerOf3_326 {
    public static int fun(int n){
        if(n<3){
            return 1;
        }
        return 3*fun(n/3);
    }
    public static boolean Check(int n){
        if(n<0){
            return false;
        }
        return fun(n) == n;
    }
    public static boolean isPowerOfThree(int n) {
        while(n>=3){
            if(n%3!=0){
                return false;
            }
            n = n/3;
        }
        return n==1;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }

}










//        int res = 1;
//        int temp = n;
//        while(temp>){
//            res=res*3;
//            temp=temp/3;
//        }
//        if(n<=0){
//            return false;
//        }
//        return res == n;