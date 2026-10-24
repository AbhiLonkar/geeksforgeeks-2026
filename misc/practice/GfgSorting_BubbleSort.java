public class GfgSorting_BubbleSort {
    // Comparisons between adjacent element
    // For size n, n-1 array traversals needed
    // No need to compare largest elements for each array traversal
    public static int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped==false){
                break;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] res = bubbleSort(new int[] {3,1,23,14,43,225,2,1});
        for (int i: res){
            System.out.println(i);
        }
    }
}
