package geeksforgeeks._04_arrays;

public class _20_StockBuyAndSell {
    // TODO - In an array, the elements represent the prices of a stock
    // TODO - We want to maximise profit by buying & selling stock at appropriate prices.
    // ! Note - Multiple Buy and Sell allowed.
    // ex - {3,5,3,5,6,9}, So we buy at 3 then sell at 5 because we notice the price going down after 5. Profit = 5-3 = 2
    // Then we buy again at 3 and keep holding until we reach the peak price ie 9 and sell it there. Profit = 2 + (5-3) + (6-5) + (9-6) = 2+6=8

    // ? Idea - Traverse through every element, check if the next element greater than currEl, if it is then add the diff to the profit.
    // ? If it's less do nothing.

    public static int StockBuyAndSell(int[] arr){
        int profit = 0;
        for (int i = 1; i<arr.length;i++){
            if (arr[i-1] < arr[i]){
                profit+=arr[i]-arr[i-1];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        System.out.println(StockBuyAndSell(new int[] {3,5,3,5,6,9}));
    }
}
