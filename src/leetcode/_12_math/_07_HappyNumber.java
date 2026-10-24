package leetcode._12_math;

import java.util.HashSet;
// ! Not completed
public class _07_HappyNumber {
    // TODO - Given a number, extract its digits square them and add them till the number becomes 1.
    // TODO - If it does become 1 return true else false.
    // ex. 19 -> 1^2 + 9^2 = 82 -> 8^2 + 2^2 -> 68 -> 6^2 + 8^2 -> 100 -> 1^2 + 0^2 +0^2 -> 1 So true

    // ? Approach lets try to find the square of the individual digits


    public static int isHappyNumber(int n){
        int sq = 0;
        HashSet<Integer> hs = new HashSet<>();
        while(n>0){
            int lastDigit = n%10;
            sq+=lastDigit*lastDigit;
            n=n/10;
        }
        hs.add(sq);
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isHappyNumber(19));
    }

}
