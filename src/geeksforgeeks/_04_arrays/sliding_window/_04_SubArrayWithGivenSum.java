package geeksforgeeks._04_arrays.sliding_window;

import javax.swing.plaf.IconUIResource;

public class _04_SubArrayWithGivenSum {
    // TODO - Given a whole number array, return true if there exists a subarray whose elements add up to sum else return false
    // ex - [10,20,30,3,33] sum = 50, 20+30 = 50 so true

    // ? Form a subarray with every ith element, keep adding the numbers of the subarray and if it equals the given sum return true.
    public static boolean SubArrayWithGivenSum(int[] arr, int sum){
        boolean exists = false;
        for (int i = 0; i<arr.length; i++){
            int subArraySum = 0;
            for (int j = i; j < arr.length; j++) {
                subArraySum+=arr[j];
                if (subArraySum==sum){
                    exists = true;
                    break;
                }
            }
        }
        return exists;
    }

    // ? Using sliding window
    // ? We'll be using a variable size array, over here we start an array from the first element, we keep on adding next elements to it
    // ? When the sum of the subArray becomes equal then return true and if the subArray sum greater than sum we remove the first element
    public static boolean SubArrayWithGivenSumSW(int[] arr, int sum){
        int start = 0;
        int subArraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            subArraySum+=arr[i];
            while (subArraySum>sum){
                subArraySum-=arr[start];
                start++;
            }
            if (subArraySum==sum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(SubArrayWithGivenSum(new int[] {10,20,30,3,33}, 50));
        System.out.println(SubArrayWithGivenSumSW(new int[] {10,20,30,3,33}, 36));
    }
}
