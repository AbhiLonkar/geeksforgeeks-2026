package geeksforgeeks._05_searching;

// ! Cleared confusion about - start>end in recursion and start<=end in interative
// -- start>end means no elements left to check, its the recursion termination condition
// -- while(start<=end) means that elements are still present in the array

public class _14_BinarySearchUsingRecursion {
    // TODO - Use recursion to write the binary search algo
    // ? The approach will remain the same with calculating the midpoint, if target greater than midpoint then we move starting point to
    // ? midpoint + 1, if target lesser then we move ending point to midpoint - 1
    // ? The base case will be if low<=high we simply return -1 ie element isn't present
    // ! But what happens when element isn't present?
    public static int binarySearchUsingRecursion(int[] arr, int target, int start, int end){
        if(start>end){
            return -1;
        }
        int mid = start + (end-start)/2;
        if(arr[mid]==target){
            return mid;
        } else if (target > arr[mid]) {
            return binarySearchUsingRecursion(arr, target, mid+1, end);
        }
        else {
            return binarySearchUsingRecursion(arr, target, start, mid-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(binarySearchUsingRecursion(new int[] {10,20,30,40,50}, 60, 0, 4));
    }
}
