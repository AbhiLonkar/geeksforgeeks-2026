package leetcode._12_math;

public class _24_ValidPerfectSquare {
    // TODO - Given a number check if its a perfect square, ex 49 is perfect square of 7, 8 isn't perfect square because when any integer is multiplied by itself it doesn't give 8

    // ? Idea - Just check up to n whether there exists a number whose square is n
    // ! TLE problem
    public static boolean isPerfectSq(int n){
        boolean res = false;
        for(int i = 1; i<=n;i++){
            if(i*i==n){
                res=true;
                break;
            }
        }
        return res;
    }

    // ? Idea - Use Binary Search to find the number, I know that the square root of that number must lie in the range 1 - number
    public static boolean isPerfectSqBinarySearch(int n){
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid == n/mid) {
                if(mid*mid==n){
                    return true;
                }
                else {
                    return false;
                }
            } else if (mid < n / mid) {
                start = mid + 1;

            } else {
                end = mid - 1;
            }
        }
        return false;
    }

    // ? Idea - Math trick - Every perfect square is sum of all the odd numbers preceding it
    // ex - 4 = 1+3, 9 = 1+3+5
    public static boolean isPerfectSqMathTrick(int n){
        int i = 1;
        while(n>0){
            n-=i;
            i+=2;
        }
        return n==0;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSqMathTrick(16));
    }
}
