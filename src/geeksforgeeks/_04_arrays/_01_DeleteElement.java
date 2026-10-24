package geeksforgeeks._04_arrays;

public class _01_DeleteElement {
    public static int[] DeleteElement(int[] arr, int el){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == el){
                arr[i] = arr[i+1];
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] res = (DeleteElement(new int[] {1,2,3,4,5}, 3));
        for(int r: res){
            System.out.println(r);
        }
    }
}
