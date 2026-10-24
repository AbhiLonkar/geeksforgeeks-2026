package geeksforgeeks._06_sorting;

public class _05_PartitionAnArray {
    // TODO Given a low index, high index & pivot element position we have to position the pivot element in the array such
    // TODO elements on its left are smaller than or equal to it & elements on its right are greater than it.
    // ! We aren't trying to sort the array in any way
    // ex. {1,42,4,65,13,5} l = 0, h = 5, pivotIdx = 5, o/p -> {1,3,5,42,65,13,5}

    // ? Approach - We'll traverse the array 3 times, in the first traversal we'll add elements smaller than and equal to pivot element
    // ? In second traversal we'll add elements greater to the temp array
    // ? In the third traversal we'll copy temp array to og array
    // * Time - O(n) & Space - O(n) & is stable
    public static int[] partitionArray(int[] arr, int low, int high, int pivotIdx) {
        int[] temp = new int[arr.length];
        int tempIdx = 0;
        // Adding the smaller elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[pivotIdx] && pivotIdx != i) {
                temp[tempIdx] = arr[i];
                tempIdx++;
            }
        }
        // Adding the pivot element
        temp[tempIdx++] = arr[pivotIdx];
        // Adding the greater elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[pivotIdx] && i != pivotIdx) {
                temp[tempIdx] = arr[i];
                tempIdx++;
            }
        }
        System.arraycopy(temp, 0, arr, 0, temp.length);
        return arr;
    }

    public static void main(String[] args) {
        int[] res = partitionArray(new int[]{1, 42, 4, 65, 13, 5}, 0, 5, 5);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
