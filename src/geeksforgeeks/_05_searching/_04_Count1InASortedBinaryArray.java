package geeksforgeeks._05_searching;

public class _04_Count1InASortedBinaryArray {
    // TODO - Given a binary array return the count of 1s in the array

    // ? Approach - Linear search, find the index of the first occurence and just subtract with array length
    public static int count1InASortedBinaryArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                return arr.length - i;
            }
        }
        return 0;
    }

    // ? Approach 2 - Just find the index of the first occurence of 1 and subtract it with the array length
    public static int count1InASortedBinaryArray_Optimized(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int firstOccIndex = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == 1) {
                if (mid == 0 || arr[mid - 1] != 1) {
                    firstOccIndex = mid;
                    break;
                } else {
                    end = mid - 1;
                }
            } else if (arr[mid] < 1) {
                start = mid + 1;
            }
        }
        return Math.max(0, arr.length - firstOccIndex);
    }


    public static void main(String[] args) {
        System.out.println(count1InASortedBinaryArray_Optimized(new int[]{1, 1, 1, 1, 1, 1}));
    }
}
