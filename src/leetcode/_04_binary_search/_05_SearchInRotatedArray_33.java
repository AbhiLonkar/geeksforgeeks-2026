package leetcode._04_binary_search;

public class _05_SearchInRotatedArray_33 {
    // TODO - Given an integer array which is sorted in an increasing order and rotated on a pivot we have to return the idx of the target element
    // ex. nums = [4,5,6,7,0,1,2], target = 0, we can see that the array is rotated on idx 2, the og array looked like this - [0,1,2,4,5,6,7]
    // o/p -> 4, 0 is present at idx 4

    // ? Approach - Since we're dealing with a rotated sorted array,
    // ? we'll try to compare the middle element with starting element of the left half
    // ? If arr[mid] > arr[start] means we've got a sorted left half
    // ? If arr[mid] < arr[end] means we've got a sorted right half

    // ? Once we've found out which half is sorted we compare the arr[start], arr[mid] and target for left half (arr[start] < target < arr[mid])
    // ? We compare the arr[end], arr[mid] and target for right half (arr[mid] < target < arr[end])
    // ? Simply apply binary search after finding the valid half

    public static int binSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target) {
                return mid;
            }
            // Means left half sorted
            // ex. [3,4,5,0,1,2] -> midEl = 5 startEl = 3, 3<5 so left half sorted
            if (arr[start] < arr[mid]){
                // If target lies in left half range binary search in left half
                if (arr[start]<=target && target<arr[mid]){
                    end = mid-1;
                }
                // If target doesn't lie in left half range binary search in right half
                else {
                    start = mid+1;
                }
            }
            else {
                // Check if target present in right half range
                // If it is binary search in right half
                if (arr[mid] < target && arr[end]>=target){
                    start = mid + 1;
                }
                // If target isn't in right half range binary search in left half
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binSearch(new int[] {4,5,6,7,0,1,2}, 0));
    }


}
