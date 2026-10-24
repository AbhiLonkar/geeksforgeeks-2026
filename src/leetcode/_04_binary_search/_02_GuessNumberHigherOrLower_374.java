package leetcode._04_binary_search;

public class _02_GuessNumberHigherOrLower_374 {
    // TODO - We'll be dealing with an api that'll pick a number, we have to find which number the api picked.
    //  The number will be chosen between 1 and n
    //  The api will return following results -
    //  -1 if our guessed Number is higher than the api picked number (search in left half)
    //  1 if our guess number is lower than the api picked number (search in right half)
    //  0 if we picked right number

    // ? This is a simple binary search problem
    // ? Note we haven't implemented guessNum api
    public static int guessNumber(int n){
        int start = 1;
        int end = n;
        while (start <= end){
            int mid = start + (end-start)/2;
            if (n==mid){
                return mid;
            }
            else if (mid > n) {
                end = mid-1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
