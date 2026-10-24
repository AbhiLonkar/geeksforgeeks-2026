package geeksforgeeks._05_searching;

public class _05_SquareRoot {
    // TODO - Given a number x we find to find its square root, if it isn't a perfect square we return the floored value of the nearest square root
    // ex. Sq rt of 25 - 5, sq of 20 = 4

    // ? Approach - Iterate from 1 to n, check for every value
    public static int squareRoot(int num) {
        int i = 1;
        while (i * i <= num) {
            i++;
        }
        return i - 1;
    }

    public static int squareRootBinarySearch(int num) {
        int start = 1;
        int end = num;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == num) {
                return mid;
            } else if (num > mid * mid) {
                start = mid + 1;
                // * Why? Because there'll be many i*i which satisfy the condition of being lesser than num.
                // * The question is asking us to find the largest i which when multiplied by itself can get as close as possible to num
                // * We update the ans whenever we find an i*i which gets closer to num than before
                ans = mid;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(squareRoot(100));
        System.out.println(squareRootBinarySearch(91));
    }
}
