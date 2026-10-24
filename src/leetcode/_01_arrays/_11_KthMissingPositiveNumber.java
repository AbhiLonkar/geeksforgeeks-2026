package leetcode._01_arrays;

import java.util.ArrayList;

public class _11_KthMissingPositiveNumber {
    // TODO - Given a sorted integer array and k, we have to find the kth element which is missing from the input array.
    // ex. {2,3,4,7,11} k = 5, Missing array = [1,5,6,8,9,10,12,...] o/p = 9
    // ex. {1,2,3,4} k = 2, Missing array = [5,6,7,8] o/p = 6

    // ? Approach 1 - Form the missing element array and then simply retrieve the kth element
    // ! Also, I just need to form the array till k.
    public static int missingElement(int[] arr, int k){
        int i = 0;
        int n = 1;
        while(k>0){
            if (i<arr.length && arr[i]==n){
                // Curr element isn't missing
                i++;
            }
            else {
                // A missing element has been found
                k--;
            }
            if (k>0){
                // Move to a new integer
                n++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(missingElement(new int[] {2,3,4,7,11}, 5));

    }
}
