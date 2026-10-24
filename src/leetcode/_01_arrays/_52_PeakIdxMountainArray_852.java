package leetcode._01_arrays;

public class _52_PeakIdxMountainArray_852 {
    // TODO - Given a whole number array we have to find the peak element
    // ! 3 <= arr.length <= 105

    // ? Approach - Find the mid element check if its greater than its neighbours
    // ? If mid lesser than right neighbour move search to right
    // ? If mid lesser than the left neighbour move search to left

    public static int peakIdxBinarySearch(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] >= arr[mid + 1] && arr[mid] >= arr[mid - 1]) {
                return mid;
            }
            if (mid > 0 && arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(peakIdxBinarySearch(new int[]{3,5,3,2,0}));
    }
}
