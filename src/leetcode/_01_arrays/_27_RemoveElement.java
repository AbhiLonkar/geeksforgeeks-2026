package leetcode._01_arrays;

import java.util.Arrays;

public class _27_RemoveElement {
    // TODO - Given an array and an element remove all the occurrences of that element
    // The remaining elements must be moved by the respective positions in the array
    // ex - {1,2,2,1,2,34,5,6}, 2 = {1,1,34,5,6,_,_,_}

    // ? So what we have to do is move the element to the end and swap it with other elements;
    // ? Find position of element, find the position of the new number swap them both
    // ? Double for loop can do it

    // ! Code is going wrong
    public static int RemoveElement(int[] arr, int n){
        int occurrenceCount = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == n){
                // ! The problem that's happening is that count is incremented for the elements that have been moved to the end too.
                if (occurrenceCount==0){
                    occurrenceCount++; // First encounter of that element
                }
                // Code to swap
                for(int j = i+1; j<arr.length; j++){
                    if(arr[j]!=n){
                        occurrenceCount++;
                        int temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
        arr = Arrays.copyOf(arr, arr.length-occurrenceCount);
        return arr.length;
    }


    // * Basic logic - Iterate through the array, when an element doesn't equal target, place it at the pointer position.
    // * This pointer just stores position of the nonTargetElement and is incremented only when we encounter non target element
    public static int[] RemoveElementOptimized(int[] arr, int target){
        int nextNonTargetPos = 0; // Pointer to track where the non target element should be placed.
        for(int i = 0; i<arr.length;i++){
            int currEl = arr[i];
            if(currEl!=target){ // * If the element doesn't match the target keep it in the array.
                // * Place the current element at the nextNonTargetPosition.
                // * [1,2,3,4,5] t = 4, When we reach 4 the nextNonTargetPos = 3, Why? Because the prior elements don't match the condition hence nextNonTargetPos = 3.
                // * Now we skip over 4, the nextNonTargetPos remains 3. Next iteration currEl = 5, since it doesn't equal target, we put the currEl at nextNonTargetPos ie 3.
                arr[nextNonTargetPos] = currEl;
                nextNonTargetPos++;
            }
        }
        return Arrays.copyOf(arr, nextNonTargetPos);
    }

    public static void main(String[] args) {
        int[] res = RemoveElementOptimized(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        for (int x : res) {
            System.out.println(x);
        }
    }

}
