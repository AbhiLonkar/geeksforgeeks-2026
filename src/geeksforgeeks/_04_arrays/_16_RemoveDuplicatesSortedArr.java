package geeksforgeeks._04_arrays;

import java.awt.*;
import java.util.Arrays;
import java.util.HashMap;

public class _16_RemoveDuplicatesSortedArr {
    // TODO - Given a sorted integer array remove all the duplicate entries in that array.
    // ex - {10,10,10,20,20,20,30,30,45,45} = {10,20,30,45,_,_,_,_,_,_}

    // ? Idea - Create a temp array to store all the unique nums, at the same time keeping a res variable which holds the count of unique elements
    // * Time complexity = theta(n) space complexity O(n)
    public static int[] RemoveDuplicates(int[] arr, int n) {
        int[] temp = new int[n];
        temp[0] = arr[0];
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (temp[res - 1] != arr[i]) { // Meaning that the current element in the arr isn't a duplicate
                temp[res] = arr[i]; // Put the current element in the temp arr
                res++;
            }
        }
        System.arraycopy(temp, 0, arr, 0, n);
        return arr;
    }

    // ? Without using a temp array
    public static int[] RemoveDuplicatesOptimized(int[] arr, int n) {
        int lastUniqueElPos = 1;
        for(int i = 1; i<n;i++){
            if(arr[lastUniqueElPos-1]!=arr[i]){
                arr[lastUniqueElPos] = arr[i];
                lastUniqueElPos++;
            }
        }
        return Arrays.copyOf(arr, lastUniqueElPos);
    }

    public static void main(String[] args) {
        int[] res = (RemoveDuplicates(new int[]{10, 10, 10, 20, 20, 20, 30, 30, 45, 45}, 10));
        for (int i : res) {
            System.out.println(i);
        }
        System.out.println("Break");
        int[] res2 = (RemoveDuplicatesOptimized(new int[]{10, 10, 10, 20, 20, 20, 30, 30, 45, 45}, 10));
        for (int i : res2) {
            System.out.println(i);
        }
    }

}
