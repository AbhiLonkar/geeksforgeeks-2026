package geeksforgeeks._06_sorting;

// * Insertion sort is a stable sorting algo

public class _03_InsertionSort {
    // ? The basic idea behind insertion sort is that the array is divided into two halves - sorted and unsorted.
    // ? Initially the sorted half only contains the first element
    // ? Start iterating from the second element, compare with each element in the sorted half
    // ? if smaller insert it into correct position by shifting all the larger elements forward by 1 position
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int currEl = arr[i]; // Creating a temp variable because we'll be moving elements forward if the currEl is small so that it isn't overwritten
            int j = i - 1;
            while (j >= 0 && arr[j] > currEl) {
                arr[j + 1] = arr[j];
                j--;
            }
            // After shifting elements j now points to the last index currEl shouldn't be placed
            // Because while loop stops when j<0 or arr[j] <= currEl.
            // Therefore place currEl at j+1th position
            arr[j + 1] = currEl;
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
