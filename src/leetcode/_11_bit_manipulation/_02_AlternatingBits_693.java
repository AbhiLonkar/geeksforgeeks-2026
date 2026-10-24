package leetcode._11_bit_manipulation;

public class _02_AlternatingBits_693 {
    // Check if a number has alternating bits - 10 = 1010(true) 1111(false)
    // Trying to do XOR of that number with itself but right shifted by 1
    // Noticed that for numbers which had alternating bits, the result of the XOR operation only contained 1's.
    // Learnt - How to work with a number that only has 1 in its binary representation
    public static boolean hasAlternatingBits(int n){
        int x = n ^ (n>>1); // for n = 5, x = 111
        int y = x+1; // y = 1000, When we do +1 all the 1 bits will be converted to 0 and a bit 1 will be added to the left
        int res = x & y; // res = 0000
        return (x&y)==0; // true for n=5
    }
    public static void main(String[] args) {
        System.out.println(hasAlternatingBits(0));
    }
}
