package leetcode._01_arrays;

public class _09_IndexOfFirstAndLastOccurrence {
    // TODO - Given a sorted integer array and a target element, we have to return the indices at which the target element is present
    // TODO - If the element isn't present in the array return -1, -1
    // ex. {1,2,3,4,5,5,5,6} target = 5, o/p = [4, 6] first occurence at index 4 and last occurence at index 6
    // ex. {1,2,3,4,5} target = 6, o/p = [-1,-1]
    // ex. {} target = 0, o/p = [-1,-1]
    // ex. {1,2,3,4,5} target = 3, o/p = [2,2];

    // ? So simply write the codes for first and last occurence

    // ? first occurence - we find the midpoint check if the element at midpoint equals target, if it does check if it is the first element
    // ? or the element on its left isn't the target
    // ? if it isn't we return the mid but if it is we call binary search on the left half
    public static int firstOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (mid == 0 || arr[mid - 1] != target) {
                    return mid;
                } else {
                    end = mid - 1;
                }
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // ? Last occurrence - we find the midpoint check if the element at midpoint equals target, if it does check if midpoint is at array end
    // ? or the element on its right isn't equal to the target, in this case we return mid
    // ? else we perform binary search on the right half
    public static int lastOccurrence(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (mid == arr.length - 1 || arr[mid + 1] != target) {
                    return mid;
                } else {
                    start = mid + 1;
                }
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int[] result(int[] arr, int target) {
        int[] res = {-1, -1};
        int firstOccIdx = firstOccurrence(arr, target);
        int lastOccIdx = lastOccurrence(arr, target);
        res[0] = firstOccIdx;
        res[1] = lastOccIdx;
        return res;
    }

    public static void main(String[] args) {
        int[] res = result(new int[] {}, 0);
        for (int i: res){
            System.out.println(i);
        }
    }

}
