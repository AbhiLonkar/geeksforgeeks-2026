package geeksforgeeks._05_searching;

public class _15_LinearSearch {
    // TODO - Given an integer array find an element target if it does exist in the array return its index else return -1
    // ! Not a sorted array
    // ? Approach - Traverse through the entire array, check at every index if target exists return the index if it does
    // * Time = O(n), Space = O(1)
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(linearSearch(new int[] {1,2,3,4,5}, 20));
    }

}
