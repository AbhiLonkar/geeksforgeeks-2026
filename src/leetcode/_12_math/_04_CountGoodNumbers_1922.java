package leetcode._12_math;

public class _04_CountGoodNumbers_1922 {
//  given digit string length return how many good number of that length are there
//  good digit has even numbers at even position and prime numbers at odd position
//  There are 5 even digits - 0,2,4,6,8 & 4 prime numbers - 2,3,5,7 in the digit range of 0-9
//  So if n = 5 (_____) so at even pos there are 5 possibilities & at odd pos there are 4 pos
//  Formula to calculate the number of possible combinations we can do 5x4x5x4x5 = 5^(number of even pos) X 4^(number of odd pos)
//  To find even pos = n+1/2 & for odd = n/2
//  The trick here is to implement a function that calculates power in O(logn)

    private static final int MOD = 1000000007;
    public static long computingPower(long num, long pow){
        long res=1;
        while(pow>0){
            if(pow%2==1){
                res=(res*num)%MOD;
            }
            pow=pow/2;
            num=(num*num)%MOD;
        }
        return res;
    }

    public static int GoodNum(int n){
        return (int) (computingPower(5, (n+1)/2) * computingPower(4, n/2)%MOD);
    }

    public static void main(String[] args) {
        System.out.println(GoodNum(1));
        System.out.println(GoodNum(4));
        System.out.println(GoodNum(50));
    }
}
