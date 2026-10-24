package geeksforgeeks._04_arrays;

import java.util.Arrays;

public class _05_LeftRotateByD {
    // TODO - Given an integer array move the starting elements to the end by d pos.
    // ex - {1,2,3,4,5} d = 3 -> {4,5,1,2,3}

    // * Hints - T C - Theta(n*d), Theta(n) but space = theta(d)
    // ? Ideas - Simply 1 rotate the arr d times.
    // ex - {1,2,3,4,5} d = 3 -> {4,5,1,2,3}
    public static void LeftRotateByOne(int[] arr) {
        int len = arr.length;
        int temp = arr[0];
        for (int i = 1; i < len; i++) {
            arr[i - 1] = arr[i];
        }
        arr[len - 1] = temp;
    }

    public static int[] LeftRotateByD1(int[] arr, int n, int d) {
        for (int i = 0; i < d; i++) {
            LeftRotateByOne(arr);
        }
        return arr;
    }

    // ? Use a temp arr to store the first d elements, and then put the remaining elements in the starting position of the original array.
    // ? Then just copy the temp arr into og arr.
    // ? Time complexity - O(n), Space complexity - O(n)
    // ex - {1,2,3,4,5} d = 3 -> {4,5,1,2,3}
    public static int[] LeftRotateByD2(int[] arr, int d) {
        int[] tempArr = Arrays.copyOf(arr, d);
        int j = 0;
        for (int i = d; i < arr.length; i++) {
            arr[j] = arr[i];
            j++;
        }
        System.arraycopy(tempArr, 0, arr, j, tempArr.length);
        return arr;
    }

    public static void ReverseArr(int[] arr, int startIdx, int len) {
        int endIdx = len-1;
        while(startIdx<=endIdx){
            int temp = arr[startIdx];
            arr[startIdx] = arr[endIdx];
            arr[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
    }

    public static int[] LeftRotateByD3(int[] arr,int n, int d) {
        ReverseArr(arr, 0, d-1);
        ReverseArr(arr, d, n);
        ReverseArr(arr, 0, n);
        return arr;
    }

    public static void main(String[] args) {
        int[] res = LeftRotateByD3(new int[]{1, 2, 3, 4, 5}, 5, 3);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
