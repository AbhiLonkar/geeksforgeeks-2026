package leetcode._12_math;

public class _15_PowerXN {
    // * Given a floating point number return the number^pow
    // Can do it linear time using the Math.pow function
    // But can be done in O(logN) using binary exponentiation
    // The basic idea of binary exponentiation is to multiply the number by itself and halving the pow
    // ex. = 4^4 = (4*4)^(4/2) = (4*4)^2 = ((4*4)(4*4))^2/2 = (4*4)*(4*4) = 256
    // For odd powers we need to multiply the result one more time with the given number because, when we do half the power
    // ex. 4^5 = (4*4)^5/2 = (4*4)^2
    // So we're missing that extra 4 when we halve, that's why we multiply the result with the number when dealing with odd powers.
    // Also, when given a negative power we can simply do 1/res.

    public static double ComputePower(double n, int power){
        int pow = Math.abs(power);
        double res = 1;
        if(power==Integer.MIN_VALUE && n>1){
            return 0;
        }
        while(Math.abs(pow)>0){
            if(pow%2!=0){
                res=res*n;
            }
            n=n*n;
            pow=pow/2;
        }
        if(power<0){
            return 1/res;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(ComputePower(2,-2));
    }
}
