package geeksforgeeks._01_mathematics.gcd_lcm;

public class _02_GreatestCommonDivisor {
    public static int GCD_Calculator(int num1, int num2) {
//        int res = Math.min(num1, num2);
//        while(res>0) {
//            if(num1%res==0 && num2%res==0){
//                break;
//            }
//            res=res-1;
//        }
//        return res;

        while(num1!=num2){
            if (num1>num2){
                num1 = num1-num2;
            }
            else {
                num2=num2-num1;
            }
        }
        return num1;

//        if (num2==0){
//            return num1;
//        }
//        else {
//            return GCD_Calculator(num2, num1%num2);
//        }
    }
    public static void main(String[] args) {
        System.out.println(GCD_Calculator(12,20));
    }
}
