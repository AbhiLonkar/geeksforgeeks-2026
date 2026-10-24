package geeksforgeeks._05_searching;

public class _06_SearchInASortedInfiniteArray {
    // TODO - Given an infinite sorted integer array we have to find the position at which the target is present
    // TODO - If it isn't present we return -1

    // ? Approach 1 - Linear search, check every element if arr[i] == target return i+1, if at any point arr[i] > target return -1;
    public static int searchSortedInfiniteArray(int[] arr, int target){
        int i = 0;
        while(true){ // Infinite loop because we're dealing with an infinite size array
            if (arr[i] == target){
                return i+1;
            } else if (arr[i]>target) {
                return -1;
            }
            i++;
        }
    }

    // ? Approach - The idea here is that we keep doubling the index as long as the element at that index is less than target
    // ? When it becomes greater than target we have our end point to search, the start point will be the current i / 2;
    // ! Note: This algo is known as unbounded binary search
    public static int searchSortedInfiniteArrayBinarySearch(int[] arr, int target){
        if (arr[0]==target){
            return 0;
        }
        else {
            int end = 1;
            int start = 0;
            while(arr[end]<target){
                start = end;
                end *= 2;
            }
            while(start<=end){
                int mid = start + (end-start)/2;
                if(arr[mid]==target){
                    return mid;
                }
                else if (target>arr[mid]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(searchSortedInfiniteArrayBinarySearch(new int[] {10,20,30,40,50,60,100,120,150,160}, 120));
    }
}
