package geeksforgeeks._04_arrays;

public class _06_LeftRotateByOne {
    // Todo - Given an integer array move the first element to the last and move the following elements forward by one position
    // ex - {1,2,3,4,5} -> {2,3,4,5,1}

    // ? Idea - Just think about shifting each element besides 1st element by 1 pos.
    // ? How - Iterate through the arr, just make the (i-1)th element equal to ith element.
    // ? And then just put the first element at the last pos.
    public static int[] LeftRotate(int[] arr, int n){
        int firstEl = arr[0];
        for(int i = 0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = firstEl;
        return arr;
    }
    public static void main(String[] args) {
        int[] res = LeftRotate(new int[] {1,2,3,4,5}, 5);
        for(int i: res){
            System.out.println(i);
        }
    }
}
