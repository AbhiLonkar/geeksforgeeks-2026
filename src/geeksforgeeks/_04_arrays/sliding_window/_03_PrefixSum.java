package geeksforgeeks._04_arrays.sliding_window;

public class _03_PrefixSum {
    // TODO - Given an integer array, start and end points calculate the sum of all elements between these two points *inclusive of indices
    // ? Just iterate from start to end and all the elements to the sum variable
    public static int getSum(int[] arr, int start, int end){
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum+=arr[i];
        }
        return sum;
    }

    // ? Method 2 - Using precomputed array, in this array we'll be storing elements in such a way that
    // ? pre[1] = pre[0] + arr[1], pre[2] = pre[1] + arr[2] and so on
    public static int[] precomputeSumArray(int[] arr){
        int[] res = new int[arr.length];
        res[0] = arr[0];
        for (int i = 1; i < res.length; i++) {
            res[i] = res[i-1]+arr[i];
        }
        return res;
    }
    public static int getSumOptimized(int[] arr, int start, int end){
        int[] resArr = precomputeSumArray(arr);
        // If you just want to calculate sum of all elements of the array
        if (start==0){
            return resArr[end];
        }
        // If the starting point is non-zero, we know that resArr[end] stores the sum of all elements of the array
        // So to calculate sum from non-zero starting point we'll need to subtract the (start-1)th element from the precomputed array
        // ex. arr = {1,2,3,4,5}, resArr = {1, 3, 6, 10, 15} for start = 1 & end = 4, so find sum from index 1 to 4
        // res[4] = 15, res[1-1] = res[0] = 1, so 15-1 = 14 is the result.
        return resArr[end] - resArr[start-1];
    }

    public static void main(String[] args) {
        System.out.println(getSum(new int[] {2,8,3,9,6,5,4}, 0, 2));
        System.out.println(getSumOptimized(new int[] {2,8,3,9,6,5,4}, 0, 2));
    }
}
