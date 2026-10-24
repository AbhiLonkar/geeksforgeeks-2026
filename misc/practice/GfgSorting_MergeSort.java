public class GfgSorting_MergeSort {

    // Let's write the merge fxn first
    // This fxn takes the arr, start, end, and mid index
    // we form a temp array, we'll have 3 pointers i1, i2, i3 for left, right and temp array
    // left arr has elements from the input start index to mid index
    // right arr has elements from mid+1 index to end
    // compare arr[i1] and arr[i2] if arr[i1] smaller put it in the temp array and move i3 & i1 by 1 position
    // else put arr[i2] in the temp array and move i3 & i2 by 1 position
    // Repeat the process till we've reached mid point(endpoint for left half) or endPoint(endpoint for right half)
    // Adding the remaining elements from the half which wasn't iterated fully
    public static void merge(int[] arr, int startIdx, int mid, int endIdx) {
        int[] temp = new int[endIdx - startIdx + 1]; // Since we're dealing with indices thats why we need to add 1
        int i1 = startIdx;      // starting Pointer for the left half
        int i2 = mid + 1;       // starting Pointer for the right half
        int i3 = 0;             // Pointer for the temp array
        while (i1 <= mid && i2 <= endIdx) {
            if (arr[i1] <= arr[i2]) {
                temp[i3] = arr[i1];
                i1++;
            } else {
                temp[i3] = arr[i2];
                i2++;
            }
            i3++;
        }
        // Adding remaining elements from left half
        while (i1 <= mid) {
            temp[i3] = arr[i1];
            i1++;
            i3++;
        }
        // Adding remaining elements from right half
        while (i2 <= endIdx) {
            temp[i3] = arr[i2];
            i2++;
            i3++;
        }
        System.arraycopy(temp, 0, arr, startIdx, temp.length);
    }

    // Now lets write the dividing array into 2 halves part
    public static void divide(int[] arr, int startIdx, int endIdx) {
        if (startIdx >= endIdx) {
            return;
        }
        // Example input array: {5, 4, 3, 2}
        int mid = startIdx + (endIdx - startIdx) / 2;  // Find the middle index to split the array into two halves.

        // The divide part below keeps dividing the array into smaller subarrays until only one element remains.
        // This triggers the base case (a single-element array is already sorted), and we return from the divide function call.
        divide(arr, startIdx, mid);  // Recursively divide the left half.
        divide(arr, mid + 1, endIdx);  // Recursively divide the right half.

        // Once we reach single-element subarrays, we start merging them back in sorted order.
        // Now that we only have single-element subarrays, each represents a sorted "mini-array":
        // For example:
        // Left half: [5], [4] - Compare and merge -> [4, 5]
        // Right half: [3], [2] - Compare and merge -> [2, 3]

        // Next, merge the two sorted halves:
        // Merge [4, 5] and [2, 3]:
        // Step 1: Compare the first elements of both arrays, choose the smallest -> [2, 0, 0, 0]
        // Step 2: Compare again, choose the next smallest -> [2, 3, 0, 0]
        // Step 3: Compare again, choose the next smallest -> [2, 3, 4, 0]
        // Step 4: Take the last remaining element -> [2, 3, 4, 5]

        // This process continues recursively, merging and sorting at each step, until the entire array is sorted.
        merge(arr, startIdx, mid, endIdx);
    }


    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int s = 0;
        int e = arr.length - 1;
        divide(arr, s, e);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
