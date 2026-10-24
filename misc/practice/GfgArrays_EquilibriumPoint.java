public class GfgArrays_EquilibriumPoint {
    // TODO - An eq point is the element where sum of all elements on its left = sum of all elements on its right
    // Brute - Find the sum of all elements on left and right for each array element
    public static int EqPoint(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return arr[i];
            }
        }
        return -1;
    }

    // Using prefixSum and suffixSum arrays
    // Why? Because prefixSum[i-1] - Tells us the sum of all the elements before i
    // And suffixSum[i+1] - Tells us the sum of all the elements after i
    // So what we can do is that if we compare prefix[i-1] and suffix[i+1] for every i, if i is an eq point it will have both these values as equal
    // Using extra space for prefix and suffix arrays
    public static int EqPointOptimized(int[] arr) {
        int n = arr.length;
        int[] prefixSumArr = new int[n];
        prefixSumArr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSumArr[i] = prefixSumArr[i - 1] + arr[i];
        }
        int[] suffixSumArr = new int[n];
        suffixSumArr[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixSumArr[i] = suffixSumArr[i + 1] + arr[i];
        }
        if (suffixSumArr[1] == 0) {
            return arr[0];
        } else if (prefixSumArr[n - 2] == 0) {
            return arr[n - 1];
        } else {
            for (int i = 1; i < n - 1; i++) {
                if (prefixSumArr[i - 1] == suffixSumArr[i + 1]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    // No extra space but same logic of computing sums
    public static int EqPointOptimizedV2(int[] arr){
        int n = arr.length;
        int totalSum = 0;
        int leftSum = 0;
        for (int i = 0; i < n ; i++) {
            totalSum+=arr[i];
        }
        for (int i = 0; i < n; i++) {
            //
            int rightSum = totalSum - leftSum - arr[i];
            if (rightSum==leftSum){
                return arr[i];
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {0, 8, 12, 4, -9, 8, 12, 9};
        System.out.println(EqPointOptimizedV2(arr));
    }
}
