package geeksforgeeks._02_bit_magic;

public class _04_OddOneOccuring {
    public static int Counter(int[] arr, int n){
//        Time complexity of O(n^2)
//        for(int i=0;i<n;i++){
//            int count = 0;
//            for(int j=i;j<n;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if(count%2==1){
//                return arr[i];
//            }
//        }
//        return 0;

//    Using XOR
//    An XOR of a number with itself odd times is the number itself & even times is 0
//        The basic logic is that we're doing xor of all the elements of the array
//        eg - 3^7^3^3^7 = 3^3^3^7^7(cummutative) = 0^3^0 = 3
//        Time complexity is O(n) & aux space = O(1)
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            res = res ^ arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,18,7,7,7,3,3,7};
        System.out.println(Counter(arr, 7));
    }
}
