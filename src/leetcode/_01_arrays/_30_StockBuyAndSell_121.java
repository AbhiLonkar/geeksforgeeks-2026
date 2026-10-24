package leetcode._01_arrays;

public class _30_StockBuyAndSell_121 {
    // TODO - Given an array of prices find the appropriate time to buy and sell stock to maximise profit, and return profit.
    // ! Note - Only single buy and sell allowed.
    // ex. {7,1,5,3,6,4} buy on 1 and sell on 6, profit = 5

    // ? This is a simple problem of finding the maximum difference between 2 elements present in the array
    // ! TLE Leetcode
    public static int StockBuyAndSell(int[] arr){
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j<arr.length; j++){
                if (arr[j]-arr[i]>profit){
                    profit = arr[j]-arr[i];
                }
            }
        }
        return profit;
    }

    public static int StockBuyAndSellOptimized(int[] arr){
        int maxDiff = arr[1] - arr[0];
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]-minVal>maxDiff){
                maxDiff = arr[i]-minVal;
            }
            if (minVal>arr[i]){
                minVal = arr[i];
            }
        }
        return maxDiff;
    }

    public static void main(String[] args) {
        System.out.println(StockBuyAndSellOptimized(new int[] {7,1,5,3,6,4}));
    }
}
