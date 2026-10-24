package leetcode._01_arrays;

public class _34_TwoSumIISortedArray {
    // TODO - Given a sorted array, return the indices of the elements in the form of an array which add up to the target
    // ! Note the array is 1 indexed and only 1 such pair exists in the array.

    // ? Idea - Since the array is sorted, use the 2 pointer method
    // ? Check 1st and last element, if they add up to the target, add their indices in res array.
    // ? If sum greater move the right pointer to the left in order to decrease the overall sum.
    // ? If sum lesser move the left pointer to the right in order to increase the overall sum.

    public static int[] TwoSumIISortedArray(int[] arr, int target) {
        int[] res = new int[2];
        int leftPointer = 0;
        int rightPointer = arr.length - 1;
        while (leftPointer<=rightPointer){
            if(arr[leftPointer]+arr[rightPointer]==target){
                res[0] = leftPointer+1;
                res[1] = rightPointer+1;
                break;
            } else if (arr[leftPointer]+arr[rightPointer]>target) {
                rightPointer--;
            }
            else {
                leftPointer++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = TwoSumIISortedArray(new int[] {2,3,4},6);
        for (int i: res){
            System.out.println(i);
        }
    }

}
