package geeksforgeeks._04_arrays;

public class _19_SortedArr {
    public static boolean isArrSorted(int[] arr) {
        boolean res = true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                res = false;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 55, 5};

        System.out.println(isArrSorted(arr1));
        System.out.println(isArrSorted(arr2));
    }
}
