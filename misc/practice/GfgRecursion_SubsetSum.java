public class GfgRecursion_SubsetSum {
    public static int SubsetCounter(int[] arr, int len, int sum){
        if(len==0){
            if(sum==0){
                return 1;
            }
            return 0;
        }
        int count = SubsetCounter(arr, len-1, sum) + SubsetCounter(arr, len-1, sum-arr[len-1]);
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,40};
        int n = arr.length;
        int sum = 40;
        System.out.println(SubsetCounter(arr, n, 10));
    }
}
