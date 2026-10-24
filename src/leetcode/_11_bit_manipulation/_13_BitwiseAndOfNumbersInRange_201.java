package leetcode._11_bit_manipulation;

public class _13_BitwiseAndOfNumbersInRange_201 {
    // TODO - Given a range we have to return the bitwise and of all these numbers inclusive of ranges
    // ex. 5 to 7
    // 5 -> 0101
    // 6 -> 0110
    // & -> 0100
    // 7 -> 0111
    // & -> 0100 -> 4
    // So output is 4

    // ? Approach - Do direct bitwise and for all numbers in range
    // ! TLE
    public static int bitwiseAndOfNumbers(int left, int right){
        if (left == 0 || right == 0){
            return 0;
        }
        if (left == right){
            return left;
        }
        int res = left;
        for (int i = left+1; i > 0 && i<=right; i++){
            res &= i;
            if (res == 0){
                return 0;
            }
        }
        return res;
    }

    // ? Lets try to find a pattern
    // ? Obs 1 - When any input is 0 the result will be 0 the result will be 0
    // ? Obs 2 - If at any point the bitwise operation produces 0 then the result will always be 0
    // ? Obs 3 -
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(bitwiseAndOfNumbers(268435456,2147483647));
        System.out.println(4&3);
    }
}

// 2147483646 -> 01111111 11111111 11111111 11111110
// 2147483647 -> 01111111 11111111 11111111 11111111
