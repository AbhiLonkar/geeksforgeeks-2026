public class LcBits_DivideTwoIntegers {
    public static int DivideTwoIntegers(int dividend, int divisor) {
        int sign = ((dividend < 0 && divisor < 0) || (dividend > 0 && divisor > 0)) ? 1 : -1;
        long longAbsDividend = Math.abs((long) dividend);
        long longAbsDivisor = Math.abs((long) divisor);
        long quotient = 0;
        while(longAbsDividend>=longAbsDivisor){
            int doubleCount = 0;
            while(longAbsDividend>=(longAbsDivisor<<doubleCount+1)){
                doubleCount++;
            }
            quotient += 1L << doubleCount;
            longAbsDividend -= longAbsDivisor<<doubleCount;
        }
        long res = sign * quotient;
        if((res>=Integer.MIN_VALUE) && (res<=Integer.MAX_VALUE)){
            return (int) res;
        }
        return Integer.MAX_VALUE;
    }

    public static void main(String[] args) {
        System.out.println(DivideTwoIntegers(303, -3));
    }
}
