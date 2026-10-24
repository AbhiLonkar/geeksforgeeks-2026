package geeksforgeeks._05_searching;

import java.util.HashMap;

public class _12_RepeatingElement {
    // TODO - Given an integer array, there exists an element which occurs more than 1 time. Return the element
    // ! Note - The numbers in the array are in the range 0 to n where n is the length of the array
    // ! Constraints - Do not modify the array and solve it in O(1) space

    // ? Approach 1 - Double for loop
    // * Time complexity - O(n2) and space = O(1)
    public static int repeatingElement_V1(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }

    // ? Approach 2 - Use a hashmap
    // * Time complexity - O(n) and space = O(n)
    public static int repeatingElementHashMap(int[] arr) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (numsMap.containsKey(arr[i])) {
                return arr[i];
            } else {
                numsMap.put(arr[i], i);
            }
        }
        return -1;
    }

    // ? Approach 3 - Use a temp boolean array
    // ? The array elements from input array can be used as the indices of temp array
    public static int repeatingElementBoolArray(int[] arr) {
        boolean[] temp = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int currArrayElement = arr[i];
            if (temp[currArrayElement]) {
                return currArrayElement;
            } else {
                temp[currArrayElement] = true;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(repeatingElementBoolArray(new int[]{0, 1, 2, 2, 3, 4}));
    }
}
