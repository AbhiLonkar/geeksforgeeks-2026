package geeksforgeeks._02_bit_magic;

public class _05_OddTwoOccuring {
    public static void Number_Count(int[] arr, int n){
//        O(n2) Time cmplxty
//        for(int i=0;i<n;i++){
//            int count = 0;
//            for(int j=0;j<n;j++){
//                if(arr[i]==arr[j]){
//                    count++;
//                }
//            }
//            if(count%2==1){
//                System.out.println(arr[i]);
//            }
//        }

//        int res = arr[0];
//        for (int i = 1; i < n; i++) {
//            res = res ^ arr[i];
//        }
//        // Isolating the right most set bit
//        // Through this I get a number k which has only 1 set bit, which is at the same position as the rightmost set bit of res.
//        int k = (res&(~(res-1)));  // arr = [5,2,2,6], res = 5(101) ^ 6(110) = 3(011)
//        res = 011, res-1 = 010, ~res-1 = 101,
//        k = 011 & 101 = 001; ie right most set but isolated
//        Now we compare with 5(101), 6(110). 5 has matching rightmost bit with k. So create a group with 1st set bit from right
//        int res1=0, res2=0;
//        for (int i = 0; i < n; i++) {
//            if((k&arr[i])!=0){
//                res1 = res1 ^ arr[i];
//            }
//            else {
//                res2 = res2 ^ arr[i];
//            }
//        }
//        System.out.println(res1);
//        System.out.println(res2);

        int res = arr[0];
        for(int i = 1; i<n;i++){
            res = res ^ arr[i];
        }
        int k = (res&(~(res-1)));
        int res1=0, res2=0;
        for(int i=0;i<n;i++){
            if((k&arr[i])!=0){
                res1 = res1^arr[i];
            }
            else {
                res2 = res2^arr[i];
            }
        }
        System.out.println(res1);
        System.out.println(res2);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3};
        Number_Count(arr, arr.length);
    }
}

// A set bit in res means that the 2 numbers who XOR'ed that res have opposite bits at that position