package leetcode._04_binary_search;

public class _06_SearchInRotatedArrayPart2_81 {
    // TODO - Given an array sorted in non-decreasing order (duplicates are present) we need to return true if target present else false
    // ex. [2,5,6,0,0,1,2] target = 0, here mid el itself is target is return true
    // ex. [2,5,6,0,0,1,2] target = 5, true

    // ? Approach - Similar to the search in an increasing sorted rotated array, we'll find which half is sorted and then check whether target lies in that range
    // ? But how to check whether we're in the correct sorted half?

    // ex. [2,2,2,2,2,2,2,1] target = 1
    // s = 0, e = 7, mid = 3
    // compare m & s elements, they're same! move s forward
    // s = 1, e = 7, mid = 4,
    // compare m & s elements, they're same, move s forward
    // We keep on doing this till we reach a valid sorted half

    public static boolean binSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                return true;
            }
            if (arr[mid] == arr[start]){
                start += 1;
            }
            else if (arr[start] < arr[mid]){
                // ! Why = needed? Because we need to check target present in the half. ex. [1,0,1,1,1] target = 0
                // after 1st iteration iteration start moves to 0 element, if we remove =, we'll incorrectly search in right half because ! 0 < 0 but 0 = 0
                if (arr[start] <= target && arr[mid] > target) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if (arr[mid] < target && arr[end] >= target){
                    start = mid+1;
                }
                else {
                    end = mid-1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(binSearch(new int[] {1,0,1,1,1}, 0));
    }

}
