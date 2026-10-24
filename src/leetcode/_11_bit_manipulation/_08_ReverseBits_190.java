package leetcode._11_bit_manipulation;

public class _08_ReverseBits_190 {
    // TODO Given a number reverse its bits.
    // ex 4 = 000...0100, its reverse will be the rightmost significant bit ie 3rd position will be moved to 3rd position from the left
    // Using brian karingham's algorithm, isolate the right most bit, store its position in a variable and then right shift 1 by these many positions
    public static int ReverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            result |= ((n & 1) << (31 - i));
            n >>>= 1;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
