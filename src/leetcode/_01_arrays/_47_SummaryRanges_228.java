package leetcode._01_arrays;

import java.util.ArrayList;
import java.util.List;

public class _47_SummaryRanges_228 {
    // TODO - Given a sorted integer array, we have to return the ranges of elements that are present in this array
    // ex. nums = [0,1,2,4,5,7] o/p = ["0->2","4->5","7"]
    // ? Lets pick the first number, and set the supposedNextNum as firstNum + 1;
    // ? Now every proceeding element must match this supposedNextNum, if it doesn't then we've found a break in the pattern add the first num and the previousNum to the result
    // ? Now the next first element will be currElement
    public static List<String> summaryRanges(int[] arr){
        int n = arr.length;
        int firstNumOfRange = arr[0];
        int supposedNextNum = firstNumOfRange + 1;
        List<String> res = new ArrayList<>();
        for (int i = 1; i<n; i++){
            if (arr[i] == supposedNextNum){
                supposedNextNum++;
            }
            else {
                if (firstNumOfRange == arr[i-1]){
                    res.add(String.valueOf(firstNumOfRange));
                }
                else {
                    res.add(firstNumOfRange + "->" + arr[i-1]);
                }
                firstNumOfRange = arr[i];
                supposedNextNum = firstNumOfRange +1;
            }
        }
        if (firstNumOfRange == arr[n-1]){
            res.add(String.valueOf(firstNumOfRange));
        }
        else {
            res.add(firstNumOfRange + "->" + arr[n-1]);
        }
        return res;
    }
    public static int ans(int[] arr){
        int count = 0;
        for (int i =2; i<arr.length; i++){
            if ((arr[i-2] + arr[i])*2 == arr[i-1]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(ans(new int[] {-1,-4,-1,4}));
//        System.out.println(summaryRanges(new int[] {0,2,3,4,6,8,9}));
    }
}
