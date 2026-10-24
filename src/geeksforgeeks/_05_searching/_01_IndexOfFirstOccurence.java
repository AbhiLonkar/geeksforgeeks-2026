package geeksforgeeks._05_searching;

public class _01_IndexOfFirstOccurence {
    // TODO - Given a sorted integer array return the index of first occurence of target
    // ! Note - Sorted array


    // ? Approach 1 - Use linear search
    // * Time = O(n) & Space = O(1)
    public static int indexOfFirstOccurence(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // ? Approach 2 - Using recursion, the tricky part here is finding the first occurence of target
    // ? So to make sure we're returning the first occurence, we'll keep on comparing the target to elements on the left of the position
    // ? where it was found, we stop when we find an element who is unequal to the target and return the correct index

    // * The basic idea behind finding the first occurence is if it is present then should be present on the left side of the current occurence
    // * That's why we move the end point to mid-1

    public static int indexOfFirstOccurenceUsingRecursion(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            // * Better approach
            if (mid == 0 || arr[mid - 1] != target) {
                return mid;
            } else {
                return indexOfFirstOccurenceUsingRecursion(arr, target, start, mid - 1);
            }

            // ! Inefficient approach of manually decrementing mid
            // while(mid>0 && arr[mid-1]==target){
            // mid--;
            // }
            // return mid;
        } else if (target > arr[mid]) {
            return indexOfFirstOccurenceUsingRecursion(arr, target, mid + 1, end);
        } else {
            return indexOfFirstOccurenceUsingRecursion(arr, target, start, mid - 1);
        }
    }

    // ? Approach 3 - Use iterative approach
    public static int indexOfFirstOccurenceUsingIteration(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                if (mid == 0 || arr[mid - 1] != target) { // It means that mid is pointing at the first occurence of target element
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

    public static void main(String[] args) {
        System.out.println(indexOfFirstOccurenceUsingRecursion(new int[]{2, 20, 20, 20, 20}, 20, 0, 4));
        System.out.println(indexOfFirstOccurenceUsingIteration(new int[]{2, 20, 20, 20, 20}, 20));
        System.out.println(indexOfFirstOccurenceUsingRecursion(new int[]{1, 1, 1, 1}, 1, 0, 3));
        System.out.println(indexOfFirstOccurenceUsingIteration(new int[]{1, 1, 1, 1}, 1));
        System.out.println(indexOfFirstOccurenceUsingIteration(new int[]{1, 2, 3, 4}, 2));

    }
}
