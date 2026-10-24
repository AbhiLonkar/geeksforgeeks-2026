package geeksforgeeks._05_searching;

public class _02_IndexOfLastOccurence {
    // TODO - Given a sorted array return the last position of target element
    // ex. {10,20,30,30,40,40} target = 40, o/p = 5

    // ? Linear Search could be used as well but time complexity high

    // ? Approach - Since the array is sorted, reduce the search size on each iteration and since we're dealing with the last occurence
    // ? we need to check [mid+1]th element is equal to the target or not
    // * The basic idea behind finding the last occurence is if it is present then should be present on the right side of the current occurence
    // * That's why we move the starting point to mid+1

    public static int indexOfLastOccurenceIteration(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) { // Check if the element at mid position is equal to target or not
                // Check if the element next to mid is equal to target or not
                // And if mid has reached array end ie last element, so from the above if check it means we've encountered the target
                // which happens to be at the last position in the array
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

    // ? Using recursion
    public static int indexOfLastOccurenceRecursion(int[] arr, int target, int start, int end) {
        if(start>end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            if(mid == arr.length-1 || arr[mid]!=target){
                return mid;
            }
            else {
                return indexOfLastOccurenceRecursion(arr, target, start+1, end);
            }
        } else if (target > arr[mid]) {
            return indexOfLastOccurenceRecursion(arr, target, mid + 1, end);
        } else {
            return indexOfLastOccurenceRecursion(arr, target, start, mid - 1);
        }
    }


    public static void main(String[] args) {
        System.out.println(indexOfLastOccurenceIteration(new int[]{1, 1, 1}, 1));
        System.out.println(indexOfLastOccurenceIteration(new int[]{10,20,30,40,40,50,50,50}, 50));
        System.out.println(indexOfLastOccurenceRecursion(new int[]{1, 1, 1}, 1,0, 2));
        System.out.println(indexOfLastOccurenceRecursion(new int[]{10,20,30,40,40,50,50,50}, 50, 0, 8));
    }
}
