package leetcode._11_bit_manipulation;

public class _04_Divide2Integers {
    // Problem Statement - Divide 2 integers without using division/multiplication/modulus operator
    // ? Idea - Division is nothing but subtracting the divided by the divisor a certain number of times.
    // ? A certain number of times meaning until the dividend is less than the divisor
    // ? We can continually subtract with this approach but let's say we're given a pretty big dividend and a small divisor
    // ? It will take linear time until the dividend becomes less than the divisor
    // * To counter this problem we can use the left shift operator, we continually left shift(multiplying by 2)
    // * Until the divisor becomes greater than the divisor.
    // * We store the count of this left shifting until greater into a count variable
    // * And then add this left shifted count to the quotient

    public static int Divide(int dividend, int divisor ){

        int sign = ((dividend>0 && divisor>0) || (dividend<0 && divisor<0))? 1: -1;
        long longDividend = Math.abs((long) dividend);
        long longDivisor = Math.abs((long) divisor);
        long quotient = 0;
        // ! We never change the divisor
        while(longDividend>=longDivisor){
            int count = 0;
            while(longDividend>=(longDivisor<<(count+1))){
                count++;
            }
            // 1L is the long literal form of 1
            quotient += 1L << count;
            // Subtracting the dividend with the divisor multiplied by the count with which the divisor was doubled until it exceeded the dividend
            // We can then work on the dividend again in the outer while loop until it becomes less than divisor
            longDividend = longDividend - (longDivisor<<count);
        }
        long res = sign * quotient;
        if(res>=Integer.MIN_VALUE && res<=Integer.MAX_VALUE){
            return (int) res;
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        System.out.println(Divide(20,-4));
    }
}
