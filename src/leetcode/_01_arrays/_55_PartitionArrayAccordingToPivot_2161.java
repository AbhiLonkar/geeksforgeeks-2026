package leetcode._01_arrays;

import java.util.ArrayList;

public class _55_PartitionArrayAccordingToPivot_2161 {
    // TODO - Given an array and a pivot we have rearrange the elements such that the elements lesser than pivot are on its left side
    //  and elements greater than pivot on its right side

    // ? This can be done using partition algo but first lets try to solve it in brute force way
    // ? Approach - Create 2 arrays one which stores elements lesser than equal to pivot
    // ? The other which stores elements greater than pivot then simply merge these two arrays
    // ! Lots of extra space and unnecessary iterations
    public static int[] partitionElements(int[] arr, int pivot){
        int n = arr.length;
        int[] res = new int[n];
        int idx = 0;
        for (int i: arr){
            if (i < pivot){
                res[idx] = i;
                idx++;
            }
        }
        for (int i: arr){
            if (i == pivot){
                res[idx] = i;
                idx++;
            }
        }
        for (int i: arr){
            if (i>pivot){
                res[idx] = i;
                idx++;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] res = partitionElements(new int[] {9,12,5,10,14,3,10}, 10);
        for (int i: res){
            System.out.println(i);
        }
    }

}
