package leetcode._01_arrays;

public class _22_MissingNumber_268 {
    // TODO - Given an integer array of length n, it only contains numbers in the range (0,n) inclusive
    // TODO - But there exists a number in this range which isn't present in the array, find that number

    // ? Approach - Calculate the sum of all the elements in the range 0 to n+1 here n means the array length
    // ? Calculate the sum of all array elements
    // ? Now subtract it with the range sum and we'll get the missing number
    public static int missingNumber(int[] arr){
        int n = arr.length;
        int rangeSum = (n)*(n+1)/2;
        int arraySum = 0;
        for (int i: arr){
            arraySum+=i;
        }
        return rangeSum-arraySum;
    }

    // ? Approach 2 - Using XOR, we'll XOR all array elements with the elements in the range 0 to n
    // ? Only that element which isn't present in the array will be returned;

    public static int missingNumberXOR(int[] arr){
        int xor = 0, i = 0;
        for (i = 0; i < arr.length; i++) {
            xor = xor ^ i ^ arr[i];
        }

        return xor^i;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumberXOR(new int[] {9,6,4,2,3,5,7,0,1}));
    }
}
