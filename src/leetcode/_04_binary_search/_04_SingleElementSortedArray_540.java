package leetcode._04_binary_search;

public class _04_SingleElementSortedArray_540 {
    // TODO - Given a integer array where every element except one element appears exactly twice
    //  We have to find that one element

    // ? Approach - Can be solved with xor operator (O(N)) but we need O(log n) time
    // ? Using binary search

    // Observations - After find the mid point
    // The half which has our single element must have an odd length which can be found by start - mid or end - mid

    public static int singleElementSortedArray(int[] arr) {
        // If only 1 element in the array we simply return that element
        if (arr.length == 1) {
            return arr[0];
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // If we're at the start or endPoints of the array means there's no elements to compare it to so we return the element
            if (mid == 0 || mid == arr.length - 1) {
                return arr[mid];
            } else {
                // We check middle element with adjacent elements, if they're not equal we return the middle element
                if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                    return arr[mid];
                }
                // If left element to mid element is equal we'll check which half has odd number of elements
                // ex. {1,1,2,3,3,4,4,8,8} mid = 0 + 9/2 = 4
                //              mid
                // left to the midpoint is equal so we check which half (either 0 to mid - 1) or (mid + 1 to end) has odd number of elements
                // in this case the 0 - 4 - 1 = 3 which is odd so our result lies in left half
                // then we simply continue the search

                // [3,3,7,7,10,11,11] mid = 0 + 7/2 = 3
                //        mid
                // left element is equal, so we check which half has odd number of elements
                // in this case we get right half so we move our search to right half
                else if (arr[mid] == arr[mid - 1]) {
                    if ((start - mid - 1) % 2 != 0) {
                        end = mid - 2;
                    } else {
                        start = mid + 1;
                    }
                }
                // If right element to mid is equal we'll check which half has odd number of elements
                else {
                    if ((end - mid + 1) % 2 != 0) {
                        start = mid + 2;
                    } else {
                        end = mid - 1;
                    }
                }
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(singleElementSortedArray(new int[]{1,1,2,3,3,4,4,8,8}));
    }

}
