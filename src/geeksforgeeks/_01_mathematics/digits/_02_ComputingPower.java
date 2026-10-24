package geeksforgeeks._01_mathematics.digits;

public class _02_ComputingPower {
    public static int computingPower(int num, int pow){
//        basic logic - x^n = x*x^n-1
//        Solution1 timecplx = theta(n)
//        if(pow==0){
//            return 1;
//        } else if (pow==1) {
//            return num;
//        }
//        else {
//            int res = num;
//            for (int i = 2; i <= pow; i++) {
//                res = res * num;
//            }
//            return res;
//        }

//        if(pow==0){
//            return 1;
//        }
//        int powMinus1 = computingPower(num, pow-1);
//        int res = num*powMinus1;
//        return res;

//  num^pow = (num^(pow/2))^2
    if(pow==0){
        return 1;
    }
    int temp = computingPower(num, pow/2);
    temp = temp*temp;
    if(pow%2==0){
        return temp;
    }
    else{
        return temp*num;
    }

    }
    public static void main(String[] args) {
        System.out.println(computingPower(2,5));
    }
}
