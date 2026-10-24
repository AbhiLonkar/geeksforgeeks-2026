package leetcode._01_arrays;

public class _31_ThirdMaximum {
    // TODO - Given an integer array return the third maximum element in it and if third maximum doesn't exist return the maximum element
    // ex. {1,2,3} o/p = 1
    // ex. {1,2} o/p = -1;

    // ? First let's try to find the maximum element, then write for 2nd maximum then we'll write for 3rd maximum
    // ? Approach - Linear compare every element with the current max, for the first iteration max will be the first element
    // ? then if element greater than current max, we have found out the maximum

    public static int thirdMaximum(int[] arr) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > thirdMax && arr[i] != firstMax && arr[i] != secondMax) {
                thirdMax = arr[i];
            }
        }
        if (thirdMax == Long.MIN_VALUE) {
            return (int) firstMax;
        }
        return (int) thirdMax;
    }

    public static void main(String[] args) {
        System.out.println(thirdMaximum(new int[]{1, 2, -2147483648}));
        System.out.println(Long.MIN_VALUE);
    }
}
