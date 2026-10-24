package geeksforgeeks._03_recursion;

public class _11_SubsetSumProblem {
    // Problem - given an array and sum we have to return how many subsets of the array elements we can form to get the given sum.
    // ex. arr = [10,20,20,30,40] sum = 40, the subsets are - [10,30], [40] & [20,20]
    // so count = 3 ie 3 subsets
    public static int SubsetSumCounter(int[] arr, int n, int sum) {
        if(n==0){       // ie we've reached the last element of the array
            return sum==0? 1: 0; // this checks whether the sum has reached value of zero for a particular branch and if it has reached 0 then 1 else 0;
        }
        // SubsetSumCounter(arr, n-1, sum) - exclude the element & keep the sum.
        // SubsetSumCounter(arr, n-1, sum-arr[n-1]) - include the element but the decrement the sum by that element
        int count = SubsetSumCounter(arr, n-1, sum) + SubsetSumCounter(arr, n-1, sum-arr[n-1]); // this keeps the count of the branches that have sum = 0;
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,40};
        int n = arr.length;
        int sum = 40;
        System.out.println(SubsetSumCounter(arr, n, 30));
    }
}
