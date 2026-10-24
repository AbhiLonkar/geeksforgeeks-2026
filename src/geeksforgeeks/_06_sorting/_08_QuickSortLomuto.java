package geeksforgeeks._06_sorting;

public class _08_QuickSortLomuto {
    // TODO - Write the quick sort algo using lomuto partition

    // ? Approach - last element is the pivot, traverse the array and keep track of the smallest elements window size
    // ? Put small elements in the window and increment window size, when encountered an element lesser than pivot
    // ? At the end put pivot at correct position

    public static int lomutoPartition(int[] arr, int start, int end) {
        int i = start - 1;
        int pivot = arr[end];
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = temp;
        return i + 1;
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int partitionIdx = lomutoPartition(arr, start, end);
        quickSort(arr, start, partitionIdx - 1);
        quickSort(arr, partitionIdx + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {1, 42, 4, 65, 13, 5};
        quickSort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
