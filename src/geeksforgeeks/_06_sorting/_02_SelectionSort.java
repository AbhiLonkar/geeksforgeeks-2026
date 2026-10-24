package geeksforgeeks._06_sorting;

public class _02_SelectionSort {
    // ? In this algo the array is divided into 2 parts - sorted and unsorted
    // ? The basic idea behind this algo is that first we find the minimum element and place it in the appropriate position. It represents the sorted half.
    // ? And also like bubble sort we need to traverse the array n-1 times
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minElIdx = i;
            // Loop to find the minimum element idx
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minElIdx]) {
                    minElIdx = j; // Update the minElidx with idx of the smallest element
                }
            }
            // Now that we've found the index of the minimum element we swap it with the first element(first pass)
            // It'll be second element for second pass
            int temp = arr[minElIdx];
            arr[minElIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    // ! Short code to find minEl
    public static int findMin(int[] arr) {
        int minElIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                minElIdx = i;
            }
        }
        return minElIdx;
    }

    public static void main(String[] args) {
        int[] res = selectionSort(new int[]{43, 121, 24, 114});
        for (int i : res) {
            System.out.println(i);
        }
    }
}
