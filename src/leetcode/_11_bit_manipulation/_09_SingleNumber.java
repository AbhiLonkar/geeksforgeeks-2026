package leetcode._11_bit_manipulation;

import java.sql.Array;

public class _09_SingleNumber {
    // The basic logic behind this is that when we do an XOR of a number with itself we get 0.
    // and when we do XOR of a number with 0 we get that number itself.
    // So even xor's of a number with itself will always give 0 and odd xor's will always give the number itself.

    public static int singleNumber(int[] arr){
        int res = arr[0];
        for(int i = 1; i<arr.length; i++){
            res = res ^ arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] numArray = {1};
        System.out.println(singleNumber(numArray));
    }
}
