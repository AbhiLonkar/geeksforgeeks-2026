package leetcode._01_arrays;

public class _01_ApplyOpsAndMoveZeros {
    // Given an array, check if the [i+1]th element is double of ith element, if it is then multiply the ith element by 2 and
    // make [i+1]th element = 0 and then move all the zeros to the end.

    // ? Idea - Basic iteration through the loop check the consecutive elements, and then perform the relevant changes to the
    // ? elements if the conditions are met and then just move the zeros to the end.

    public static int[] ApplyOperationsAndMoveZeros(int[] arr){
        int len = arr.length;
        for (int i = 0; i < len-1; i++) {
            if(arr[i]==arr[i+1]){
                arr[i] = 2*arr[i];
                arr[i+1] = 0;
            }
        }
        int nonZeroPos = 0;
        for(int i = 0; i<len; i++){
            if(arr[i]!=0){
                int temp = arr[nonZeroPos];
                arr[nonZeroPos] = arr[i];
                arr[i] = temp;
                nonZeroPos++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] res = ApplyOperationsAndMoveZeros(new int[] {1,2,2,1,1,0});
        for(int i: res){
            System.out.println(i);
        }
    }
}
