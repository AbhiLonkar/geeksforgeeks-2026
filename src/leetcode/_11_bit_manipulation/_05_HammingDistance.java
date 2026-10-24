package leetcode._11_bit_manipulation;

public class _05_HammingDistance {
    // Hamming distance between 2 numbers of equal length is the count of different bits at the same position
    // 8 - 0100
    // 6 - 0110
    // d = 1, second bit from the lsb

    // thinking - I know that xor between 2 same bits is always 0 & 2 unequal bits is 1
    // 8 - 0100 XOR
    // 6 - 0110
    // r = 0010
    // So try doing xor of the 2 given numbers and then count the number of set bits.

    public static int hammingDistance(int num1, int num2){
        int res = num1 ^ num2;
        int count = 0;
        while(res>0){
            res=res&(res-1);
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(hammingDistance(10,29));
    }

}
