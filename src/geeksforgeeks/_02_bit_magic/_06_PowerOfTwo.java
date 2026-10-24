package geeksforgeeks._02_bit_magic;

public class _06_PowerOfTwo {
    public static boolean Checker(int n){
        // Method 1: Just dividing the number until I get number=1
        // Time complexity is O(log(n))
//        if(n==0){
//            return false;
//        }
//        while(n!=1){
//            if(n%2!=0){
//                return false;
//            }
//            n=n/2;
//        }
//        return true;


        // Method 2: Direct implementation of Brian Karringham's algo
        // Powers of 2 only have 1 set bit in its binary representation
//        int count = 0;
//        while(n>0){
//            n=n&(n-1);
//            count++;
//        }
//        return count==1;

//        Method 3
//        We know a power of 2 only has 1 set bit in its binary representation so when I do "and" with number-1
//        and get 0 the number must be a power of 2.
//        eg 8 - 1000,    10 - 1010
//        &  7 - 0111      9 - 1001
//        ans - 0000      ans - 1000

        if(n==0){
            return false;
        }
        return ((n&(n-1))==0);

    };

    public static void main(String[] args) {
        System.out.println(Checker(18));
    }
}
