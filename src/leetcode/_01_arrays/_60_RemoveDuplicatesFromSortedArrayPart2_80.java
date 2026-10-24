package leetcode._01_arrays;

public class _60_RemoveDuplicatesFromSortedArrayPart2_80 {
    // TODO - Given an integer array sorted in a non decreasing order, we have to manipulate the array such that atmost 2 entries are present for each element
    // ex. {1,1,1,1,1,2,2,2,2,3,3,3,4} -> o/p {1,1,2,2,3,3,4} len = 7

    // ? Approach - Think of each repeating pattern as a subarray, find the start and end points of the sub array
    // ? Take the lesser of subarray length and 2
    // ? Keep an updateLocation pointer to insert atmost 2 copies of the subarray element
    // ? At the end return the updateLocation pointer

    public static int[] removeDuplicates(int[] arr) {
        // start means subarray startpoint, end means subarray endpoint and updateLocation means where to insert in the input array
        // Initially all are at the same point
        int start = 0;
        int end = 0, updateLocation = 0;
        int n = arr.length;
        while (end < n) {
            int currElement = arr[start];
            while (end + 1 < n && arr[end] == arr[end + 1]) {
                // We're trying to find the sub array end point here
                end++;
            }
            // After finding the endpoint copy the currElement depending of the subarray length
            int currElementCount = end - start + 1;
            // if more than 1 occurence of currElement means we need to copy it 2 times
            if (currElementCount > 1) {
                arr[updateLocation++] = currElement;
                arr[updateLocation++] = currElement;
            }
            // If only 1 occurence we only need to copy it once
            else {
                arr[updateLocation] = currElement;
                updateLocation++;
            }
            // Starting a new subarray
            end++;
            start = end;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] res = removeDuplicates(new int[]{1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4});
        for (int i : res) {
            System.out.println(i);
        }
    }
}
