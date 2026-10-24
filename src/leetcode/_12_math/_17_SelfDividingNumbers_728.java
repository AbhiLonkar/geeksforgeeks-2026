package leetcode._12_math;

import java.util.*;

public class _17_SelfDividingNumbers_728 {
    // TODO Given a range l and r both inclusive we have to return a list which contains all the numbers in this range such that
    // TODO - all the digits of the said number completely divide it

    // ? Sub problem - Extracting the digits of the number. Checking if the digits divide the number and add it to a list if it does.
    // ? Let's write a code where we check if the digits of a number completely divide it

    public static boolean selfDividingHelper(int n){
        int temp = n;
        boolean isDivisible = false;
        while(temp>0){
            int lastDigit = temp%10;
            if (lastDigit==0){
                return false;
            }
            if (n%lastDigit==0){
                isDivisible = true;
            }
            else {
                return false;
            }
            temp = temp/10;
        }
        return isDivisible;
    }

    public static List<Integer> isSelfDividing(int l, int r){
        List<Integer> res = new ArrayList<>();
        for (int i = l; i<=r; i++){
            if (selfDividingHelper(i)){
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(isSelfDividing(47, 85));
    }
}
