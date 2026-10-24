package geeksforgeeks._04_arrays;

public class _09_MaximumDifferenceWithOrder {
    // TODO - Given an integer array, return the maximum possible difference between 2 elements.
    // ! Note - The second index should be greater than first and we're doing arr[j]-arr[i]

    // ? Method 1 Idea - Double for loop
    public static int MaximumDifference(int[] arr) {
        int maxDiff = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] > maxDiff) {
                    maxDiff = arr[j] - arr[i];
                }
            }
        }
        return maxDiff;
    }

    // ? Method 2 Idea - Consider every element as j, keep track of the max difference and the minValue in the array
    public static int MaximumDifferenceOptimized(int[] arr) {
        int n = arr.length;
        int maxDiff = arr[1] - arr[0];
        int minValue = arr[0];
        for (int i = 1; i < n; i++) {
            int currEl = arr[i];
            int newDiff = currEl - minValue;
            maxDiff = Math.max(maxDiff, newDiff);
            minValue = Math.min(minValue, currEl);
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        System.out.println("Break");
        System.out.println(MaximumDifferenceOptimized(new int[]{2, 3, 10, 6, 4, 8, 1}));
    }

}
