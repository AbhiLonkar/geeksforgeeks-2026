package geeksforgeeks._05_searching;

public class _07_SearchInSortedRotatedArray {
    // TODO - Given an integer array it is rotated by x positions we have to find a target element in this array
    // TODO - Return its position

    // ? Approach - Linear Search
    // * Time = O(n), Space = O(1)
    public static int searchInSortedRotatedArray(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // ! Hint - 1 half of the rotated array will always be sorted
    // ? So let's compare the mid element and the first element, if mid element >= first element that means that the left half is sorted
    // ? If the mid element is lesser than the last element it means the right half is sorted

    public static int binarySearchInASortedRotatedArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Finding target at middle position itself
            if (arr[mid] == target) {
                return mid;
            }
            // Now lets see which half of the array is sorted
            // * Assume left half of the array is sorted
            if (arr[mid] >= arr[start]) { // Checks if left half is sorted
                // ? Check if the target is present in the range from start to mid
                if (arr[start] <= target && arr[mid] > target) {
                    // ? if it is present then search in the og array left half
                    end = mid - 1;
                } else {
                    // ? if it isn't present then search in the og array right half
                    start = mid + 1;
                }
            }
            // * If the left half isn't sorted it means the right half is sorted, so search in the right half
            else {
                // ? Check if the target is present in the range from mid to end
                if (target > arr[mid] && target <= arr[end]) {
                    // ? If target is present then search in the og array right half
                    start = mid + 1;
                } else {
                    // ? If target isn't present then search in the og array left half
                    end = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int binarySearchInASortedRotatedArrayTrial(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // Finding target at middle position itself
            if (arr[mid] == target) {
                return mid;
            }
            // Now lets see which half of the array is sorted
            // Assume left half of the array is sorted and target present in the left half
            if (arr[mid] > arr[start]) { // Means the left half is sorted

                // ? Check if the target is present in the range from start to mid
                if (arr[start] <= target && arr[mid] > target) {
                    // * Below condition decides whether to search in left half or the right half of the array
                    if (arr[mid] < target) { // Means the element is present before the mid point ie left half
                        end = mid - 1; // Search in left half of the array
                    } else {
                        start = mid + 1; // Search in the right half
                    }
                }
            } else { // If the left half isn't sorted it means the right half is sorted, so search in the right half
                // * Below condition decides whether to search in left half or the right half of the array
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(binarySearchInASortedRotatedArray(new int[]{50, 1, 2, 3, 4, 5}, 1));
        System.out.println(binarySearchInASortedRotatedArray(new int[]{1, 2, 3, 4, 5, 60, 50, 40, 20, 10}, 50));
        System.out.println(binarySearchInASortedRotatedArray(new int[]{100, 200, 300, 400, 20, 30, 40}, 50));
        System.out.println(binarySearchInASortedRotatedArray(new int[]{1, 2, 3, 4, 5, 60, 50, 40, 20, 10}, 100));
        System.out.println(binarySearchInASortedRotatedArray(new int[]{4,5,6,7,0,1,2}, 0));
        System.out.println(binarySearchInASortedRotatedArray(new int[]{1}, 0));

    }
}
