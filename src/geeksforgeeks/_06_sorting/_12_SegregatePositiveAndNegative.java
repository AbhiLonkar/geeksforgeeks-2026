package geeksforgeeks._06_sorting;

public class _12_SegregatePositiveAndNegative {
    // TODO - We're given an integer array we have to put all the negative numbers before the positive numbers
    // This is a Sort an array with two types of elements problem

    // ? Approach 1 - Just sort the array and we'll have all the negative numbers before the positive numbers
    // ? Let's implement quicksort because I think that the problem can be solved with one of the partition algo

    public static void hoarePartition(int[] arr, int start, int end) {
        int left = -1, right = end + 1;
        while (true) {
            do {
                left++;
            } while (arr[left] < 0);
            do {
                right--;
            } while (arr[right] > 0);
            if (left >= right) {
                return;
            }
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }
    public static void lomutoPartition(int[] arr, int start, int end){
        int i = -1;
        for (int j = start; j<=end; j++){
            int currEl = arr[j];
            if (currEl < 0){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {-3, -1, 3, 1, -22, -4};
        lomutoPartition(arr, 0, arr.length-1);
        for (int i: arr){
            System.out.println(i);
        }
    }

}
