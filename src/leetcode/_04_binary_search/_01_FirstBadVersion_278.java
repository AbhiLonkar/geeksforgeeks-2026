package leetcode._04_binary_search;

public class _01_FirstBadVersion_278 {
    // TODO - Given an array of versions of app
    //  When we encounter a bad version all the subsequent versions of the app will be bad
    //  ex. When version 2 is bad, every version following 2 is bad
    //  Our problem statement is that we have to find the first bad version

    // ! This problem can also be solved using linear search, but since we want to do least number of calls to the api we'll use bin search

    // ? This is a subproblem for find the first occurence of anything using binary search
    // ? Approach - First lets implement a simple binary search
    // ? If we find a bad version at the midPoint we check if the version at the left of the midpoint is bad or not
    // ? If it is bad then we move the end point of the search to mid - 1
    // ? We'll continue this process until we encounter a version of whose previous version wasnt bad

    public static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (arr[mid] == target){
                if (arr[mid-1] == target){
                    end = mid-1;
                }
                else {
                    return mid;
                }
            }
            // Why do we don't need to search in the left half?
            // Because if at midPoint we encounter good version it means that no bad version existed before it.
            //
            else {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(new int[] {1,2,2,3,3}, 3));
    }

}
