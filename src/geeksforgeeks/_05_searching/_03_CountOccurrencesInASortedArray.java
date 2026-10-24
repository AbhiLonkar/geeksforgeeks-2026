package geeksforgeeks._05_searching;

public class _03_CountOccurrencesInASortedArray {
    // TODO - Given a sorted array and a target find how many occurences of target present in the array

    // ? Approach 1 - Using linear search
    public static int countOccurrencesLinearSearch(int[] arr, int target) {
        int count = 0;
        boolean targetFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                targetFound=true;
            } else if (targetFound) {
                break;
            }
        }
        return count;
    }

    // ? Using binary search find an occurence, check on the left and right manually by keeping a pointer which checks if target present at pointer position
    // ? Increment count and move pointers accordingly
    // * Time = O(logN + k) here k comes from number of occurences since we're manually checking at each position
    public static int countOccurrencesBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int count = 0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                // Count first occurence
                count++;
                // Pointers to move the search in the left and right half
                int leftOccurencePointer = mid - 1;
                int rightOccurencePointer = mid + 1;

                // while we haven't reached array start and element at leftPointer = target, increment the count and also move pointer left by 1 position
                while (leftOccurencePointer >= 0 && arr[leftOccurencePointer] == target) {
                    count++;
                    leftOccurencePointer--;
                }
                // while we haven't reached array end and element at rightPointer = target, increment the count and also move pointer right by 1 position
                while (rightOccurencePointer < arr.length && arr[rightOccurencePointer] == target) {
                    count++;
                    rightOccurencePointer++;
                }
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return Math.max(count, 0);

    }

    // ? Using first and last occurence technique
    public static int countOccurrencesBinarySearchOptimized(int[] arr, int target) {
        // The below expression gives the index of first and last occurence respectively
        int first = _01_IndexOfFirstOccurence.indexOfFirstOccurenceUsingIteration(arr, target);
        int last = _02_IndexOfLastOccurence.indexOfLastOccurenceIteration(arr, target);
        // If there isn't any occurrence then count=0
        if (first == -1) {
            return 0;
        } else {
            // Difference between last and first gives number of elements between them and adding 1 includes the first occurence
            return last - first + 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(countOccurrencesLinearSearch(new int[]{10, 20, 20, 30, 30, 30, 30, 40}, 30));
        System.out.println(countOccurrencesBinarySearchOptimized(new int[]{10, 20, 20, 30, 30, 30, 30, 40}, 30));
    }
}
