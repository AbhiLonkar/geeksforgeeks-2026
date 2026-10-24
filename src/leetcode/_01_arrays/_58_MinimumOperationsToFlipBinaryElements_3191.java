package leetcode._01_arrays;

public class _58_MinimumOperationsToFlipBinaryElements_3191 {
    // TODO - Given a binary array, we have to turn it into an array of only element 1
    //  How we're supposed to do this - When we find a 0 we have to flip it and next 2 elements as well
    //  This operation counts as 1 operation
    //  The window size is 3
    //  ex. [0,1,1,1,0,0] -> Spot 0 at idx 0 flip it and next 2 elements
    //  [1,0,0,1,0,0] -> Spot 0 at idx 1 flip it and next 2 elements
    //  [1,1,1,0,0,0] -> Spot 1 at idx 2 no need to flip
    //  [1,1,1,0,0,0] -> Spot 0 at idx 3 so flip it and 2 elements as well
    //  [1,1,1,1,1,1] -> Since we need window of 3 elements we've reached the end and can return the count

    public static void flipBits(int[] arr, int i){
        arr[i] = arr[i] == 0 ? 1 : 0;
    }
    public static int minOperations(int[] arr){
        int count = 0;
        int n = arr.length;
        for (int i = 0; i<n-2; i++){
            if (arr[i]==0){
                flipBits(arr,i);
                flipBits(arr,i+1);
                flipBits(arr,i+2);
                count++;
            }
        }
        if (arr[n-1] == 0 || arr[n-2]==0){
            return -1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(minOperations(new int[] {0,1,1,1,0,0}));
    }

}
