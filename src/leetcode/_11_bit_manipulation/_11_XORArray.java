package leetcode._11_bit_manipulation;

public class _11_XORArray {
    public static int xorOperation(int n, int start){
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = start + 2*i;
        }
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(xorOperation(4,3));
    }
}
