package leetcode._01_arrays;

// TODO The code can be improved
import java.util.Arrays;

public class _04_DistinctIntegerAfterReversal {
    // * Given an array, add the reversed elements into this array and then return the count of how many of the elements are distinct.
    // * ie return how many unique elements of this array

    // I think that the reversal and adding section is easy but what would be an efficient way to count the unique elements of the array

    // ! 1st - Loop through the array, when we encounter it's first occurrence increment the count.
    // ! but for anymore occurrences, don't increment the count.
    // ! 2. Removing duplicate entries in an array

    // ? Had problem implementing the above code thing
    // ? But learnt to just shifting the unique elements to the start of the array.

    // * To better visualize the algo - https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public+class+ClassNameHere+%7B%0A+++public+static+void+main(String%5B%5D+args)+%7B%0A++++++int%5B%5D+res+%3D+new+int%5B%5D+%7B1,+1,+1,+10,+12,+13,+13,+21,+31,+31%7D%3B%0A++++++++int+k+%3D+0%3B%0A++++++++for(int+i+%3D+1%3B+i%3Cres.length%3Bi%2B%2B)%7B%0A++++++++++++if(res%5Bi%5D!%3Dres%5Bk%5D)%7B%0A++++++++++++++++k%2B%2B%3B%0A++++++++++++++++res%5Bk%5D+%3D+res%5Bi%5D%3B%0A++++++++++++%7D%0A++++++++%7D%0A++++++++System.out.println(k%2B1)%3B%0A+++%7D%0A%7D&mode=display&curInstr=44

    public static int Counter(int[] arr) {
        int[] res = Arrays.copyOf(arr, arr.length * 2);
        int j = 0;
        for (int i = arr.length; i < res.length; i++) {
            res[i] = Reversal(arr[j]);
            j++;
        }
        Arrays.sort(res);
        int k = 0;
        for (int i = 1; i < res.length; i++) {
            if (res[i] != res[k]) {
                k++;
                res[k] = res[i];
            }
        }
        return k + 1;
    }

    public static int Reversal(int n) {
        int res = 0;
        while (n > 0) {
            int r = n % 10;
            res = res * 10 + r;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 13, 10, 12, 31};
        System.out.println(Counter(arr1));
    }
}
