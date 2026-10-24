package geeksforgeeks._05_searching;

public class _10_TripletInASortedArray {
    // TODO - Given a sorted integer array and target, return true if there exists a triplet in the array which when added together equal target

    // ? Approach - Triple for loop
    // * Time = O(n3) Space = O(1)
    public static boolean tripletInASortedArray(int[] arr, int target) {
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // ? Hint - Fix one element in the triplet then solve the problem like a 2 sum problem
    public static boolean tripletExists(int[] arr, int target) {
        // start from the first element but end on the third last element, because we need 2 more elements (second last and last)
        // to form a triplet
        for (int i = 0; i < arr.length - 2; i++) {
            // When we do target - arr[i] we are simply converting this problem into a two sum problem
            int diff = target - arr[i];
            // Try to find pairs of numbers on the right of arr[i] which add up to diff
            int start = i+1;
            int end = arr.length - 1;
            while (start < end) {
                int twoSum = arr[start] + arr[end];
                if (twoSum == diff) {
                    return true;
                } else if (twoSum > diff) {
                    end = end - 1;
                } else {
                    start = start + 1;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(tripletExists(new int[]{2, 3, 5, 6, 15}, 2));
    }
}
