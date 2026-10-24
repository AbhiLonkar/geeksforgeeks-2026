package geeksforgeeks._04_arrays;

public class _15_PrefixSum {
    // TODO - We're given an integer array, the prefix sum at index i is defined as the sum of all the elements before i and the ith element itself
    // ex. {1,2,3,4,5} -> {1,3,6,10,15}

    // ? Approach we'll iterate through the array, for the currEl we'll add itself and the previous element.
    // ? The previous will store the running sum anyways
    public static int[] prefixSum(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] res = prefixSum(new int[] {1,2,3,4,5});
        for (int i: res){
            System.out.println(i);
        }
    }

}
