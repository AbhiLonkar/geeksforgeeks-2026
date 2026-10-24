package leetcode._01_arrays;

import java.util.Arrays;
import java.util.HashMap;

public class _26_RemoveDuplicateElements {
    // TODO Given a sorted array of elements there may be duplicate elements, remove them and return the count of unique elements as well as the new array.

    // ? Ideas - Using hashmap, just iterate through the array and add the elements as keys. As hashmaps don't have duplicate entries
    // ? We'll only get single occurrences of elements then using these keys form a new array
    // ? Extra space for hashmap and the new array but time complexity O(n)
    public static int[] DuplicateElementRemoverHash(int[] arr){
        HashMap<Integer, Integer> uniqueMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            uniqueMap.put(arr[i], i );
        }
        int j = 0;
        for(Integer numKey: uniqueMap.keySet()){
            arr[j] = numKey;
            j++;
        }
        return Arrays.copyOf(arr, uniqueMap.size());
    }


    // ? Idea 2 using an algorithm that moves the unique elements to the start
    public static Object[] DuplicateElementRemover(int[] arr) {
        int k = 0; // Represents the last unique element as well as the count of the unique elements
        for (int i = 1; i < arr.length; i++) {  // i here represents the current element
            if (arr[k] != arr[i]) {     // When encountering a new element move the element to the (k + 1)th position. This position now represents the last unique element
                k++;
                arr[k] = arr[i];
            }
        }
        int totalCount = k + 1;
        // * copyOf method returns a new array with the elements from the array in the argument and we can also provide custom length.
        int[] res = Arrays.copyOf(arr, totalCount);
        return new Object[]{res, totalCount};
    }

    public static void main(String[] args) {
        Object[] res = DuplicateElementRemover(new int[] {1,1,1,2,2,2,3,3});
        // * (int[]) typecasting syntax, converting into an integer array.
        int[] arr = (int[]) res[0];
        int value = (int) res[1];
        for(int i: arr){
            System.out.println(i);
        }
        System.out.println("Break");
        System.out.println(value);
        System.out.println("Break");

        int[] x = DuplicateElementRemoverHash(new int[] {1,1,1,2,2,2,3,3});
        for(int i: x){
            System.out.println(i);
        }
    }
}
