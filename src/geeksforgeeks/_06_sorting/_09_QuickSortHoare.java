package geeksforgeeks._06_sorting;

public class _09_QuickSortHoare {
    // TODO - Implement quick sort using hoare partition

    // ? How does hoares partition work? We have 2 pointers, which are outside the arr at arr start - 1 and another at arr end + 1;
    // ? When we start iterating we move the pointers inside the array, for the left pointer we check if we find an element greater than equal to pivot
    // ? If we do, we stop left pointer, for right pointer if we encounter an element less than equal to pivot we stop
    // ? Then we perform swap on these 2 elements
    // ! We only get the point as output, on whose left side smaller elements and on right side greater elements are stored

    public static int hoarePartition(int[] arr, int start, int end) {
        int pivot = arr[start];
        int left = start - 1;
        int right = end + 1;
        while (true) {
            do {
                left++;
            } while (arr[left] < pivot);
            do {
                right--;
            } while (arr[right] > pivot);
            if (left >= right) {
                return right;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

    public static void quickSortHoare(int[] arr, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return;
        }
        int partitionIdx = hoarePartition(arr, startIdx, endIdx);
        quickSortHoare(arr, startIdx, partitionIdx);
        quickSortHoare(arr, partitionIdx + 1, endIdx);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println("Partition Point: "+hoarePartition(arr, 0, arr.length-1));
        quickSortHoare(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
