package leetcode._12_math;

public class _19_SqrtX {
    // TODO Given a number return the square root of it rounded down to its nearest integer and not allowed to use in built methods and consider number as 32 bit integer size.
    // ex - for n = 4 return 2, for n = 8 return 2 (sqrt of 8 is 2.828 which when rounded is 2)

    // ? Idea 1 - Search for the square of every possible integer
    // ? Case - 1. When the square of x matches the number return x
    // ? 2. When the square of x is less than number but the square of (x+1) is more than number return the x.

    // * The time complexity is O(n), so if the number is the max possible 32-bit integer, time limit will exceed.
    // * So how to optimize it, we can use binary search
    public static int SqrtX(int n){
        if(n==0){
            return 0;
        }
        for(int i = 1; i<n; i++){
            if(i*i==n){
                return i;
            }
            else if (i*i<n && (i+1)*(i+1)>n){
                return i;
            }
        }
        return 0;
    }

    // ? Idea 2 - Given x we know that the sqrt of x must be less than or equal to x(for x = 1);
    // ? So let's set up 2 pointers, start and end, find the midpoint by halving the sum of start of end
    // ? Once midpoint found, square it, check if the square equals, exceeds or subceeds
    // ? if it is less search the right half by moving the starting point to mid+1, if it is greater search the left half by moving the end to the mid-1
    // ? Repeat the process until found.
    // ! Note that when we encounter a mid whose square is less than number we need to assume that this mid could be the largest possible sqrt of x

    public static int SqrtXBinarySearch(int n){
        int start = 1;
        int end = n;
        int res = 0;
        while(start<=end){
            int mid = start+(end-start)/2; // * New - Special syntax to take into consideration large value occurring when start != 0, therefore causing the addition start+end to exceed Max Integer value
            // Search the right half
            if(mid<=n/mid){
                res = mid;
                start = mid+1;
            }
            // Search the left half
            else {
                end = mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        System.out.println(SqrtX(2147483647));
        System.out.println(SqrtXBinarySearch(2147483647));
    }
}
