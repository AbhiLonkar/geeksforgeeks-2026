package leetcode._01_arrays;

public class _20_MaximumAscendingSubarraySum {
    // TODO - Given an integer array, form a subarray in which all the elements are in the ascending order
    // TODO - Then calculate the maximum sum these sub arrays can generate
    // ex. {10,20,30,5,10,50} - The ascending sub array which generates max sum is {5,10,50} = 65

    // ? Idea - Using double for loop first find the ascending contiguous sub array while adding each element to the currSubArraySum
    // ? And update the res when currSubArraySum more than res
    // ? Assume res as the first element
    // * Time complexity = O(n2) and Space = O(1)
    public static int MaximumAscendingSubArrSum(int[] arr){
        int res = arr[0];
        for (int i = 0; i<arr.length; i++){
            int currSubArraySum = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j-1]<arr[j]){
                    currSubArraySum+=arr[j];
                    res = Math.max(currSubArraySum, res);
                }
                else {
                    break;
                }
            }
        }
        return res;
    }

    // ? Idea - Using Kadane's algo
    // ? The criteria for array break will be that the current element should be greater than the previous element
    public static int MaximumAscendingSubArrSumOptimized(int[] arr){
        int res = arr[0];
        int currSubArrSum = arr[0];
        for(int i = 1; i<arr.length; i++){
            if (arr[i-1]<arr[i]){
                currSubArrSum+=arr[i];
                res = Math.max(currSubArrSum, res);
            }
            else {
                currSubArrSum = arr[i];
            }
        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(MaximumAscendingSubArrSum(new int[] {12,17,15,13,10,11,12}));
        System.out.println(MaximumAscendingSubArrSumOptimized(new int[] {10,20,30,40,50}));
    }

}
