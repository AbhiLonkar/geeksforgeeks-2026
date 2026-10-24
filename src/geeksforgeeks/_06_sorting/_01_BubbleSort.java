package geeksforgeeks._06_sorting;

public class _01_BubbleSort {
    // * In bubble sort we compare adjacent elements, if ith element is greater than (i+1)th element we swap them
    // Observations - For an array of size n we only need to pass it n-1 times to fully sort the array

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        // Here i represents the pass count
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false; // Let's assume that the array is sorted and don't need to do any swaps
            // Here j is used to compare adjacent elements in the "unsorted part of the array"
            // For first pass, i = 0, j < 4, so 4 comparisons between adjacent elements will be made
            // After first pass the largest element is placed at array end
            // For second pass, i = 1, j < 3, so 3 comparisons between adjacent elements will be made because we no longer need to compare with the largest element
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If at the end of a pass no swaps were made it means that all the elements are in the correct position and we no longer need to switch them
            if (swapped == false) {
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] res = bubbleSort(new int[]{5, 3, 8, 4, 2});
        for (int i : res) {
            System.out.println(i);
        }
    }
}
