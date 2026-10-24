package geeksforgeeks._06_sorting;

import java.util.Collections;

public class _06_LomutoPartition {
    // TODO Given a low index & high index we have to position the last(pivot) element in the array such
    // TODO elements on its left are smaller than or equal to it & elements on its right are greater than it.
    // ! We aren't trying to sort the array in any way
    // ex. {1,42,4,65,13,5} l = 0, h = 5, pivotIdx = 5, o/p -> {1,3,5,42,65,13}

    // ? Lomuto Partition - Here we use 2 pointers, first pointer denotes the length of the window of smaller elements
    // ? And second pointer is the one which we use to traverse the array
    // ? Initially the smaller element window has no elements, when we encounter a  element smaller than the pivot element we need to create space
    // ? So pointer is incremented before we place the element
    // ? We repeat this process till high - 1 (second last element)
    // ? For the high index (pivot) we simply swap the (i+1)th with the last element
    // * Time - O(n) Space - O(1)

    // ? Extra - how to handle when pivot isn't the last el?
    // -> Swap the pivot & last el. arr[pivot] = arr[arr.length-1]

    public static int[] lomutoPartition(int[] arr) {
        int low = 0;
        int pivotIdx = arr.length - 1;
        int i = low - 1;
        for (int j = low; j < pivotIdx; j++) {
            if (arr[j] <= arr[pivotIdx]) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Putting pivot at correct position after complete array traversal
        int temp = arr[i + 1];
        arr[i + 1] = arr[pivotIdx];
        arr[pivotIdx] = temp;
        return arr;
    }

    public static void main(String[] args) {
        // In this corner case, where all els on its left are smaller anyways, it'll still do the swapping till high - 1
        // And after the traversal i will be at high - 1 pos and it'll swap the pivot el with itself
        int[] res = lomutoPartition(new int[]{10, 20, 30});
        for (int i : res) {
            System.out.println(i);
        }
        // In this corner case, where all els on its left are greater, it wont do the swapping i will remain at -1
        // And after the traversal it'll swap the pivot el with first element
        int[] res2 = lomutoPartition(new int[]{10, 20, 30, 5});
        for (int i : res2) {
            System.out.println(i);
        }
        System.out.println("--------------");
        int[] res3 = lomutoPartition(new int[]{9, 12, 5, 10, 14, 3, 10});
        for (int i : res3) {
            System.out.println(i);
        }
    }

}
