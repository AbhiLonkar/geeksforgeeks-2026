package leetcode._01_arrays;

import java.util.Arrays;
import java.util.HashSet;

public class _38_MinimumCommonValue_2540 {
    // TODO - Given 2 sorted arrays, we have to find the smallest number which is present in both the arrays
    // ex. {1,2,3,4} {3,4,5,6} So two elements 3 & 4 are common but the smallest one is 3 so return 3

    // ? Approach 1 - Let's try to find if there exists a common element using binary search
    // ? Then we'll check if the common element is smaller than the previous common element, we rewrite common element value if it is smaller
    // * Time - O(nlogn) Space = O(n)->because of sorting
    public static boolean binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return true;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
    public static int minCommonValue(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        for (int i : nums1) {
            hs1.add(i);
        }
        Arrays.sort(nums2);
        int commonMin = Integer.MAX_VALUE;
        for (int i : hs1) {
            if (binarySearch(nums2, i)) {
                commonMin = Math.min(commonMin, i);
            }
        }
        return commonMin;
    }

    // ? Approach 2 - Since the arrays are sorted we can use a pointer in 1st and second array.
    // ? We run the loops till the array end, we check if arr[l] present in arr[r] starting from index 0
    // ? Case 1 - arr[l] == arr[r] return element
    // ? Case 2 - arr1[l] < arr2[r] l++
    // ? Case 3 - arr[l] > arr[r] r++
    // ? Case 4 - Not present so return -1
    // * Time - O(Math.max(arr1, arr2)length) Space = O(1)
    public static int minCommonTwoPointers(int[] arr1, int[] arr2){
        int l = 0;
        int r = 0;
        while(l<arr1.length && r<arr2.length){
            if (arr1[l]==arr2[r]){
                return arr1[l];
            }
            else if (arr1[l]<arr2[r]){
                l++;
            }
            else if (arr1[l]>arr2[r]){
                r++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(minCommonTwoPointers(new int[]{1, 2, 3, 4}, new int[]{3,4,5,6,7,8,9,10,11,12}));
    }
}
