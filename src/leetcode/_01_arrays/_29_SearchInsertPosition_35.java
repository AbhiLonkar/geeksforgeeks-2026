package leetcode._01_arrays;

public class _29_SearchInsertPosition_35 {
    // TODO - Given a sorted array and a target, tell the position of the element if it's present,
    // TODO if it isn't present, then return the position where it should be inserted

    // ? 1st part is easy, simply use binary search
    public static int BinarySearch(int[] arr, int target) {
        int startPos = 0;
        int endPos = arr.length - 1;
        int mid;
        while (startPos <= endPos) {
            mid = startPos + (endPos - startPos) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                startPos = mid + 1;
            } else {
                endPos = mid - 1;
            }
        }
        return startPos;
    }

    public static void main(String[] args) {
        System.out.println(BinarySearch(new int[]{1, 3, 4, 5, 6}, 7));
    }
}
