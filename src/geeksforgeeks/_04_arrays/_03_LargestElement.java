package geeksforgeeks._04_arrays;

public class _03_LargestElement {
    public static int LargestElement(int[] arr){
        int largestEl = arr[0];
        for(int i = 1;i<arr.length;i++){
            // largestEl = Math.max(largestEl, arr[i])
            if(largestEl<arr[i]){
                largestEl = arr[i];
            }
        }
        return largestEl;
    }
    public static void main(String[] args) {
        int[] arr = {1,122,3,4,4545,6,66};
        int[] arr1 = {1};
        System.out.println(LargestElement(arr));
        System.out.println(LargestElement(arr1));
    }
}
