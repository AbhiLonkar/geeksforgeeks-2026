package geeksforgeeks._04_arrays;

import java.util.Arrays;

public class _17_ReverseArray {
    public static int[] ReverseArr(int[] arr){
        int startIdx = 0;
        int endIdx = arr.length-1;
        while(startIdx<=endIdx){
            int temp = arr[startIdx];
            arr[startIdx] = arr[endIdx];
            arr[endIdx] = temp;
            startIdx++;
            endIdx--;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,35,40};
        System.out.println(Arrays.toString(ReverseArr(arr)));
    }
}
